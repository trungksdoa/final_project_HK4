/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.order;


import com.warehouse.project.model.SalesCouponContent;
import com.warehouse.project.responsitory.order.SalesCouponContentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lenovo
 */
@Service
public class SalesCouponContentServiceImpl implements ISalesCouponContentService{
    @Autowired
    SalesCouponContentRepository reponsitory;

    @Override
    public void save(SalesCouponContent salesCouponContent) {
      reponsitory.save(salesCouponContent);
    }

    @Override
    public List<SalesCouponContent> findBySalesCouponContentId(String id) {
        return reponsitory.findBySalesCouponId(id);
    }

    @Override
    public List<SalesCouponContent> getAllSalesCouponContent() {
        return reponsitory.getAllSalesCouponContent();
    }
    
}
