package com.kindergarten.dance.controllers.admin;

import com.kindergarten.dance.model.CallBack;
import com.kindergarten.dance.model.auth.User;
import com.kindergarten.dance.services.CallBackService;
import com.kindergarten.dance.services.UsersService;
import com.kindergarten.dance.wrappers.callBack.CallBackAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
@RequestMapping("/admin/callback")
public class AdminCallBack {

    @Autowired
    private CallBackService callBackService;
    @Autowired
    private UsersService usersService;

    @RequestMapping("/list/new")
    public String listNew(Model model) {
        model.addAttribute("title", "Нові заявки");
        model.addAttribute("isNew", "true");
        model.addAttribute("list", callBackService.getAllNew());
        return "admin/callBack/list";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("title", "Всі заявки");
        model.addAttribute("isNew", "false");
        model.addAttribute("list", callBackService.getAll());
        return "admin/callBack/list";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable Long id) {
        model.addAttribute("query", callBackService.getById(id));
        return "admin/callBack/edit";
    }

    @PostMapping("/edit")
    @ResponseBody
    public CallBackAnswer editPost(@RequestParam("text") String text, @RequestParam("id") Long id, Principal principal) {
        System.out.println("hear");
        CallBackAnswer answer = new CallBackAnswer();
        try {
            CallBack callBack = callBackService.getById(id);
            callBack.setTalking(text);
            callBack.setAnswered(true);
            callBack.setUser(usersService.getUserByLogin(principal.getName()));
            callBackService.update(callBack);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return answer;
    }


}
