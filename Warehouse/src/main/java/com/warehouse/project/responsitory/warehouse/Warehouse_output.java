/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.warehouse;

import com.warehouse.project.model.Output;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author trung
 */
public interface Warehouse_output extends JpaRepository<Output, String> {

    @Query(nativeQuery = true,
            value = "SELECT TOP 1 * FROM Output ORDER BY ID DESC")
    Output findByList();

    @Query("SELECT i FROM Output i WHERE i.status = 1 OR i.status = 2")
    List<Output> findAll();
}
