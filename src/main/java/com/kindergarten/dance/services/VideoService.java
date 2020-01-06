package com.kindergarten.dance.services;

import com.kindergarten.dance.model.Video;
import com.kindergarten.dance.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    public List<Video> findAllActive(){
        return videoRepository.findAllActive();
    }

}
