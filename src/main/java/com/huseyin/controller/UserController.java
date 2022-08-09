package com.huseyin.controller;

import com.huseyin.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class UserController {

    private IUserService userService;

    public UserController( IUserService userService) {
        super();
        this.userService = userService;
    }

    //handler method to handle list students and return mode and view
    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("users", userService.getAllUsers());
        return "students";
    }


}
