/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.warehouse;

import com.warehouse.project.model.Materialproduction;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author trung
 */
public interface VwprodcutionProductionRes extends JpaRepository<Materialproduction, Integer> {

    @Query("SELECT m FROM Materialproduction m WHERE m.id = :id")
    List<Materialproduction> findALl(@Param("id") int keyword);
}
