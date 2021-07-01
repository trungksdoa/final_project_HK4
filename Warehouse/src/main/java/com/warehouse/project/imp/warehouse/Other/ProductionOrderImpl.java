/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.Other;

import com.warehouse.project.model.Productionorder;
import com.warehouse.project.responsitory.warehouse.ProductionOrderRes;
import com.warehouse.project.service.warehouse.Other.IProductionorder;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class ProductionOrderImpl implements IProductionorder{
    @Autowired
    ProductionOrderRes lab;

    @Override
    public List<Productionorder> findall() {
      return lab.findAll();
    }
}
