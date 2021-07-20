/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author trung
 */
@Controller
@RequestMapping("/web/warehouse")
public class BeginnerControllers {

    @RequestMapping("/SoDuDauky")
    public String InputsipData(Model model) {
        return "warehouse/SoDuDauky";
    }
}
