package com.kindergarten.dance.controllers

import com.kindergarten.dance.services.CarouselImagesService
import com.kindergarten.dance.services.PagesService
import com.kindergarten.dance.services.SettingsService
import com.kindergarten.dance.services.UsersService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class IndexController {

    @Autowired
    lateinit var usersService: UsersService

    @Autowired
    lateinit var mainController: MainController

    @Autowired
    lateinit var settingsService: SettingsService

    @Autowired
    lateinit var pagesService: PagesService

    @Autowired
    lateinit var carouselService: CarouselImagesService

    @RequestMapping("/")
    fun index(model: Model): String {
        mainController.addModel(model)
        model.addAttribute("coaches", pagesService.getAllActiveCoaches())
        model.addAttribute("ways", pagesService.findAllForIndex())
        model.addAttribute("directions", pagesService.findAllDirections())
        model.addAttribute("image", settingsService.returnValueByName("RESOURCES_FOLDER"))
        model.addAttribute("carouselImages", carouselService.findAllActiveImages())
        return "index"
    }

    @RequestMapping("/page/{url}")
    fun showPage(model: Model, @PathVariable url: String): String {
        mainController.addModel(model)
        model.addAttribute("page", pagesService.getByUrl(url));
        return "showPage";
    }

    @RequestMapping("/login")
    fun login() = "login"

    @RequestMapping("/logout")
    fun logout() = "index"

    @RequestMapping("/403")
    fun _403() = "403"

    @RequestMapping("/404")
//    @ExceptionHandler(NotFoundException.class)
    fun notFound() = "404"


}