package com.kindergarten.dance.controllers;

import javassist.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
            return "login";
    }

    @RequestMapping("/logout")
    public String logout() {
            return "index";
    }

    @RequestMapping("/403")
    public String page403() {
            return "403";
    }

    @RequestMapping("/404")
    @ExceptionHandler(NotFoundException.class)
    public String notFound() {
            return "404";
    }
}
