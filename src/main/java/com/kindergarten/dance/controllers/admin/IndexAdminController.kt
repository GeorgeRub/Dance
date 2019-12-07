package com.kindergarten.dance.controllers.admin

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/admin")
class IndexAdminController {

    @RequestMapping("/")
    fun index(): String {
        return "admin/index";
    }


}