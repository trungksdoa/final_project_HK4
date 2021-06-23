/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.web;

import com.warehouse.project.imp.warehouse.InputImpl;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author trung
 */
@Controller
public class HomeController {

    @Autowired
    InputImpl lab;

    @RequestMapping("/page")
    public String page(Model model) {
        model.addAttribute("list", lab.findall());
        return "warehouse/index";
    }

}
