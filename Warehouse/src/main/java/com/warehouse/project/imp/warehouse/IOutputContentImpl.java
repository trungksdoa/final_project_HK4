/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse;

import com.warehouse.project.model.GoodsCatagory;
import com.warehouse.project.model.OutputContent;
import com.warehouse.project.service.warehouse.IOutputConent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.warehouse.project.responsitory.warehouse.WarehouseOutput_content;

/**
 *
 * @author trung
 */
@Service
public class IOutputContentImpl implements IOutputConent {

    @Autowired
    WarehouseOutput_content lab;

    @Override
    public OutputContent Save(OutputContent content) {
        return lab.save(content);
    }



}
