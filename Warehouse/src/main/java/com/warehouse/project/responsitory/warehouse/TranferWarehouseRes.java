/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.warehouse;

import com.warehouse.project.model.TranferWarehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author trung
 */
public interface TranferWarehouseRes extends JpaRepository<TranferWarehouse, String> {

    @Query(nativeQuery = true,
            value = "SELECT TOP 1 * FROM tranfer_warehouse ORDER BY ID DESC")
    TranferWarehouse findByList();
}
