package com.kindergarten.dance.controllers.admin

import com.kindergarten.dance.services.UsersService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/admin")
class IndexAdminController {

    @Autowired
    lateinit var usersService: UsersService

    @RequestMapping("/")
    fun index(): String {
        println(usersService.allUsers);
        return "admin/index";
    }


}