/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.IO;

import com.warehouse.project.model.TranferConent;
import com.warehouse.project.responsitory.warehouse.TranferConentRes;
import com.warehouse.project.service.warehouse.ITranferContent;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class TranferConentImpl implements ITranferContent {

    @Autowired
    TranferConentRes lab;

    @Override
    public TranferConent save(TranferConent tranferConent) {
        return lab.save(tranferConent);
    }

    @Override
    public List<TranferConent> findALl() {
        return lab.findAll();
    }

    @Override
    public TranferConent findOne(int id) {
        Optional<TranferConent> option = lab.findById(id);
        TranferConent object = option.get();
        return object;
    }

}
