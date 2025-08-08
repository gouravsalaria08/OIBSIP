package com.reservationsystem.ReservationSystem.controller;

import com.reservationsystem.ReservationSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(@RequestParam String username,
                              @RequestParam String password,
                              Model model) {
        if (userService.authenticate(username, password)) {
            return "redirect:/reservation";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
}
