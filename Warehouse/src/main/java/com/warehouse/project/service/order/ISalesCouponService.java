/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.order;

import com.warehouse.project.model.*;
import java.util.List;

public interface ISalesCouponService {

    void save(SalesCoupon salesCoupon);

    SalesCoupon findOne(String id);

    List<SalesCoupon> getListSalesCoupon();

    List<SalesCoupon> getByDate(String fromdate, String tomdate);

    List<SalesCoupon> getByDate(String fromdate);
    
    List<SalesCoupon> getLikeId(String id);
    
    List<SalesCoupon> getBycircumstance(int circumstance);

}
