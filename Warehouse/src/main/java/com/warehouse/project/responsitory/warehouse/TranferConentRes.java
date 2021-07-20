/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.warehouse;

import com.warehouse.project.model.TranferConent;
import com.warehouse.project.model.TranferWarehouse;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author trung
 */
public interface TranferConentRes extends JpaRepository<TranferConent, Integer> {

    @Query("SELECT t FROM TranferConent t WHERE t.id = :id")
    TranferConent findByOne(@PathVariable("id") Integer id);

    
    @Query("SELECT t FROM TranferConent t WHERE t.goodsid = :code AND t.traferId = :tranferId")
    TranferConent findByTwo(@PathVariable("code") String code,@PathVariable("tranferId") TranferWarehouse  tranferId);
}
