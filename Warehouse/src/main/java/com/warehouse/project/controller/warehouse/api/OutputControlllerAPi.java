/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.api;


import com.warehouse.project.model.Catagoryvoucher;
import com.warehouse.project.model.Groupsgoods;
import com.warehouse.project.model.Output;
import com.warehouse.project.model.OutputContent;
import com.warehouse.project.model.Production;
import com.warehouse.project.model.Productionorder;
import com.warehouse.project.model.StockCard;
import com.warehouse.project.model.Supplier;
import com.warehouse.project.model.Vwprodcutionmaterial;
import com.warehouse.project.model.Vwwarehouse;
import com.warehouse.project.service.warehouse.View.ICoupoContentViewnContent1;
import com.warehouse.project.service.warehouse.Other.ICoupon;
import com.warehouse.project.service.warehouse.View.IMaterialProduction;
import com.warehouse.project.service.warehouse.IO.IOutput;
import com.warehouse.project.service.warehouse.Other.IProductionorder;
import com.warehouse.project.service.warehouse.View.IProductionview;
import com.warehouse.project.service.warehouse.IStock_card;
import com.warehouse.project.service.warehouse.Other.ISupplier;
import com.warehouse.project.service.warehouse.IWarehouse;
import com.warehouse.project.service.warehouse.Other.Igroupgoodds;
import com.warehouse.project.service.warehouse.View.VwWarehouse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author trung
 */
@Controller
@RequestMapping("/api/output")
public class OutputControlllerAPi {
    
    @Autowired
    IOutput lab;
    
    @Autowired
    ICoupon lab2;

    @Autowired
    ICoupoContentViewnContent1 lab3;

    

    @Autowired
    IStock_card lab5;

    @Autowired
    IProductionview lab6;

    @Autowired
    IMaterialProduction lab7;

    @Autowired
    IProductionorder lab8;

    @Autowired
    ISupplier lab9;

    @Autowired
    Igroupgoodds lab10;
    
    @Autowired
    VwWarehouse lab11;
    
    
    
    
    @ResponseBody
    @RequestMapping(value = "/findOutptData/{id}")
    public Output findInputData(@PathVariable("id") String idking) {
        Output ssss = lab.findOne(idking);
        return ssss;
    }

    @ResponseBody
    @RequestMapping(value = "/GetItemOut/{id}")
    public ResponseEntity<Collection<OutputContent>> findGoodsInput(@PathVariable("id") String idking) {
        Output ssss = lab.findOne(idking);
        Collection<OutputContent> objectList = ssss.getOutputContentCollection();       
        if (!objectList.isEmpty()) {
            return new ResponseEntity<>(objectList, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
    
    
    
    
    
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

    //Production
    @ResponseBody
    @RequestMapping(value = "/findProduction/idProduction={idProduction}&from={from}&to={to}")
    public ResponseEntity<List<Production>> findMaterial(@PathVariable("idProduction") String idking, @PathVariable("from") String from, @PathVariable("to") String to) {

        List<Production> ssss = lab6.findByDateAndId(idking, from, to);
        if (!ssss.isEmpty()) {
            return new ResponseEntity<>(ssss, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    //Find Material Production Goods
    @ResponseBody
    @RequestMapping(value = "/findMaterial/")
    public ResponseEntity<List<Vwprodcutionmaterial>> findMaterial(@RequestParam(value = "id") int[] keyword) {
        List<Vwprodcutionmaterial> arralists1 = new ArrayList<>();
//        Catagoryvoucher addArrray = new Catagoryvoucher();

        for (int data : keyword) {
            List<Vwprodcutionmaterial> clist = lab7.findAll(data);

            arralists1.addAll(clist);
//            GoodsCatagory codese; 
        }
        if (!arralists1.isEmpty()) {
            return new ResponseEntity<>(arralists1, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    //AutoComplete
    @ResponseBody
    @RequestMapping(value = "/goodsCatagory/")
    public ResponseEntity<List<Vwwarehouse>> listGoods() {

        List<Vwwarehouse> arralists1 = lab11.findALl();
        //        Catagoryvoucher addArrray = new Catagoryvoucher();
        if (!arralists1.isEmpty()) {
            return new ResponseEntity<>(arralists1, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    //Get Last Id
    @ResponseBody
    @RequestMapping(value = "/getID/")
    public Output listID() {
        Output ids = lab.findAllId();
        //        Catagoryvoucher addArrray = new Catagoryvoucher();
        return ids;
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

    @ResponseBody
    @RequestMapping(value = "/productionorderlist/")
    public ResponseEntity<List<Productionorder>> ListID() {

        List<Productionorder> arralists1 = lab8.findall();
        //        Catagoryvoucher addArrray = new Catagoryvoucher();
        if (!arralists1.isEmpty()) {
            return new ResponseEntity<>(arralists1, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
    //
    //List supplier
    //
    @ResponseBody
    @RequestMapping(value = "/supplierList/")
    public ResponseEntity<List<Supplier>> ListSuplier() {

        List<Supplier> arralists1 = lab9.findAll();
        //        Catagoryvoucher addArrray = new Catagoryvoucher();
        if (!arralists1.isEmpty()) {
            return new ResponseEntity<>(arralists1, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
   //
    //List supplier
    //
    @ResponseBody
    @RequestMapping(value = "/GroupsgoodsList/")
    public ResponseEntity<List<Groupsgoods>> ListSGroup() {

        List<Groupsgoods> arralists1 = lab10.findALl();
        //        Catagoryvoucher addArrray = new Catagoryvoucher();
        if (!arralists1.isEmpty()) {
            return new ResponseEntity<>(arralists1, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
    //
    //
    //
}
