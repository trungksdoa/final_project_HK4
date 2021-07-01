/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.Other;

import com.warehouse.project.model.Materialproduction;
import com.warehouse.project.service.warehouse.View.IMaterialProduction;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.warehouse.project.responsitory.warehouse.MaterialProductRs;

/**
 *
 * @author trung
 */
@Service
public class MaterialProductionImpl implements IMaterialProduction {

    @Autowired
    MaterialProductRs lab;
    @Override
    public List<Materialproduction> findAll(int id) {
       return lab.findAllbyId(id);
    }

}
