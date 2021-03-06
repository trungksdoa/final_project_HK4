/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.IO;

import com.warehouse.project.model.Output;
import com.warehouse.project.service.warehouse.IO.IOutput;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.warehouse.project.responsitory.warehouse.Warehouse_output;
import java.util.Optional;

/**
 *
 * @author trung
 */
@Service
public class IOutputImpl implements IOutput {

    @Autowired
    Warehouse_output house;

    @Override
    public Output Save(Output output) {
        return house.save(output);
    }

    @Override
    public Output findAllId() {
        return house.findByList();
    }

    @Override
    public List<Output> findall() {
        return house.findAll();
    }

    @Override
    public Output findOne(String id) {
        Optional<Output> option = house.findById(id);
        Output object = option.get();
        return object;
    }

    @Override
    public Output Update(Output output) {
        return house.save(output);
    }

    @Override
    public void Delete(String id) {
        house.deleteById(id);
    }

}
