/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.IO;

import com.warehouse.project.model.TranferWarehouse;
import com.warehouse.project.responsitory.warehouse.TranferWarehouseRes;
import com.warehouse.project.service.warehouse.ITranferWarehouse;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class TranferWarehouseImpl implements ITranferWarehouse {

    @Autowired
    TranferWarehouseRes lab;

    @Override
    public TranferWarehouse save(TranferWarehouse tranferWarehouse) {
        return lab.save(tranferWarehouse);
    }

    @Override
    public List<TranferWarehouse> findAll() {
        return lab.findAll();
    }

    @Override
    public TranferWarehouse findOne(String id) {
        Optional<TranferWarehouse> option = lab.findById(id);
        TranferWarehouse object = option.get();
        return object;
    }

    @Override
    public TranferWarehouse ListOne() {
        return lab.findByList();
    }

}
