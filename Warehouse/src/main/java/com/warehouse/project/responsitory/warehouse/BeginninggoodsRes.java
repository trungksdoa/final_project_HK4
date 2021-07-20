/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.warehouse;

import com.warehouse.project.model.Beginninggoods;
import com.warehouse.project.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author trung
 */
public interface BeginninggoodsRes extends JpaRepository<Beginninggoods, Integer> {

    @Query(nativeQuery = true, value = "SELECT  * FROM Beginninggoods  WHERE goods_id = :goodsIdss AND stock_card = :stock")
    public Beginninggoods findByIdDData(@Param("goodsIdss") String id, @Param("stock") String stock);
}
