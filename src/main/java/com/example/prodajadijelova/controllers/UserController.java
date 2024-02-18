package com.example.prodajadijelova.controllers;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/user")
@PreAuthorize("hasAuthority('USER')")
public class UserController {
    @GetMapping
    public String userIndex(Model model) {
        return "user/user_index";
    }

    @GetMapping("/dashboard")
    public String userDashboard(Model model) {


        return "user/dashboard";
    }
    @GetMapping("/success")
    public String success(Model model){
        return "user/success";
    }

}