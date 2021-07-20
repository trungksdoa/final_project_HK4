/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.order;

import org.springframework.data.jpa.repository.JpaRepository;
import com.warehouse.project.model.*;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

public interface SalesCouponRepository extends JpaRepository<SalesCoupon, String> {

    @Query("SELECT s FROM SalesCoupon s WHERE s.status = true")
    public List<SalesCoupon> getAllSalesCoupon();

    @Query("SELECT s FROM SalesCoupon s WHERE s.date BETWEEN :fromdate AND :tomdate")
    public List<SalesCoupon> getByDate(@PathVariable("fromdate") String fromdate, @PathVariable("tomdate") String tomdate);

    @Query("SELECT s FROM SalesCoupon s WHERE s.date >= :fromdate")
    public List<SalesCoupon> getByDate(@PathVariable("fromdate") String fromdate);

    @Query("SELECT s FROM SalesCoupon s WHERE s.id LIKE :id")
    public List<SalesCoupon> getLikeId(@PathVariable("id") String id);
    
    @Query("SELECT s FROM SalesCoupon s WHERE s.circumstance = :circumstance")
    public List<SalesCoupon> getLByStatus(@PathVariable("circumstance") int circumstance);

}
