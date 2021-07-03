/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.api;

import com.warehouse.project.model.Production;
import com.warehouse.project.model.Hisio;
import com.warehouse.project.service.warehouse.IWarehouse;
import com.warehouse.project.service.warehouse.Ihistory;
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

    @ResponseBody
    @RequestMapping(value = "/getId/{id}&{warehouse}")
    public ResponseEntity<List<Hisio>> findMaterial(@PathVariable("id") String idking, @PathVariable("warehouse") String warehouse) {

        List<Hisio> ssss = lab.listAll(idking, warehouse);
        if (!ssss.isEmpty()) {
            return new ResponseEntity<>(ssss, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

}
