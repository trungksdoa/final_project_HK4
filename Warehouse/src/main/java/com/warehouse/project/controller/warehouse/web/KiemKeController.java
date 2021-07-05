/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.web;

import com.warehouse.project.model.Checkslip;
import com.warehouse.project.model.Input;
import com.warehouse.project.model.Vwtotal;
import com.warehouse.project.model.Warehouse;
import com.warehouse.project.model.beanclass.Hisotryio;
import com.warehouse.project.model.beanclass.WarehouseStock;
import com.warehouse.project.service.warehouse.IWarehouse;
import com.warehouse.project.service.warehouse.Ihistory;
import com.warehouse.project.service.warehouse.View.IVwtotal;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
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
    Ihistory lab5;

    @RequestMapping(value = "/page1", method = RequestMethod.GET)
    public String page(Model model) {
        List<WarehouseStock> warehouse = new ArrayList<>();
        int Sumquantity = 0;
        int SumPrice = 0;
        model.addAttribute("datalist", lab.findAllData());
//        model.addAttribute("Namelist", allObject);
//        model.addAttribute("ListQuantity", lab.FindALl());
        for (Object[] objects : lab.findAllWarehouse()) {
            String Warehouse = (String) objects[0];
            WarehouseStock objectconvet = new WarehouseStock(Warehouse);
            warehouse.add(objectconvet);
        }
        for (Warehouse warehouse1 : lab.findAllData()) {
            Sumquantity += warehouse1.getQuantityInStock();
            SumPrice += warehouse1.getPriceInStock();
        }
        model.addAttribute("datalist2", warehouse);
        model.addAttribute("SumPrice", SumPrice);
        model.addAttribute("sumquantity", Sumquantity);
//        model.addAttribute("historyIo", lab5.findAll());
        return "warehouse/Inventory";
    }

    @RequestMapping(value = "/page2", method = RequestMethod.GET)
    public String page2(Model model) {
        model.addAttribute("historyIo", lab5.findAll());
        return "warehouse/Tracking";
    }

    @RequestMapping(value = "/page3", method = RequestMethod.GET)
    public String page3(Model model) {
        return "warehouse/TrackingsStock";
    }

    @RequestMapping(value = "/stock/saveData", method = RequestMethod.POST)
    public String SaveData(@ModelAttribute("Input") Checkslip checkslip, Model model, HttpServletRequest request) {

        String[] id = request.getParameterValues("id");
        String[] quantity = request.getParameterValues("quantity");
        String[] realQuantity = request.getParameterValues("realQuantity");
        String[] BetweenRealAndStock = request.getParameterValues("BetweenRealAndStock");
        String[] explain = request.getParameterValues("explain");
        
        String date = String.valueOf(java.time.LocalDate.now());  

        for (String string : quantity) {
            System.out.println(string);
        }
        
        
        return "warehouse/Inventory";
    }

}




	
//
