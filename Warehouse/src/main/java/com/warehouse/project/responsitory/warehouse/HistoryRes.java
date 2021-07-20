/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.warehouse;

import com.warehouse.project.model.Hisio;
import com.warehouse.project.model.beanclass.Hisotryio;
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
    List<Hisio> findALl(@Param("goodsId") String id, @Param("warehouse") String warehouse);

    @Query(value = "Select License,date,goods_id,goods_name,SUM(CASE WHEN quantity > 0 AND Major = 'Input' THEN quantity ELSE 0 END) as Input,SUM(CASE WHEN quantity > 0 AND Major = 'Output' THEN quantity ELSE 0 END) as Output,price as PriceIO,unit\n"
            + "from His_io\n"
            + "Where Major in ('Input','Output')\n"
            + "Group by  License,date,goods_id,goods_name,unit,price", nativeQuery = true)
    List<Object[]> listBy();

    @Query(value = "UPDATE His_io\n"
            + "SET License = :keyword\n"
            + "WHERE id  = :Codeid", nativeQuery = true)
    void Update(@Param("keyword") String keyword, @Param("Codeid") int Codeid);
}
