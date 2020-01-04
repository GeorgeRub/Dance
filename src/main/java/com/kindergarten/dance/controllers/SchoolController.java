package com.kindergarten.dance.controllers;

import com.kindergarten.dance.services.PagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private PagesService pagesService;

    @Autowired
    private MainController mainController;

    @RequestMapping("/{kind}")
    public String kindOfSchool(@PathVariable("kind") String kind, Model model) {
        mainController.addModel(model);
        model.addAttribute("page", pagesService.getByUrl(kind));
//        System.out.println(kind);
        return "sportDancing";
    }


}
