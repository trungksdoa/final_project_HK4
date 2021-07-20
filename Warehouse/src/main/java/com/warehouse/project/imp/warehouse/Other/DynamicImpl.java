/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.Other;

import com.warehouse.project.model.Dynamicinputcontent;
import com.warehouse.project.responsitory.warehouse.DynamicRes;
import com.warehouse.project.service.warehouse.Other.Idynamic;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class DynamicImpl implements Idynamic {

    @Autowired
    DynamicRes lab;

    @Override
    public List<Dynamicinputcontent> findAll() {
       return lab.findAll();
    }

}
