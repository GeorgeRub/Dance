package com.kindergarten.dance.controllers.admin;

import com.google.gson.Gson;
import com.kindergarten.dance.model.CarouselImages;
import com.kindergarten.dance.services.CarouselImagesService;
import com.kindergarten.dance.services.SettingsService;
import com.kindergarten.dance.utils.image.ImageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.InputStream;

@Controller
@RequestMapping("/admin/carousel")
public class CarouselController {

    @Autowired
    private CarouselImagesService carouselImagesService;

    @Autowired
    private ImageUtils imageUtils;


    @Autowired
    private SettingsService settingsService;

    @RequestMapping("/list")
    public String carouselList(Model model) {
        model.addAttribute("images", carouselImagesService.findAllImages());
        return "admin/carousel/carouselList";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String carouselAddImage(Model model, @RequestParam("addPhoto") MultipartFile addPhoto) {
        if(addPhoto != null && addPhoto.getOriginalFilename().length() > 2){
            try{
                String path = settingsService.returnValueByName("CAROUSEL");
                imageUtils.fixFolderPath(path);
                InputStream inputStream = addPhoto.getInputStream();
                BufferedImage bufferedImage = ImageIO.read(inputStream);
                if(imageUtils.saveImageInner(path, "jpg", bufferedImage, addPhoto.getOriginalFilename())){
                    CarouselImages images = new CarouselImages();
                    images.setImageName(addPhoto.getOriginalFilename());
                    carouselImagesService.save(images);
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        model.addAttribute("images", carouselImagesService.findAllImages());
        return "admin/carousel/carouselList";
    }

}
