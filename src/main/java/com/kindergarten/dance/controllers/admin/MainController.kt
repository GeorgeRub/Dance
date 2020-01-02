package com.kindergarten.dance.controllers.admin

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.ConcurrentModel
import org.springframework.ui.Model

open class MainController {

    constructor(model: Model) {
        model.addAttribute("address", "ad")
        model.addAttribute("phone", "ph")
    }
}