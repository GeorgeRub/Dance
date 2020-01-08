package com.kindergarten.dance.controllers.admin;

import com.kindergarten.dance.model.pages.Pages;
import com.kindergarten.dance.services.PageCategoryService;
import com.kindergarten.dance.services.PagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/pages")
public class PagesListArticle {

    @Autowired
    private PagesService pagesService;

    @Autowired
    private PageCategoryService pageCategoryService;

    @RequestMapping("/list")
    public String pagesList(Model model) {
        model.addAttribute("pagesList", pagesService.findAll());
        return "admin/pages/pagesList";
    }

    @RequestMapping(value = "/edit/{pageId}",method = RequestMethod.GET)
    public String editPage(Model model, @PathVariable("pageId") Long pageId) {
        Pages page = pagesService.find(pageId);
        if (page != null) {
            System.out.println(page);
            model.addAttribute("page", page);
            model.addAttribute("categories", pageCategoryService.findAll());
            return "admin/pages/create";
        }
        return "404";
    }

    @RequestMapping("/create")
    public String create(Model model){
        model.addAttribute("page", new Pages());
        model.addAttribute("categories", pageCategoryService.findAll());
        return "admin/pages/create";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String savePage(@ModelAttribute Pages page, Model model) {
        if (page != null && page.getId() != null) {
            page = pagesService.update(page);
        }else if(page != null){
            page = pagesService.save(page);
        }else{
            return "403";
        }
        model.addAttribute("page", page);
        return "redirect:/admin/pages/edit/" + page.getId();
    }

}
