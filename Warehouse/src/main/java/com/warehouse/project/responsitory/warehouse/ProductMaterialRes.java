/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.warehouse;

import com.warehouse.project.model.Productiongoods;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author trung
 */
public interface ProductMaterialRes extends JpaRepository<Productiongoods, Integer> {

    @Query("SELECT p FROM Productiongoods p WHERE p.orderRequirement = :orderRequirement")
    List<Productiongoods> findByList(@Param("orderRequirement") String keyword);
}
