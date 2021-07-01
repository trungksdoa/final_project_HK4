/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.IO;

import com.warehouse.project.model.GoodsCatagory;
import com.warehouse.project.model.InputContent;
import com.warehouse.project.service.warehouse.IO.IInputContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.warehouse.project.responsitory.warehouse.WarehouseInput_content;
import java.util.List;

/**
 *
 * @author trung
 */
@Service
public class IInputContentImpl implements IInputContent {

    @Autowired
    WarehouseInput_content lab;

    @Override
    public InputContent Save(InputContent input) {
        return lab.save(input);
    }

    @Override
    public List<InputContent> findAll() {
        return lab.findAll();
    }

}
