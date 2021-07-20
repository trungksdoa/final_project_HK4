/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.warehouse;

import com.warehouse.project.model.Input;
import com.warehouse.project.model.Output;
import com.warehouse.project.model.OutputContent;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author trung
 */
public interface WarehouseOutput_content extends JpaRepository<OutputContent, Integer> {

    @Query(nativeQuery = true, value = "SELECT *\n"
            + "FROM     dbo.output_content\n"
            + "WHERE  input_id = :id\n")
    public List<Object[]> findALlWhereinput(@Param("id") String id);

    @Query("SELECT i FROM OutputContent i WHERE i.goodsId = :id AND i.warehouse = :warehouse AND  i.outputId = :outputId")
    public OutputContent findWhereId(@PathVariable("id") String id, @PathVariable("warehouse") String warehouse,@PathVariable("outputId") Output outputId);
    
    @Query("SELECT i FROM OutputContent i WHERE i.goodsId = :code")
    OutputContent findByTwo(@PathVariable("code") String code);

}
