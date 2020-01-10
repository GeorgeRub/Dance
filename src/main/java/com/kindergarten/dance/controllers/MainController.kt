package com.kindergarten.dance.controllers

import com.kindergarten.dance.services.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.ui.Model

@Service
class MainController {
    @Autowired
    lateinit var indexSettingsService: IndexSettingsService
    @Autowired
    lateinit var coachService: CoachService
    @Autowired
    lateinit var ourHallService: OurHallService
    @Autowired
    lateinit var newsService: NewsService
    @Autowired
    lateinit var inspirationService: InspirationService
    @Autowired
    lateinit var costumeRequirementsService: CostumeRequirementsService
    @Autowired
    lateinit var videoService: VideoService
    @Autowired
    lateinit var pagesService: PagesService

    fun addModel(model: Model) {
        val settings = indexSettingsService!!.first
        model.addAttribute("phone", settings.phone)
        model.addAttribute("address", settings.adress)
        model.addAttribute("coaches", pagesService!!.getAllActiveCoaches())
        model.addAttribute("ourHall", pagesService!!.getAllActiveOurHall())
        model.addAttribute("news", pagesService!!.getAllActiveNewslastTwo())
        model.addAttribute("inspirations",  pagesService!!.getAllActiveInspirations())
        model.addAttribute("costReq", pagesService!!.findAllActiveCostumeRequirements())
        model.addAttribute("video", videoService.findAllActive())
    }
}