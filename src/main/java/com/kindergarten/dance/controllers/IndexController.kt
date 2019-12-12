package com.kindergarten.dance.controllers

import com.kindergarten.dance.services.UsersService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class IndexController {


    @Autowired
    lateinit var usersService: UsersService

    @RequestMapping("/")
    fun index(): String {
        println(usersService.allUsers)
        return "index"
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