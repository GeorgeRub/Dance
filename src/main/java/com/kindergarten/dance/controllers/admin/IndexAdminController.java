package com.kindergarten.dance.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class IndexAdminController {

    @RequestMapping("/")
    public String index(){
        return "admin/index";
    }

}