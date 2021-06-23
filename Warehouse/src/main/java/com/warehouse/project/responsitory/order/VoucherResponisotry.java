/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.order;

import com.warehouse.project.model.VoucherContent;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author trung
 */
public interface VoucherResponisotry extends JpaRepository<VoucherContent, String> {

    @Query("Select u from voucher_content u Where u.couponId >= :keyword")
    List<VoucherContent> findByList(@PathVariable("keyword") String keyword);
}
