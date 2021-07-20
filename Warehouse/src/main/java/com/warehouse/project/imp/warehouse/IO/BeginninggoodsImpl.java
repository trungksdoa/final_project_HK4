/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.IO;

import com.warehouse.project.model.Beginninggoods;
import com.warehouse.project.model.Warehouse;
import com.warehouse.project.responsitory.warehouse.BeginninggoodsRes;
import com.warehouse.project.service.warehouse.IWarehouse2;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class BeginninggoodsImpl implements IWarehouse2 {

    @Autowired
    BeginninggoodsRes lab;

    @Override
    public Beginninggoods Save(Beginninggoods input) {
        return lab.save(input);
    }

    @Override
    public List<Beginninggoods> FindALl() {
        return lab.findAll();
    }

    @Override
    public Beginninggoods findOne(String goodsId, String warehouse) {
       return lab.findByIdDData(goodsId, goodsId);
    }
}
