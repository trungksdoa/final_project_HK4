/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.IO;

import com.warehouse.project.model.Vwwarehouse;
import com.warehouse.project.responsitory.warehouse.Warehouse_vuewgoods;
import com.warehouse.project.service.warehouse.View.VwWarehouse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class VwWarwehouseImpl implements VwWarehouse{

    @Autowired
    Warehouse_vuewgoods lab;
    
    @Override
    public List<Vwwarehouse> findALl() {
       return lab.findAll();
    }
    
}
