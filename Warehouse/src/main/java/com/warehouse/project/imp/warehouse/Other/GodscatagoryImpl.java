/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.Other;

import com.warehouse.project.model.CatagoryGroupSupplier;
import com.warehouse.project.responsitory.warehouse.goodsResponisotry;
import com.warehouse.project.service.warehouse.Other.Igoodscatagory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class GodscatagoryImpl implements Igoodscatagory {

    @Autowired
    goodsResponisotry lag;

    @Override
    public List<CatagoryGroupSupplier> findALl() {
        return lag.findAll();
    }

    @Override
    public CatagoryGroupSupplier Searchwhere(String id, String name) {
      return lag.SearchWhere(id, name);
    }

 

}
