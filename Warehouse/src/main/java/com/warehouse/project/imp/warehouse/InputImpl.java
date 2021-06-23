/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse;

import com.warehouse.project.model.Input;
import com.warehouse.project.responsitory.warehouse.Warehouse;
import com.warehouse.project.service.warehouse.IInput;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class InputImpl implements IInput {

    @Autowired
    Warehouse house;
    @Override
    public boolean Save(Input input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Input> findall() {
       return (List<Input>) house.findAll();
    }

}
