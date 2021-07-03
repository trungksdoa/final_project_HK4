/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.web;

import com.warehouse.project.model.Warehouse;
import com.warehouse.project.service.warehouse.IWarehouse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author trung
 */
@Controller
@RequestMapping("/web/warehouse")
public class StockController {

    @Autowired
    IWarehouse lab;

    @RequestMapping("/stock")
    public String page(Model model) {
        return "warehouse/StockDashboard";
    }

    @GetMapping
    public String ListTop5GoodsWarehouse(Model model) {

        List<Warehouse> arralists1 = lab.findAllTop5();
        //        Catagoryvoucher addArrray = new Catagoryvoucher();
//        List<String> namelist = lab.FindALl().stream().map(x -> x.getGoodsName()).collect(Collectors.toList());
//        List<Integer> quantity = lab.FindALl().stream().map(x -> x.getQuantityInStock()).collect(Collectors.toList());

        model.addAttribute("Namelist", lab.findAllTop5());
        model.addAttribute("ListQuantity", lab.FindALl());
//        model.addAttribute("quantityList",quantity);
        return "warehouse/StockDashboard";
    }
}
