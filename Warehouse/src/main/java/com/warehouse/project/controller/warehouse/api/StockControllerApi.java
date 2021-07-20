/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.api;

import com.warehouse.project.model.Checkslip;
import com.warehouse.project.model.Checkstockslip;
import com.warehouse.project.model.Production;
import com.warehouse.project.model.Hisio;
import com.warehouse.project.model.TranferWarehouse;
import com.warehouse.project.model.TranferConent;
import com.warehouse.project.model.Warehouse;
import com.warehouse.project.model.beanclass.WarehouseBean;
import com.warehouse.project.service.warehouse.CheckSockSlipI;
import com.warehouse.project.service.warehouse.ICheckstock;
import com.warehouse.project.service.warehouse.ITranferContent;
import com.warehouse.project.service.warehouse.ITranferWarehouse;
import com.warehouse.project.service.warehouse.IWarehouse;
import com.warehouse.project.service.warehouse.Ihistory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author trung
 */
@Controller
@RequestMapping("/api/stock")
public class StockControllerApi {

    @Autowired
    Ihistory lab;

    @Autowired
    IWarehouse lab2;

    @Autowired
    CheckSockSlipI lab3;

    @Autowired
    ICheckstock lab4;

    @Autowired
    ITranferWarehouse ewqeqw;

    @Autowired
    ITranferContent content2;

    @ResponseBody
    @GetMapping("/findAllWarehouse/")
    public ResponseEntity<List<Warehouse>> findAllWarehouse() {
        List<Warehouse> datalistwh = lab2.findAllData();
        if (!datalistwh.isEmpty()) {
            return new ResponseEntity<>(datalistwh, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @ResponseBody
    @GetMapping("/SearchWhere/{id}")
    public ResponseEntity<List<Warehouse>> getCategory(@PathVariable("id") String id) {
        List<Warehouse> datalistwh = lab2.SearchWhere(id);
        if (!datalistwh.isEmpty()) {
            return new ResponseEntity<>(datalistwh, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/TranferWarehouse/{id}")
    public TranferWarehouse findInputData(@PathVariable("id") String idking) {
        TranferWarehouse ssss = ewqeqw.findOne(idking);
        return ssss;
    }

    @ResponseBody
    @RequestMapping(value = "/DeleteBy/")
    public TranferConent DeleteBy(@RequestParam("id") int idking) {
        TranferConent dataint = content2.findOne(idking);
        content2.Delete(dataint);
        return dataint;
    }

    @ResponseBody
    @RequestMapping(value = "/SaveNewTranContent/")
    public ResponseEntity<Collection<TranferConent>> SaveNewTranContent(@RequestParam("UpGoodssId") String UpGoodssId,
            @RequestParam("UpQuantity") String UpQuantity, @RequestParam("UpUnit") String UpUnit,
            @RequestParam("UpFrom") String UpFrom, @RequestParam("UpTo") String UpTo, @RequestParam("codeis22") String codeis22
    ) {
        TranferWarehouse setNewiD = new TranferWarehouse();
        setNewiD.setId(codeis22);
        TranferConent daatlis = content2.findTwo(UpGoodssId, setNewiD);
//        System.out.print(daatlis);
        if (daatlis != null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            TranferConent updatenewdata = new TranferConent();
            updatenewdata.setGoodsid(UpGoodssId);
            updatenewdata.setUnit(UpUnit);
            updatenewdata.setQuantity(Integer.valueOf(UpQuantity));
            updatenewdata.setFroms(UpFrom);
            updatenewdata.setTos(UpTo);
            TranferWarehouse tranfers = new TranferWarehouse();
            tranfers.setId(codeis22);
            updatenewdata.setTraferId(tranfers);
            TranferConent Respondata = content2.save(updatenewdata);
            TranferWarehouse Warehousetranfer = ewqeqw.findOne(codeis22);
            Collection<TranferConent> objectList = Warehousetranfer.getTranferConentCollection();
            if (!objectList.isEmpty()) {
                return new ResponseEntity<>(objectList, HttpStatus.OK);

            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @ResponseBody
    @RequestMapping(value = "/UpdatePlusQuantity/")
    public TranferConent UpdatePlusQuantity(@RequestParam("id") int idking, @RequestParam("qty") int qty) {
        TranferConent dataint = content2.findOne(idking);
        dataint.setGoodsid(dataint.getGoodsid());
        dataint.setUnit(dataint.getUnit());
        dataint.setFroms(dataint.getFroms());
        dataint.setTos(dataint.getTos());
        dataint.setTraferId(dataint.getTraferId());
        dataint.setQuantity(qty);
        TranferConent oueah = content2.save(dataint);
        return oueah;
    }

    @ResponseBody
    @RequestMapping(value = "/TranferWarehouseGetId/{id}")
    public ResponseEntity<Collection<TranferConent>> findGoodsInput(@PathVariable("id") String idking) {
        TranferWarehouse ssss = ewqeqw.findOne(idking);
        Collection<TranferConent> objectList = ssss.getTranferConentCollection();
        if (!objectList.isEmpty()) {
            return new ResponseEntity<>(objectList, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/getId/{id}")
    public ResponseEntity<List<WarehouseBean>> findMaterial(@PathVariable("id") String idking) {

        List<Object[]> ssss = lab2.findAll(idking);
        List<WarehouseBean> lsittodata = new ArrayList<>();
        for (Object[] object : ssss) {
            String id = (String) object[0];
            int quantity = (int) object[1];
            String name = (String) object[2];
            WarehouseBean obecjt = new WarehouseBean(id, quantity, name);
            lsittodata.add(obecjt);
        }
        if (!ssss.isEmpty()) {
            return new ResponseEntity<>(lsittodata, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/ListOne")
    public TranferWarehouse ListOne() {
        TranferWarehouse editer = ewqeqw.ListOne();
        if (editer != null) {
            return editer;
        } else {
            return null;
        }
    }

    @ResponseBody
    @RequestMapping(value = "/getEditStocklist/{id}")
    public Checkstockslip findEditCheckStock(@PathVariable("id") String idking) {
        Checkstockslip editer = lab3.FindOne(idking);
        if (editer != null) {
            return editer;
        } else {
            return null;
        }
    }

    //%
    //Get Item Check Slip By Id
    //%
    @ResponseBody
    @RequestMapping(value = "/getItemCheckSlip/{id}")
    public ResponseEntity<List<Checkslip>> getItemCheckSlip(@PathVariable("id") String idking) {
        List<Checkslip> editer = lab4.ListByCheckid(idking);
        if (!editer.isEmpty()) {
            return new ResponseEntity<>(editer, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
