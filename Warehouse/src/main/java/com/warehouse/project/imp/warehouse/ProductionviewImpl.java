/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse;

import com.warehouse.project.model.Production;
import com.warehouse.project.responsitory.warehouse.ProductionViewRes;
import com.warehouse.project.service.warehouse.IProductionview;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class ProductionviewImpl implements IProductionview {

    @Autowired
    ProductionViewRes lab;

    @Override
    public List<Production> findByDateAndId(String productId, String from, String to) {
      return lab.findByDateAndId(productId, from, to);
    }

}
