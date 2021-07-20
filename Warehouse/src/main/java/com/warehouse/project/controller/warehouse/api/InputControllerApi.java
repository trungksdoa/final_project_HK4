/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.api;

import com.warehouse.project.model.Catagoryvoucher;
import com.warehouse.project.model.CatagoryGroupSupplier;
import com.warehouse.project.model.Groupsgoods;
import com.warehouse.project.model.Input;
import com.warehouse.project.model.InputContent;

import com.warehouse.project.model.Production;

import com.warehouse.project.service.warehouse.View.ICoupoContentViewnContent1;

import com.warehouse.project.service.warehouse.IStock_card;
import com.warehouse.project.service.warehouse.Other.Igoodscatagory;
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
import com.warehouse.project.model.Supplier;

import com.warehouse.project.model.beanclass.InputDTO;

import com.warehouse.project.model.beanclass.VoucherBean;
import com.warehouse.project.service.warehouse.Other.ISupplier;
import com.warehouse.project.service.warehouse.IO.IInput;
import com.warehouse.project.service.warehouse.IO.IInputContent;

import com.warehouse.project.service.warehouse.View.IProductionview;
import com.warehouse.project.service.warehouse.Other.Igroupgoodds;

import java.util.Collection;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author trung
 */
@Controller
@RequestMapping("/api/input")
public class InputControllerApi {

    @Autowired
    IInput lab;

    @Autowired
    ICoupoContentViewnContent1 lab3;

    @Autowired
    Igoodscatagory lab4;

    @Autowired
    IStock_card lab5;

    @Autowired
    IProductionview lab6;

    @Autowired
    ISupplier lab9;

    @Autowired
    Igroupgoodds lab10;

    @Autowired
    IInputContent lab12;

    @Autowired
    Igoodscatagory lab242;

    @ResponseBody
    @RequestMapping(value = "/Searchwhere/")

    public CatagoryGroupSupplier findGoodsInput(@RequestParam("id") String idking, @RequestParam("name") String name) {
        CatagoryGroupSupplier datalist = lab242.Searchwhere(idking, name);
        return datalist;
    }

    @ResponseBody
    @RequestMapping(value = "/findWhereInputId/{id}")
    public ResponseEntity<Collection<InputContent>> findWhereInputId(@PathVariable("id") String idking) {
        Input idkindsg = new Input();
        idkindsg.setId(idking);
//        System.out.println(idkindsg);
        List<InputContent> ssssAbc = lab12.findWhereInputId(idkindsg);
        if (!ssssAbc.isEmpty()) {
            return new ResponseEntity<>(ssssAbc, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/findInputData/{id}")
    public Input findInputData(@PathVariable("id") String idking) {
        Input ssss = lab.findOne(idking);
        return ssss;
    }

//    @ResponseBody
//    @RequestMapping(value = "/getSupplierByVoucherId/{id}")
//    public VoucherBean getSupplierByVoucherId(@PathVariable("id") String idking) {
//        VoucherBean ojectnew = null;
//        for (Object[] object : lab2.findOne(idking)) {
//            String id = (String) object[0];
//            String date = (String) object[1];
//            String supId = (String) object[2];
//            String Address = (String) object[3];
//            int Phone = (int) object[4];
//            String Expalin = (String) object[5];
//
//            ojectnew = new VoucherBean(id, date, supId, Address, Phone, Expalin);
//        }
////        System.out.println(ojectnew);
//        return ojectnew;
//    }
    @ResponseBody
    @RequestMapping(value = "/DeleteByInputs/")
    public InputContent DeleteBy(@RequestParam("id") int idking) {
        InputContent dataint = lab12.findOneData(idking);
        lab12.Deletes(dataint);
        return dataint;
    }
//

    @ResponseBody
    @RequestMapping(value = "/SaveNewInputContent/")
    public ResponseEntity<Collection<InputContent>> SaveNewTranContent(
            @RequestParam("UpGoodssId") String UpGoodssId,
            @RequestParam("UpGoodsName") String UpGoodsName,
            @RequestParam("UpQuantity") String UpQuantity,
            @RequestParam("UpUnit") String UpUnit,
            @RequestParam("UpWarehouse") String UpWarehouse,
            @RequestParam("UpImpotprice") String UpImpotprice,
            @RequestParam("UpGroup") String UpGroup,
            @RequestParam("UpWeight") String UpWeight,
            @RequestParam("UpSupplier") String UpSupplier,
            @RequestParam("codeis22") String codeis22
    ) {
//        System.out.print(UpGoodssId);
        String supString = UpGoodssId + "_" + UpSupplier;
        Input setIds = new Input();
        setIds.setId(codeis22);
        InputContent csdas = lab12.findWhereId(supString, UpWarehouse, setIds);
//        System.out.print(csdas);
        if (csdas != null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            InputContent updatenewdata = new InputContent();
            //
            Input input = new Input();
            input.setId(codeis22);
            //
            updatenewdata.setGoodsId(UpGoodssId + "_" + UpSupplier + "_" + UpWarehouse);
            //
            updatenewdata.setGoodsName(UpGoodsName);
            //
            updatenewdata.setUnit(UpUnit);
            //
            updatenewdata.setQuantity(Integer.valueOf(UpQuantity));
            //
            updatenewdata.setWarehouse(UpWarehouse);
            //
            updatenewdata.setImportsPrices(Integer.valueOf(UpImpotprice));
            //
            updatenewdata.setGroupGoods(UpGroup);
            //
            updatenewdata.setWeight(Integer.valueOf(UpWeight));
            //
            updatenewdata.setSupplier(UpSupplier);
            //
            updatenewdata.setReference(codeis22);
            //
            updatenewdata.setInputId(input);
            //
            InputContent Respondata = lab12.Save(updatenewdata);
            Input Warehousetranfer = lab.findOne(codeis22);
            Collection<InputContent> objectList = Warehousetranfer.getInputContentCollection();
            if (!objectList.isEmpty()) {
                return new ResponseEntity<>(objectList, HttpStatus.OK);

            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }
    }

    @ResponseBody
    @RequestMapping(value = "/UpdatePlusQuantity/")
    public InputContent UpdatePlusQuantity(@RequestParam("id") int idking, @RequestParam("qty") int qty) {
        InputContent updatenewdata = lab12.findOneData(idking);
        updatenewdata.setGoodsId(updatenewdata.getGoodsId());
        //
        updatenewdata.setGoodsName(updatenewdata.getGoodsName());
        //
        updatenewdata.setUnit(updatenewdata.getUnit());
        //
        updatenewdata.setQuantity(qty);
        //
        updatenewdata.setWarehouse(updatenewdata.getWarehouse());
        //
        updatenewdata.setImportsPrices(Integer.valueOf(updatenewdata.getImportsPrices()));
        //
        updatenewdata.setGroupGoods(updatenewdata.getGroupGoods());
        //
        updatenewdata.setWeight(Integer.valueOf(updatenewdata.getWeight()));
        //
        updatenewdata.setSupplier(updatenewdata.getSupplier());
        //
        updatenewdata.setReference(updatenewdata.getSupplier());
        //
        updatenewdata.setInputId(updatenewdata.getInputId());
        //
        InputContent Respondata = lab12.Save(updatenewdata);
        return Respondata;
    }
//

    @ResponseBody
    @RequestMapping(value = "/GetItemInput/{id}")
    public ResponseEntity<Collection<InputDTO>> findGoodsInput(@PathVariable("id") String idking) {
        List<InputDTO> datalist = new ArrayList<>();
        List<Object[]> objescts = lab12.findWhereByCodeId(idking);
        for (Object[] objects : objescts) {
            int id = (int) objects[0];
            String goodsid = (String) objects[1];
            String goodsName = (String) objects[2];
            String unit = (String) objects[3];
            int quantity = (int) objects[4];
            String warehouse = (String) objects[5];
            int inputprice = (int) objects[6];
            String group = (String) objects[7];
            int weight = (int) objects[8];
            String inputId = (String) objects[9];
            String suppliers = (String) objects[10];
            String reference = (String) objects[11];
            InputDTO inputdto = new InputDTO(id, goodsid, goodsName, unit, quantity, warehouse, inputprice, group, weight, inputId, suppliers, reference);
            datalist.add(inputdto);
        }
        if (!datalist.isEmpty()) {
            return new ResponseEntity<>(datalist, HttpStatus.OK);

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
    //AutoComplete
    @ResponseBody
    @RequestMapping(value = "/goodsCatagory/")
    public ResponseEntity<List<CatagoryGroupSupplier>> listGoods() {

        List<CatagoryGroupSupplier> arralists1 = lab4.findALl();
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
    public Input listID() {
        Input ids = lab.findAllId();
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
//    @RequestMapping(value = "/voucher/from={from}&to={to}", //
//            method = RequestMethod.GET)
//    public ResponseEntity<List<Voucher>> listVoucer(@PathVariable("from") String from, @PathVariable("to") String to) {
//        List<Voucher> ssss = lab2.findByvoucher(from, to);
//        if (!ssss.isEmpty()) {
//            return new ResponseEntity<>(ssss, HttpStatus.OK);
//
//        } else {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
////        System.out.println(ssss);
//    }
}
