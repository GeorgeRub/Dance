package com.kindergarten.dance.controllers.admin

import com.kindergarten.dance.model.Settings
import com.kindergarten.dance.services.SettingsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/admin/settings")
class SettingsAdminController {

    @Autowired
    lateinit var settingsService: SettingsService

    @RequestMapping("/list")
    fun settingsLIst(model: Model): String {
        model.addAttribute("settings", settingsService.all)
        return "admin/settings/settingsList"
    }

    @RequestMapping("/edit/{id}")
    fun editSet(model: Model, @PathVariable id: Long): String {
        var set = settingsService.findById(id)
//        return if (set != null) {
        model.addAttribute("setting", set)
        return "admin/settings/editSet"
//        } else {
//            "404"
//        }
    }

}
