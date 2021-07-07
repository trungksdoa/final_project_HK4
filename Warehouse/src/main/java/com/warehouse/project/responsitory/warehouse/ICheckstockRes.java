/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.warehouse;

import com.warehouse.project.model.Checkslip;
import java.util.List;
import javax.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author trung
 */
public interface ICheckstockRes extends JpaRepository<Checkslip, Integer> {

    @Query("SELECT c FROM Checkslip c WHERE c.checkslipid = :checkslipid")

    List<Checkslip> ListByCheckId(@Param("checkslipid") String id);

//    @Query("SELECT c FROM Checkslip c WHERE c.checkslipid = :checkslipid AND c.goodsId = :goodsId")
//
//    Checkslip UpdateList(@Param("checkslipid") String id, @Param("goodsId") String goodsid);
}
