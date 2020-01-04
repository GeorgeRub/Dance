package com.kindergarten.dance.services;

import com.kindergarten.dance.model.pages.Pages;
import com.kindergarten.dance.repositories.PagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagesService {

    @Autowired
    private PagesRepository pagesRepository;

    public Pages getByUrl(String url){
        return pagesRepository.findByUrl(url);
    }

}
