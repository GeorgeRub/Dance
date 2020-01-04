package com.kindergarten.dance.services;

import com.kindergarten.dance.model.IndexSettings;
import com.kindergarten.dance.repositories.IndexSettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexSettingsService {

    @Autowired
    private IndexSettingsRepository indexSettingsRepository;

    public IndexSettings getFirst(){
        return indexSettingsRepository.getOne(1l);
    }

}
