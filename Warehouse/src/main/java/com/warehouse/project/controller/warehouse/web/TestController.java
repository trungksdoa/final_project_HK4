/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.web;

import com.warehouse.project.model.Input;
import javax.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TestController {

    @GetMapping()
    String jspPage(Model model) {
//        model.addAttribute("name", name);
        return "warehouse/index";
    }

//    @GetMapping("/thymeleaf")
//    String thymeleafPage(Model model) {
//        return "thymeleaf/sample";
//    }


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
