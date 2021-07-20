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
import com.warehouse.project.model.StockCard;
import com.warehouse.project.model.Supplier;
import com.warehouse.project.model.Vwwarehouse;
import com.warehouse.project.model.beanclass.outputDTO;
import com.warehouse.project.service.warehouse.View.ICoupoContentViewnContent1;
import com.warehouse.project.service.warehouse.IO.IOutput;
import com.warehouse.project.service.warehouse.IO.IOutputConent;
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
    ICoupoContentViewnContent1 lab3;

    @Autowired
    IOutputConent lab12;

    @Autowired
    IStock_card lab5;

    @Autowired
    IProductionview lab6;


    @Autowired
    ISupplier lab9;

    @Autowired
    Igroupgoodds lab10;

    @Autowired
    VwWarehouse lab11;

    @ResponseBody
    @RequestMapping(value = "/DeleteBy/")
    public OutputContent DeleteBy(@RequestParam("id") int idking) {
        OutputContent dataint = lab12.findOneData(idking);
        lab12.Deletes(dataint);
        return dataint;
    }
//

    @ResponseBody
    @RequestMapping(value = "/SaveNewoutputContent/")
    public  ResponseEntity<Collection<OutputContent>> SaveNewTranContent(
            @RequestParam("UpGoodssId") String UpGoodssId,
            @RequestParam("UpGoodsName") String UpGoodsName,
            @RequestParam("UpQuantity") String UpQuantity,
            @RequestParam("UpUnit") String UpUnit,
            @RequestParam("UpWarehouse") String UpWarehouse,
            @RequestParam("UpExportprice") String UpExportprice,
            @RequestParam("UpGroup") String UpGroup,
            @RequestParam("UpWeight") String UpWeight,
            @RequestParam("UpSupplier") String UpSupplier,
            @RequestParam("codeis22") String codeis22
    ) {
        Output setIds = new Output();
        setIds.setId(codeis22);
        OutputContent csdas = lab12.findWhereId(UpGoodssId, UpWarehouse, setIds);
  
        if (csdas != null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            OutputContent updatenewdata = new OutputContent();
            //
            Output input = new Output();
            input.setId(codeis22);
            //
            updatenewdata.setGoodsId(UpGoodssId);
            //
            updatenewdata.setGoodsName(UpGoodsName);
            //
            updatenewdata.setUnit(UpUnit);
            //
            updatenewdata.setQuantity(Integer.valueOf(UpQuantity));
            //
            updatenewdata.setWarehouse(UpWarehouse);
            //
            updatenewdata.setExportsPrices(Integer.valueOf(UpExportprice));
            //
            updatenewdata.setGroupGoods(UpGroup);
            //
            updatenewdata.setWeight(Integer.valueOf(UpWeight));
            //
            updatenewdata.setSupplier(UpSupplier);
            //
            updatenewdata.setReference(codeis22);
            //
            updatenewdata.setOutputId(input);
            //
            OutputContent Respondata = lab12.Save(updatenewdata);
            Output Warehousetranfer = lab.findOne(codeis22);
            Collection<OutputContent> objectList = Warehousetranfer.getOutputContentCollection();
            if (!objectList.isEmpty()) {
                return new ResponseEntity<>(objectList, HttpStatus.OK);

            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }
    }

    @ResponseBody
    @RequestMapping(value = "/UpdatePlusQuantity/")
    public OutputContent UpdatePlusQuantity(@RequestParam("id") int idking, @RequestParam("qty") int qty) {
        OutputContent updatenewdata = lab12.findOneData(idking);
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
        updatenewdata.setExportsPrices(Integer.valueOf(updatenewdata.getExportsPrices()));
        //
        updatenewdata.setGroupGoods(updatenewdata.getGroupGoods());
        //
        updatenewdata.setWeight(Integer.valueOf(updatenewdata.getWeight()));
        //
        updatenewdata.setSupplier(updatenewdata.getSupplier());
        //
        updatenewdata.setReference(updatenewdata.getSupplier());
        //
        updatenewdata.setOutputId(updatenewdata.getOutputId());
        //
        OutputContent Respondata = lab12.Save(updatenewdata);
        return Respondata;
    }

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
