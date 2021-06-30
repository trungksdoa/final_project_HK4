/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse;

import com.warehouse.project.model.InputContent;
import com.warehouse.project.model.Warehouse;
import com.warehouse.project.responsitory.warehouse.Warehouse_goods;
import com.warehouse.project.service.warehouse.IWarehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class WarehouseImpl implements IWarehouse {

    @Autowired
    Warehouse_goods lab;

    @Override
    public Warehouse Save(Warehouse input) {
        return lab.save(input);
    }

}
