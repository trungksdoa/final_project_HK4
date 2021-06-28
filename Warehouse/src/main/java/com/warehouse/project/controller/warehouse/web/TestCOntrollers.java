/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.web;

import com.warehouse.project.model.Input;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author trung
 */
@Controller
public class TestCOntrollers {
    

    @GetMapping()
    String jspPage(Model model) {
//        model.addAttribute("name", name);
        return "warehouse/index";
    }

//    @GetMapping("/thymeleaf")
//    String thymeleafPage(Model model) {
//        return "thymeleaf/sample";
//    }
    @GetMapping("/login")
    public String login(Model model) {
        return "thymeleaf/login";
    }

    @GetMapping("/home")
    public String home(Model model) {
        return "thymeleaf/Home";
    }

    @GetMapping("/dashbord")
    public String dashbord(Model model) {
        return "thymeleaf/sample";
    }

    @GetMapping("/thymeleaf")
    public String add(Model model) {
        model.addAttribute("Input", new Input());
        return "thymeleaf/sample";
    }

    @RequestMapping(value = "/doRegister", method = RequestMethod.POST)
    public String processAdd(@ModelAttribute("Input") Input input) {
//        model.addFlashAttribute("message", "xoa thanh cong");
        return "redirect:/";

    }

}
