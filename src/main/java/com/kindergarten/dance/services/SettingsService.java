package com.kindergarten.dance.services;

import com.kindergarten.dance.model.Settings;
import com.kindergarten.dance.repositories.SettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SettingsService {

    @Autowired
    private SettingsRepository settingsRepository;

    public String returnValueByName(String name){
        return settingsRepository.findByName(name).getVal();
    }

    public Settings getByName(String path) {
        return settingsRepository.findByName(path);
    }

    public List<Settings> getAll() {
        return settingsRepository.findAll();
    }
}
