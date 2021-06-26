/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.web;

import com.warehouse.project.model.Catagoryvoucher;
import com.warehouse.project.model.GoodsCatagory;
import com.warehouse.project.model.Voucher;
import com.warehouse.project.model.VoucherContent;
import com.warehouse.project.service.warehouse.ICoupoContentViewnContent1;
import com.warehouse.project.service.warehouse.ICoupon;
import com.warehouse.project.service.warehouse.IInput;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author trung
 */
@Controller
@RequestMapping("/warehouse")
public class HomeController {

    @Autowired
    IInput lab;

    @Autowired
    ICoupon lab2;

    @Autowired
    ICoupoContentViewnContent1 lab3;

    @RequestMapping("/page")
    public String index(Model model) {
        model.addAttribute("list", lab.findall());
        return "warehouse/index";
    }
//
//    @RequestMapping("/pages")
//    public ResponseEntity<List<Catagoryvoucher>> indexx(Model model) {
//        
//         List<Catagoryvoucher> arralists1 = lab3.findById();
//        if (!arralists1.isEmpty()) {
//            return new ResponseEntity<>(arralists1, HttpStatus.OK);
//
//        } else {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//    }

    @ResponseBody
    @RequestMapping(value = "/findGoods/")

    public ResponseEntity<List<Catagoryvoucher>> findgoods(@RequestParam(value = "id") String[] keyword) {

        List<Catagoryvoucher> arralists1 = new ArrayList<>();
//        Catagoryvoucher addArrray = new Catagoryvoucher();

        for (String data : keyword) {
            List<Catagoryvoucher> clist = lab3.findALlById(data);

            arralists1.addAll(clist);
//            GoodsCatagory codese;
        }
        if (!arralists1.isEmpty()) {
            return new ResponseEntity<>(arralists1, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @RequestMapping(value = "/voucher/from={from}&to={to}", //
            method = RequestMethod.GET)
    public ResponseEntity<List<Voucher>> listVoucer(@PathVariable("from") String from, @PathVariable("to") String to) {
        List<Voucher> ssss = lab2.findByvoucher(from, to);
        if (!ssss.isEmpty()) {
            return new ResponseEntity<>(ssss, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
//    @PostMapping
//    @RequestMapping(value = "/findVoucher/{from}&{to}", method = RequestMethod.GET)
//    public ResponseEntity<List<Voucher>> Search(@PathVariable("from") String from, @PathVariable("to") String to, Model model) {
//        List<Voucher> clist = lab2.findByvoucher(from, to);
//        //isemty là rỗng
//        if (clist.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } else {
//            return new ResponseEntity<>(clist, HttpStatus.OK);
//        }
//    }

