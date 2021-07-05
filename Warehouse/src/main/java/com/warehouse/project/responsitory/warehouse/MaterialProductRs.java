/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.warehouse;

//import com.warehouse.project.model.Materialproduction;
import com.warehouse.project.model.Vwprodcutionmaterial;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author trung
 */
public interface MaterialProductRs extends JpaRepository<Vwprodcutionmaterial, Integer> {
    @Query("SELECT v FROM Vwprodcutionmaterial v WHERE v.productionordercontentid = :productionordercontentid")    
    public List<Vwprodcutionmaterial> findAllbyId(@Param("productionordercontentid") int id);
}
