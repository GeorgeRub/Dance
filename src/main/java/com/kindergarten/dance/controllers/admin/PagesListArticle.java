package com.kindergarten.dance.controllers.admin;

import com.kindergarten.dance.model.pages.Pages;
import com.kindergarten.dance.services.PagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/pages")
public class PagesListArticle {

    @Autowired
    private PagesService pagesService;

    @RequestMapping("/list")
    public String pagesList(Model model) {
        model.addAttribute("pagesList", pagesService.findAll());
        return "admin/pages/pagesList";
    }

    @RequestMapping("/edit/{pageId}")
    public String editPage(Model model, @PathVariable("pageId") Long pageId){
        Pages page = pagesService.find(pageId);
        return "admin/pages/create";
    }

}
