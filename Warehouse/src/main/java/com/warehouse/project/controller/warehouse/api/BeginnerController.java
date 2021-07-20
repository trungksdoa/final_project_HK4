/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.api;

import com.warehouse.project.model.Beginninggoods;
import com.warehouse.project.model.Input;
import com.warehouse.project.model.InputContent;
import com.warehouse.project.service.warehouse.IWarehouse2;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author trung
 */
@Controller
@RequestMapping("/api/beginer")
public class BeginnerController {

    @Autowired
    IWarehouse2 lab;

    @ResponseBody
    @RequestMapping(value = "/SaveNewInputContent/")
    public ResponseEntity<Collection<Beginninggoods>> SaveNewTranContent(
            @RequestParam("UpGoodssId") String UpGoodssId,
            @RequestParam("UpGoodsName") String UpGoodsName,
            @RequestParam("UpQuantity") String UpQuantity,
            @RequestParam("UpUnit") String UpUnit,
            @RequestParam("UpWarehouse") String UpWarehouse,
            @RequestParam("UpImpotprice") String UpImpotprice,
            @RequestParam("UpGroup") String UpGroup,
            @RequestParam("UpWeight") String UpWeight,
            @RequestParam("UpSupplier") String UpSupplier
    ) {
        System.out.print(UpGoodssId);
        String supString = UpGoodssId + "_" + UpSupplier;
        Beginninggoods csdas = lab.findOne(supString, UpWarehouse);
        if (csdas != null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            Beginninggoods updatenewdata = new Beginninggoods();
            //
            updatenewdata.setGoodsId(UpGoodssId + "_" + UpSupplier);
            //
            updatenewdata.setGoodsName(UpGoodsName);
            //
            updatenewdata.setUnit(UpUnit);
            //
            updatenewdata.setQuantityInStock(Integer.valueOf(UpQuantity));
            //
            updatenewdata.setStockCard(UpWarehouse);
            //
            updatenewdata.setImportPrice(Integer.valueOf(UpImpotprice));
            //
            updatenewdata.setGroupGoods(UpGroup);
            //
            updatenewdata.setWeight(Integer.valueOf(UpWeight));
            //
            updatenewdata.setSupplier(UpSupplier);
            //
            Beginninggoods Respondata = lab.Save(updatenewdata);
            List<Beginninggoods> Warehousetranfer = lab.FindALl();
            if (!Warehousetranfer.isEmpty()) {
                return new ResponseEntity<>(Warehousetranfer, HttpStatus.OK);

            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }
    }

}
