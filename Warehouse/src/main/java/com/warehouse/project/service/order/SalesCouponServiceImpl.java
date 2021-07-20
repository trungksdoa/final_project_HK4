/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.order;

import com.warehouse.project.model.SalesCoupon;
import com.warehouse.project.responsitory.order.SalesCouponRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lenovo
 */
@Service
public class SalesCouponServiceImpl implements ISalesCouponService {

    @Autowired
    SalesCouponRepository repository;

    @Override
    public void save(SalesCoupon salesCoupon) {
        repository.save(salesCoupon);
    }

    @Override
    public SalesCoupon findOne(String id) {
        return repository.getById(id);
    }

    @Override
    public List<SalesCoupon> getListSalesCoupon() {
        return repository.getAllSalesCoupon();
    }

    @Override
    public List<SalesCoupon> getByDate(String fromdate, String tomdate) {
        return repository.getByDate(fromdate, tomdate);
    }

    @Override
    public List<SalesCoupon> getByDate(String fromdate) {
        return repository.getByDate(fromdate);
    }

    @Override
    public List<SalesCoupon> getLikeId(String id) {
        return repository.getLikeId(id);
    }

    @Override
    public List<SalesCoupon> getBycircumstance(int circumstance) {
        return repository.getLByStatus(circumstance);
    }

}
