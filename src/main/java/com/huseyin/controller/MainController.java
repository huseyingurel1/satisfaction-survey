package com.huseyin.controller;

import com.huseyin.model.User;
import com.huseyin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class MainController {

    @Autowired
    IUserService userService;

    @GetMapping("/login")
    public String login(){

        return "login";
    }

}
