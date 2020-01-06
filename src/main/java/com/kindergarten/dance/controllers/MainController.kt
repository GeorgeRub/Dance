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

    fun addModel(model: Model) {
        val settings = indexSettingsService!!.first
        model.addAttribute("phone", settings.phone)
        model.addAttribute("address", settings.adress)
        model.addAttribute("coaches", coachService!!.allActive)
        model.addAttribute("ourHall", ourHallService!!.allActive)
        model.addAttribute("news", newsService!!.lastTwo)
        model.addAttribute("inspirations", inspirationService!!.lastTwo)
        model.addAttribute("costReq", costumeRequirementsService!!.findAllActive())
    }
}