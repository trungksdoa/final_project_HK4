/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.Other;

import com.warehouse.project.model.Vwtotal;
import com.warehouse.project.responsitory.warehouse.IVwtotalRes;
import com.warehouse.project.service.warehouse.View.IVwtotal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class IVwtotalImp implements IVwtotal {

    @Autowired
    IVwtotalRes lab;

    @Override
    public List<Vwtotal> findALl() {
        return lab.findAll();
    }

}
