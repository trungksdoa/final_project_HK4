/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse;

import com.warehouse.project.model.Groupcatagory;
import com.warehouse.project.responsitory.warehouse.goodsResponisotry;
import com.warehouse.project.service.warehouse.Igoodscatagory;
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
    public List<Groupcatagory> findALl() {
        return lag.findAll();
    }

 

}
