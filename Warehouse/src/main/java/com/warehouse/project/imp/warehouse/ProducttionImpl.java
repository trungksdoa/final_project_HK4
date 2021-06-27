/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse;

import com.warehouse.project.model.Productionorder;
import com.warehouse.project.responsitory.warehouse.ProductionRstr;
import com.warehouse.project.service.warehouse.IProducttion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class ProducttionImpl implements IProducttion {

    @Autowired
    ProductionRstr lab;

    @Override
    public List<Productionorder> findAll() {
        return lab.findAll();
    }

    @Override
    public Productionorder findById(String id) {
        Optional<Productionorder> option = lab.findById(id);
        Productionorder getObject = option.get();
        return getObject;
    }

    @Override
    public List<Productionorder> FindAllByList(String from, String to) {
        return lab.findProduct(from, to);
    }

}
