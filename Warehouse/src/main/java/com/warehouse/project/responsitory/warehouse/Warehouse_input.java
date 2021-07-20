/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.warehouse;

import com.warehouse.project.model.Input;
import com.warehouse.project.model.Input;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author trung
 */
public interface Warehouse_input extends JpaRepository<Input, String> {

    @Query(nativeQuery = true,
            value = "SELECT TOP 1 * FROM input ORDER BY ID DESC")
    Input findByList();

    @Query("SELECT i FROM Input i WHERE i.status = 1 OR i.status  = 2")
    List<Input> findAll();
}
