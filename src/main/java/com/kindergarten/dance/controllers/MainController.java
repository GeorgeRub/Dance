package com.kindergarten.dance.controllers;

import com.kindergarten.dance.model.IndexSettings;
import com.kindergarten.dance.services.CoachService;
import com.kindergarten.dance.services.IndexSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class MainController {

    @Autowired
    private IndexSettingsService indexSettingsService;

    @Autowired
    private CoachService coachService;

    public void addModel(Model model) {
        IndexSettings settings = indexSettingsService.getFirst();
        model.addAttribute("phone", settings.getPhone());
        model.addAttribute("address", settings.getAdress());
        model.addAttribute("coaches", coachService.getAllActive());
    }

}
