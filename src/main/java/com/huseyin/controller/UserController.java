package com.huseyin.controller;

import com.huseyin.model.User;
import com.huseyin.repository.UserRepository;
import com.huseyin.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {

    private IUserService userService;

    private UserRepository userRepository;

    public UserController( IUserService userService) {
        super();
        this.userService = userService;
    }

    //handler method to handle list students and return mode and view
    @GetMapping("/users")
    public String listUsers(Model model){
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @PostMapping("/users/{id}")
    public String updateUser(@PathVariable Long id, @ModelAttribute("user") User user, Model model){


        //get student from database by id
        User existingUser = userService.getUserById(id);

        existingUser.setActive(!existingUser.isActive());

        //save updated student object
        userService.updateUser(existingUser);

        return "redirect:/users";
    }



}
