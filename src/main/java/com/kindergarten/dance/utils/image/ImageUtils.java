package com.kindergarten.dance.utils.image;

import com.kindergarten.dance.model.Settings;
import com.kindergarten.dance.services.SettingsService;
//import com.kindergarten.dance.utils.FileUtils;
import com.kindergarten.dance.utils.FolderUtils;
import com.kindergarten.dance.wrappers.ImageSizeWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.plugins.jpeg.JPEGImageWriteParam;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.List;

@Service
public class ImageUtils {

    @Autowired
    private SettingsService settingsService;

    /**
     * @param image
     * @param folderKey
     * @return
     */
    public boolean saveImage(MultipartFile image, String folderKey, Long obId, String sceneryKey) {
        Settings settings = settingsService.getByName(folderKey);
        if (settings != null) {
            try {
                String folder = settings.getVal();
                InputStream inputStream = image.getInputStream();
                BufferedImage bufferedImage = ImageIO.read(inputStream);
                String path = folder + image.getOriginalFilename();
                String suffix = "jpg";
                List<ImageSizeWrapper> wrapper = null;
                switch (sceneryKey) {
                    case "index":
                        wrapper = settings.getIndexPhotoWrapper();
                        processWrapper(wrapper, bufferedImage, image, folder, obId, suffix);
                        break;
                    case "mainPhoto":
                        wrapper = settings.getMainPhotoWrapper();
                        processWrapper(wrapper, bufferedImage, image, folder, obId, suffix);
                        break;
                    case "textPhoto":
                        wrapper = settings.getTextPhotoWrapper();
                        processWrapper(wrapper, bufferedImage, image, folder, obId, suffix);
                        break;
                    case "directionPhoto":
                        wrapper = settings.getDirectionPhotoWrapper();
                        processWrapper(wrapper, bufferedImage, image, folder, obId, suffix);
                        break;
                    default:
                        fixFolderPath(path);
                        saveImageInner(path, suffix, bufferedImage, image.getOriginalFilename());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
        return false;
    }

    /**
     * @param wrapper
     * @param bufferedImage
     * @param image
     * @param path
     * @param obId
     * @param suffix
     */
    private void processWrapper(List<ImageSizeWrapper> wrapper, BufferedImage bufferedImage, MultipartFile image, String path, Long obId, String suffix) {
        if (wrapper != null && !wrapper.isEmpty()) {
            for (ImageSizeWrapper sizeWrapper : wrapper) {
                String newPath = path + obId + File.separator;
                if (sizeWrapper.getWidth() != null && sizeWrapper.getHeight() != null) {
                    bufferedImage = new CropImageUtil().cropImage(bufferedImage, sizeWrapper.getWidth(), sizeWrapper.getHeight());
                    bufferedImage = ImageResize.resizeImage(bufferedImage, sizeWrapper.getWidth());
                    newPath += sizeWrapper.getWidth() + "x" + sizeWrapper.getHeight() + File.separator;
                } else if (sizeWrapper.getWidth() != null) {
                    bufferedImage = ImageResize.resizeImage(bufferedImage, sizeWrapper.getWidth());
                    newPath += sizeWrapper.getWidth() + File.separator;
                }
                saveImageInner(newPath, suffix, bufferedImage, image.getOriginalFilename());
            }
        }
    }

    /**
     * @param path
     * @param suffix
     * @param bufferedImage
     * @param fileName
     * @return
     */
    public boolean saveImageInner(String path, String suffix, BufferedImage bufferedImage, String fileName) {

        ImageOutputStream imageOut = null;
        try {
            FolderUtils.fixFolderPath(Paths.get(path));
            ImageWriteParam iwp = new JPEGImageWriteParam(null);
            iwp.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
            iwp.setProgressiveMode(ImageWriteParam.MODE_DEFAULT);
            iwp.setCompressionQuality(0.8f);
            ImageWriter writer = ImageIO.getImageWritersBySuffix(suffix).next();
            imageOut = ImageIO.createImageOutputStream(new File(path + fileName));
            writer.setOutput(imageOut);
            writer.write(null, new IIOImage(bufferedImage, null, null), iwp);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                imageOut.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void fixFolderPath(String path) {
        String directoryName = path.concat(this.getClass().getName());
        File directoryFile = new File(directoryName);
        if (!directoryFile.exists()) {
            directoryFile.mkdir();
        }
    }

}
