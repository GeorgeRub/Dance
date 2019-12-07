package com.kindergarten.dance.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class IndexController {

    @RequestMapping("/")
    fun index() = "index"

    @RequestMapping("/login")
    fun login() = "login"

    @RequestMapping("/logout")
    fun logout() = "index"

    @RequestMapping("/403")
    fun _403() = "403"

    @RequestMapping("/404")
//    @ExceptionHandler(NotFoundException.class)
    fun notFound() = "404"

    @RequestMapping("/sport-dance")
    fun sportDance(): String {
        return "sportDancing"
    }

    @RequestMapping("/stretching")
    fun stretching(): String {
        return "stretching"
    }

    @RequestMapping("/eastern-dance")
    fun easternDance(): String {
        return "easternDance";
    }

}