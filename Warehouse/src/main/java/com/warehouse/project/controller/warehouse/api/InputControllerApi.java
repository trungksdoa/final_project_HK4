/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.api;

import com.warehouse.project.model.Catagoryvoucher;
import com.warehouse.project.model.Groupcatagory;
import com.warehouse.project.service.warehouse.ICoupoContentViewnContent1;
import com.warehouse.project.service.warehouse.ICoupon;
import com.warehouse.project.service.warehouse.IStock_card;
import com.warehouse.project.service.warehouse.Igoodscatagory;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.warehouse.project.model.StockCard;
import com.warehouse.project.model.Voucher;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author trung
 */
@Controller
@RequestMapping("/warehouse")
public class InputControllerApi {

    @Autowired
    ICoupon lab2;

    @Autowired
    ICoupoContentViewnContent1 lab3;

    @Autowired
    Igoodscatagory lab4;

    @Autowired
    IStock_card lab5;

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

    @ResponseBody
    @RequestMapping(value = "/goodsCatagory/")
    public ResponseEntity<List<Groupcatagory>> listGoods() {

        List<Groupcatagory> arralists1 = lab4.findALl();
        //        Catagoryvoucher addArrray = new Catagoryvoucher();
        if (!arralists1.isEmpty()) {
            return new ResponseEntity<>(arralists1, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/groupWarehouse/")
    public ResponseEntity<List<StockCard>> listWarehouse() {

        List<StockCard> arralists1 = lab5.findAll();
        //        Catagoryvoucher addArrray = new Catagoryvoucher();
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