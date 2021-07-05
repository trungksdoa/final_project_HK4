/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.Other;

import com.warehouse.project.model.Materialproduction;
import com.warehouse.project.responsitory.warehouse.VwprodcutionProductionRes;
import com.warehouse.project.service.warehouse.View.MaterialproductionI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class MaterialproductionImp implements MaterialproductionI{
    @Autowired
    VwprodcutionProductionRes lab;

    @Override
    public List<Materialproduction> findALl(int keyword) {
        return lab.findALl(keyword);
    }
}
