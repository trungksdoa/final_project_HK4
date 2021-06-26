/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse;

import com.warehouse.project.model.Catagoryvoucher;
import com.warehouse.project.responsitory.warehouse.VoucherCatagoryResponisotry;
import com.warehouse.project.service.warehouse.ICoupoContentViewnContent1;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class VoucherconentImpl1 implements ICoupoContentViewnContent1 {

    @Autowired
    VoucherCatagoryResponisotry lab;

    @Override
    public List<Catagoryvoucher> findALl() {
       return lab.findAll();
    }

    @Override
    public List<Catagoryvoucher> findALlById(String voucherId) {
       return lab.findByList(voucherId);
    }


}
