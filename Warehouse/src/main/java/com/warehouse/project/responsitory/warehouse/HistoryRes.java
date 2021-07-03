/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.warehouse;

import com.warehouse.project.model.Hisio;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author trung
 */
public interface HistoryRes extends JpaRepository<Hisio, Integer> {



    @Query("SELECT h FROM Hisio h WHERE h.goodsId = :goodsId AND h.warehouse = :warehouse")
    List<Hisio> findALl(@Param("goodsId") String id,@Param("warehouse") String warehouse);
}
