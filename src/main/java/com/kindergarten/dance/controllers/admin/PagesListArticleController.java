package com.kindergarten.dance.controllers.admin;

import com.kindergarten.dance.model.pages.InnerPagesPhoto;
import com.kindergarten.dance.model.pages.Pages;
import com.kindergarten.dance.services.InnerPagesPhotoService;
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

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin/pages")
public class PagesListArticleController {

    @Autowired
    private PagesService pagesService;

    @Autowired
    private PageCategoryService pageCategoryService;

    @Autowired
    private ImageUtils imageUtils;

    @Autowired
    private InnerPagesPhotoService innerPagesPhotoService;

    @RequestMapping("/list")
    public String pagesList(Model model) {
        model.addAttribute("pagesList", pagesService.findAll());
        return "admin/pages/pagesList";
    }

    @RequestMapping(value = "/edit/{pageId}", method = RequestMethod.GET)
    public String editPage(Model model, @PathVariable("pageId") Long pageId) {
        Pages page = pagesService.find(pageId);
        if (page != null) {
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
    public String savePage(@ModelAttribute Pages page, Model model,
                           @RequestParam("indexPhotoHtml") MultipartFile indexPhotoHtml,
                           @RequestParam("mainPhotoHtml") MultipartFile mainPhotoHtml,
                           @RequestParam("textPhotoHtml") MultipartFile[] textPhotoHtml
    ) {

        System.out.println(page.toString());

        if (indexPhotoHtml != null && indexPhotoHtml.getOriginalFilename().length() > 2) {
            if (page != null && page.getId() != null) {
                if (imageUtils.saveImage(indexPhotoHtml, "PAGE_FOLDER", page.getId(), "index")) {
                    page.setSmallPhoto(indexPhotoHtml.getOriginalFilename());
                }
            }
        }

        if (mainPhotoHtml != null && mainPhotoHtml.getOriginalFilename().length() > 2) {
            if (page != null && page.getId() != null) {
                if (imageUtils.saveImage(mainPhotoHtml, "PAGE_FOLDER", page.getId(), "mainPhoto")) {
                    page.setMainPhoto(mainPhotoHtml.getOriginalFilename());
                }
            }
        }
        if (textPhotoHtml != null && textPhotoHtml.length > 0) {
            for (MultipartFile file : textPhotoHtml) {
                if (file != null && file.getOriginalFilename().length() > 2) {
                    if (page != null && page.getId() != null) {
                        if (imageUtils.saveImage(file, "PAGE_FOLDER", page.getId(), "textPhoto")) {
                            List<InnerPagesPhoto> textP = page.getInnerPagesPhotos();
                            if (textP == null)
                                textP = new ArrayList<>();
                            InnerPagesPhoto photo = new InnerPagesPhoto(page, file.getOriginalFilename());
                            photo = innerPagesPhotoService.save(photo);
                            if (photo != null && photo.getId() != null) {
                                textP.add(photo);
                            }
                            page.setInnerPagesPhotos(textP);
                        }
                    }
                }
            }
        }

        System.out.println(page.toString());

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
