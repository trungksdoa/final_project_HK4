/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werehouse.project.account;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author PC
 */
@Controller
public class AccountController {
    
    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }
    @GetMapping("/home")
    public String home(Model model) {
        return "Home";
    }
    @GetMapping("/dashbord")
    public String dashbord(Model model){
        return "Dashbord";
    }
}
