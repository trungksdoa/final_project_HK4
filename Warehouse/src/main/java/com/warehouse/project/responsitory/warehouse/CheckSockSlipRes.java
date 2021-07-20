/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.warehouse;

import com.warehouse.project.model.Checkstockslip;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author trung
 */
public interface CheckSockSlipRes extends JpaRepository<Checkstockslip, String> {
    @Query(nativeQuery = true,
            value = "SELECT TOP 1 * FROM Checkstockslip ORDER BY ID DESC")
    Checkstockslip findByList();
    
    @Query("SELECT c FROM Checkstockslip c WHERE c.status = 2 OR c.status = 1")
    List<Checkstockslip>findAll();
    @Query("SELECT c FROM Checkstockslip c WHERE c.id = :id")
    Checkstockslip findOne(@Param("id") String ids);
}
