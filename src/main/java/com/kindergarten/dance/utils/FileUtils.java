package com.kindergarten.dance.utils;

import com.kindergarten.dance.model.Settings;
import com.kindergarten.dance.services.SettingsService;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.plugins.jpeg.JPEGImageWriteParam;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.InputStream;

public class FileUtils {

//    public static void uploadPhoto(MultipartFile multipartFile, GalleryBase gallery, String folderName, SettingsService settingsService) {
//        Settings settings =  settingsService.getByName(folderName);
//        String folder = settings.getVal();
//        FolderUtils.fixFolderPath(Paths.get(folder));
//        ImageWriter writer = null;
//        ImageOutputStream imageOut = null;
//        try {
//            String path = folder + multipartFile.getOriginalFilename();
//            InputStream inputStream = multipartFile.getInputStream();
//            BufferedImage bufferedImage = ImageIO.read(inputStream);
//            Integer width = settings.getWidth();
//            if(width != null) bufferedImage = ImageResize.resizeImage(bufferedImage, width);
//            ImageWriteParam iwp = new JPEGImageWriteParam(null);
//            iwp.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
//            iwp.setProgressiveMode(ImageWriteParam.MODE_DEFAULT);
//            iwp.setCompressionQuality(1);
//            writer = ImageIO.getImageWritersBySuffix("jpg").next();
//            imageOut = ImageIO.createImageOutputStream(new File(path));
//            writer.setOutput(imageOut);
//            writer.write(null, new IIOImage(bufferedImage, null, null), iwp);
//            gallery.setPhoto(multipartFile.getOriginalFilename());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try{
//                imageOut.close();
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }
//    }

}
