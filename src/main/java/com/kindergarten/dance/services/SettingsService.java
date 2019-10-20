package com.kindergarten.dance.services;

import com.kindergarten.dance.repositories.SettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingsService {

    @Autowired
    private SettingsRepository settingsRepository;

    public String returnValueByName(String name){
        return settingsRepository.findByName(name).getVal();
    }

}
