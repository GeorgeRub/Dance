package com.kindergarten.dance.controllers.admin;

import com.kindergarten.dance.model.pages.Pages;
import com.kindergarten.dance.services.PageCategoryService;
import com.kindergarten.dance.services.PagesService;
import com.kindergarten.dance.utils.FileUtils;
import com.kindergarten.dance.utils.image.ImageResize;
import com.kindergarten.dance.utils.image.ImageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/admin/pages")
public class PagesListArticleController {

    @Autowired
    private PagesService pagesService;

    @Autowired
    private PageCategoryService pageCategoryService;
    @Autowired
    private ImageUtils imageUtils;

    @RequestMapping("/list")
    public String pagesList(Model model) {
        model.addAttribute("pagesList", pagesService.findAll());
        return "admin/pages/pagesList";
    }

    @RequestMapping(value = "/edit/{pageId}", method = RequestMethod.GET)
    public String editPage(Model model, @PathVariable("pageId") Long pageId) {
        Pages page = pagesService.find(pageId);
        if (page != null) {
//            System.out.println(page);
            model.addAttribute("page", page);
            model.addAttribute("categories", pageCategoryService.findAll());
            return "admin/pages/create";
        }
        return "404";
    }

    @RequestMapping("/create")
    public String create(Model model) {
        model.addAttribute("page", new Pages());
        model.addAttribute("categories", pageCategoryService.findAll());
        return "admin/pages/create";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String savePage(@ModelAttribute Pages page, Model model, @RequestParam("image") MultipartFile image) {
        if (image != null && image.getOriginalFilename().length() > 2) {
            if (imageUtils.saveImage(image, "PAGE_FOLDER")) {
                page.setSmallPhoto(image.getOriginalFilename());
            }
        }
        if (page != null && page.getId() != null) {
            page = pagesService.update(page);
        } else if (page != null) {
            page = pagesService.save(page);
        } else {
            return "403";
        }
        model.addAttribute("page", page);
        return "redirect:/admin/pages/edit/" + page.getId();
    }

}
