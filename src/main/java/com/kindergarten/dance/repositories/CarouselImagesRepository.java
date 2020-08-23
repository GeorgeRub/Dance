package com.kindergarten.dance.repositories;

import com.kindergarten.dance.model.CarouselImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarouselImagesRepository extends JpaRepository<CarouselImages, Long> {
    @Query("select c from CarouselImages c where c.deleted = 0")
    List<CarouselImages> getAllActiveImages();
}
