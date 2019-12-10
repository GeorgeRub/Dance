package com.kindergarten.dance.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/school")
public class SchoolController {

    @RequestMapping("/{kind}")
    public String kindOfSchool(@PathVariable String kind){
        return "sportDancing";
    }

//    @RequestMapping("/sport-dance")
//    public String sportDance(){
//        return "sportDancing";
//    }

//    @RequestMapping("/sport-dance/achievement")
//    public String sportDanceAchievement(Model model) {
//        model.addAttribute("title", "achievement");
//        return "sportDancing";
//    }
//
//    @RequestMapping("/stretching")
//    public String stretching(){
//        return "stretching";
//    }
//
//    @RequestMapping("/eastern-dance")
//    public String easternDance() {
//        return "easternDance";
//    }

}
