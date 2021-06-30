/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse;

import com.warehouse.project.model.GoodsCatagory;
import com.warehouse.project.model.InputContent;
import com.warehouse.project.responsitory.warehouse.Warehouse_content;
import com.warehouse.project.service.warehouse.IInputContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class IInputContentImpl implements IInputContent {

    @Autowired
    Warehouse_content lab;

    @Override
    public InputContent Save(InputContent input) {
        return lab.save(input);
    }



}
