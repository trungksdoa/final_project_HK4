/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.IO;

import com.warehouse.project.model.Input;
import com.warehouse.project.service.warehouse.IO.IInput;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.warehouse.project.responsitory.warehouse.Warehouse_input;

/**
 *
 * @author trung
 */
@Service
public class InputImpl implements IInput {

    @Autowired
    Warehouse_input house;
    @Override
    public Input Save(Input input) {
      return house.save(input);
    }

    @Override
    public List<Input> findall() {
       return  house.findAll();
    }

    @Override
    public Input findAllId() {
        return  house.findByList();
    }

 

}
