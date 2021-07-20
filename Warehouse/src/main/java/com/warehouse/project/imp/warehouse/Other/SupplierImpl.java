/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.Other;

import com.warehouse.project.model.Supplier;
import com.warehouse.project.responsitory.warehouse.SupplierRes;
import com.warehouse.project.service.warehouse.Other.ISupplier;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class SupplierImpl implements ISupplier{
    @Autowired
    SupplierRes lab;

    @Override
    public List<Supplier> findAll() {
        return lab.findAll();
    }
}
