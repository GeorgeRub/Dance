package com.kindergarten.dance.services;

import com.kindergarten.dance.model.pages.InnerPagesPhoto;
import com.kindergarten.dance.repositories.InnerPagesPhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InnerPagesPhotoService {

    @Autowired
    private InnerPagesPhotoRepository innerPagesPhotoRepository;

    public InnerPagesPhoto save(InnerPagesPhoto photo) {
        return innerPagesPhotoRepository.save(photo);
    }
}
