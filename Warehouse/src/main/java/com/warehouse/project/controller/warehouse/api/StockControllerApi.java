/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.api;

import com.warehouse.project.model.Production;
import com.warehouse.project.model.Hisio;
import com.warehouse.project.model.Warehouse;
import com.warehouse.project.model.beanclass.WarehouseBean;
import com.warehouse.project.service.warehouse.IWarehouse;
import com.warehouse.project.service.warehouse.Ihistory;
import java.util.ArrayList;
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
    @RequestMapping(value = "/Warehousegoods")
    public ResponseEntity<List<WarehouseBean>> findMaterial() {

        List<Object[]> ssss = lab2.FindALl();
        List<WarehouseBean> lsittodata = new ArrayList<>();
        for (Object[] object : ssss) {
            String id = (String) object[0];
            int quantity = (int) object[2];
            String name = (String) object[1];
            WarehouseBean obecjt = new WarehouseBean(id, quantity, name);
            lsittodata.add(obecjt);
        }
        if (!ssss.isEmpty()) {
            return new ResponseEntity<>(lsittodata, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
