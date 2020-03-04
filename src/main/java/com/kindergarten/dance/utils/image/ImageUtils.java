package com.kindergarten.dance.utils.image;

import com.kindergarten.dance.model.Settings;
import com.kindergarten.dance.services.SettingsService;
import com.kindergarten.dance.utils.FolderUtils;
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
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class ImageUtils {

    @Autowired
    private SettingsService settingsService;

    /**
     * @param image
     * @param folderKey
     * @return
     */
    public boolean saveImage(MultipartFile image, String folderKey) {
        Settings settings = settingsService.getByName(folderKey);
//        System.out.println("settings -> " + settings.toString());
        if (settings != null) {
            ImageWriter writer = null;
            ImageOutputStream imageOut = null;
            try {
                String folder = settings.getVal();
                InputStream inputStream = image.getInputStream();
                BufferedImage bufferedImage = ImageIO.read(inputStream);
                String path = folder + image.getOriginalFilename();
                FolderUtils.fixFolderPath(Paths.get(folder));
//                Integer width = settings.getWidth();
//                System.out.println("width -> " + width);
                if (settings.getWidth() != null && settings.getHeight() != null)
                    bufferedImage = new CropImageUtil().cropImage(bufferedImage, settings.getWidth(), settings.getHeight());
                if (settings.getWidth() != null)
                    bufferedImage = ImageResize.resizeImage(bufferedImage, settings.getWidth());
                ImageWriteParam iwp = new JPEGImageWriteParam(null);
                iwp.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
                iwp.setProgressiveMode(ImageWriteParam.MODE_DEFAULT);
                iwp.setCompressionQuality(1);
                writer = ImageIO.getImageWritersBySuffix("jpg").next();
                imageOut = ImageIO.createImageOutputStream(new File(path));
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
        return false;
    }

}
