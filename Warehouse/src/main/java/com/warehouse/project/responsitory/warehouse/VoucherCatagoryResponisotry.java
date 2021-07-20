/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.warehouse;

import com.warehouse.project.model.Catagoryvoucher;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author trung
 */
public interface VoucherCatagoryResponisotry extends JpaRepository<Catagoryvoucher, String> {

    @Query("SELECT c FROM Catagoryvoucher c WHERE c.voucherId = :voucherId")
    List<Catagoryvoucher> findByList(@Param("voucherId") String keyword);
}
