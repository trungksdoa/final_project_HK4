/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.order;

import com.warehouse.project.model.VoucherContent;
import com.warehouse.project.responsitory.order.VoucherResponisotry;
import com.warehouse.project.service.order.ICouponContent;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class VoucherImpl implements ICouponContent {

    @Autowired
    VoucherResponisotry lab;

    @Override
    public List<VoucherContent> findALl(String keyword) {
        List<VoucherContent> arraContents = lab.findByList(keyword);
        return arraContents;
    }

}
