/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.warehouse;

import com.warehouse.project.model.GoodsCatagory;
import com.warehouse.project.model.InputContent;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author trung
 */
public interface WarehouseInput_content extends JpaRepository<InputContent, Integer> {
   @Query(nativeQuery = true, value = "SELECT *\n"
            + "FROM     dbo.input_content\n"
            + "WHERE  goods_id = :id\n")
    public List<Object[]> findALlWherecodeId(@Param("id") String id);
}
