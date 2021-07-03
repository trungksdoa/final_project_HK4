/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.web;

import com.warehouse.project.model.Vwtotal;
import com.warehouse.project.model.Warehouse;
import com.warehouse.project.service.warehouse.IWarehouse;
import com.warehouse.project.service.warehouse.View.IVwtotal;
import com.warehouse.project.service.warehouse.View.IVwwarehousesio;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author trung
 */
@Controller
@RequestMapping("/web/warehouse")
public class KiemKeController {

    @Autowired
    IWarehouse lab;

    @Autowired
    IVwtotal lav2;
 
    @Autowired
    IVwwarehousesio lab3;
    @RequestMapping("/")
    public String page(Model model) {
        List<String> namelist = new ArrayList<>();
        List<String> ListQuantity = new ArrayList<>();
        List<Vwtotal> allObject = lav2.findALl();
        model.addAttribute("datalist", lab.FindALl());
        model.addAttribute("Namelist", allObject);
        model.addAttribute("ListQuantity", lab.FindALl());
        model.addAttribute("historyIo",lab3.findAll());
        return "warehouse/showinput";
    }

    @RequestMapping(value = "/checkstock/{id}", method = RequestMethod.GET)
    public void CheckStock(@PathVariable("id") String id) {
        System.out.println(id);
    }

}
