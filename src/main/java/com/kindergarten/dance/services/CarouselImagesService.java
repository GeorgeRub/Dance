package com.kindergarten.dance.services;

import com.kindergarten.dance.model.CarouselImages;
import com.kindergarten.dance.repositories.CarouselImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarouselImagesService {

    @Autowired
    private CarouselImagesRepository carouselImagesRepository;

    public List<CarouselImages> findAllImages() {
        return carouselImagesRepository.findAll();
    }

    public List<CarouselImages> findAllActiveImages() {
        return carouselImagesRepository.getAllActiveImages();
    }

    public CarouselImages save(CarouselImages images) {
        return carouselImagesRepository.save(images);
    }
}
