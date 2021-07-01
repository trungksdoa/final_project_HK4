/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.web;

import com.warehouse.project.model.GoodsCatagory;
import com.warehouse.project.model.Output;
import com.warehouse.project.model.OutputContent;
import com.warehouse.project.model.Warehouse;
import com.warehouse.project.service.warehouse.IO.IOutput;
import com.warehouse.project.service.warehouse.IO.IOutputConent;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author trung
 */
@Controller
@RequestMapping("/web/warehouse")
public class Outputcontroller {

    @Autowired
    IOutput lab;
    
    @Autowired
    IOutputConent lab1;
    
    @RequestMapping("/output")
    public String page(Model model) {
        model.addAttribute("message", "");
        return "warehouse/Output";
    }
    
     public boolean isSpace(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if ((array[i] == null) || (array[i].trim().length() == 0)) {
                //true on null, empty string, or white space only. Do something here
                return true;
            } else {
                return false;
            }
        }
        return false;
    }


}
