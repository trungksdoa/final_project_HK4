/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.order;
import com.warehouse.project.model.Vsalescoupon;
import com.warehouse.project.responsitory.order.VSalesCouponRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VSalesCouponServiceImpl implements IVsalesCouponService{
@Autowired
VSalesCouponRepository reporitory;
    @Override
    public List<Vsalescoupon> getBySalescouponName(String name) {
        return reporitory.findBySalescouponName(name);
    }

    @Override
    public List<Vsalescoupon> getAllVSalesCoupon() {
        return reporitory.findAll();
    }


    
}
