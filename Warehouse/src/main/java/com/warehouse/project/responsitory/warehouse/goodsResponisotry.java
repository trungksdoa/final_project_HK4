/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.warehouse;
import com.warehouse.project.model.GoodsCatagory;
import com.warehouse.project.model.CatagoryGroupSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author trung
 */
public interface goodsResponisotry extends JpaRepository<CatagoryGroupSupplier, String> {
    @Query("SELECT c FROM CatagoryGroupSupplier c WHERE c.id = :id AND c.goodsName = :goodsName")
    public CatagoryGroupSupplier SearchWhere(@Param("id") String id, @Param("goodsName") String name);
}
