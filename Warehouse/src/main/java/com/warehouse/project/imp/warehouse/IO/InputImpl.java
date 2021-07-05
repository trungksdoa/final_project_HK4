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
import java.util.Optional;

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
        return house.findAll();
    }

    @Override
    public Input findAllId() {
        return house.findByList();
    }

    @Override
    public Input findOne(String id) {
        Optional<Input> option = house.findById(id);
        Input object = option.get();
        return object;
    }

    @Override
    public Input Update(Input input) {
      return house.save(input);
    }

    @Override
    public void Delete(String id) {
      house.deleteById(id);
    }

}
