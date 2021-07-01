/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.warehouse;

import com.warehouse.project.model.Production;
import java.util.List;
import javax.persistence.Id;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author trung
 */
public interface ProductionViewRes extends CrudRepository<Production, Integer> {
    
    @Query("SELECT p FROM Production p WHERE p.productid = :productid AND p.date BETWEEN :from AND :to")
    public List<Production> findByDateAndId(@Param("productid") String productId,@Param("from") String from,@Param("to") String to);
}
