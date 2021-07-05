/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.IO;

import com.warehouse.project.model.Checkslip;
import com.warehouse.project.responsitory.warehouse.ICheckstockRes;
import com.warehouse.project.service.warehouse.ICheckstock;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class ICheckstockImpl implements ICheckstock {

    @Autowired
    ICheckstockRes lab;

    @Override
    public Checkslip Save(Checkslip checkslip) {
        return lab.save(checkslip);
    }

    @Override
    public List<Checkslip> findALl() {
        return lab.findAll();
    }

    @Override
    public Checkslip findOne(int id) {

        Optional<Checkslip> option = lab.findById(id);

        Checkslip object = option.get();
        return object;
    }

    @Override
    public Checkslip update(Checkslip checkslip) {
       return lab.save(checkslip);
    }

}
