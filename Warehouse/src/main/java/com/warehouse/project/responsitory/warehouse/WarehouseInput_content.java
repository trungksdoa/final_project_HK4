/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.warehouse;

import com.warehouse.project.model.GoodsCatagory;
import com.warehouse.project.model.Input;
import com.warehouse.project.model.InputContent;
import com.warehouse.project.model.beanclass.InputDTO;
import com.warehouse.project.model.beanclass.TranferContnetDTO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author trung
 */
public interface WarehouseInput_content extends JpaRepository<InputContent, Integer> {

    @Query(nativeQuery = true, value = "SELECT *\n"
            + "FROM     dbo.input_content\n"
            + "WHERE  input_id = :id\n")
    public List<Object[]> findALlWhereinput(@Param("id") String id);

    @Query("SELECT i FROM InputContent i WHERE i.goodsId = :id AND i.warehouse = :warehouse AND  i.inputId = :inputId")
    public InputContent findWhereId(@PathVariable("id") String id, @PathVariable("warehouse") String warehouse, @PathVariable("inputId") Input inputId);

    @Query("SELECT i FROM InputContent i WHERE i.inputId = :idinput")
    public List<InputContent> findWhereinputId(@PathVariable("idinput") Input idinput);

    @Query("SELECT i FROM InputContent i WHERE i.goodsId = :code")
    InputContent findByTwo(@PathVariable("code") String code);

}
