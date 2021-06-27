/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse;

import com.warehouse.project.model.Productiongoods;
import com.warehouse.project.responsitory.warehouse.ProductMaterialRes;
import com.warehouse.project.service.warehouse.IProductiongmaterial;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class productionmatrialImpl implements IProductiongmaterial{

    @Autowired
    ProductMaterialRes lab;
    
    @Override
    public List<Productiongoods> findALlById(String productId) {
        return lab.findByList(productId);
    }
    
}
