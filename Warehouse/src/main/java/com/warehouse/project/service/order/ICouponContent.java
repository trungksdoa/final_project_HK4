/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.order;

import com.warehouse.project.model.VoucherContent;
import java.util.List;

/**
 *
 * @author trung
 */
public interface ICouponContent {
    public abstract List<VoucherContent> findALl(String keyword);
}
