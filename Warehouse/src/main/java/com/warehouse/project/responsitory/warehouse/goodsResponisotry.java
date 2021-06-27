/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.warehouse;
import com.warehouse.project.model.GoodsCatagory;
import com.warehouse.project.model.Groupcatagory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author trung
 */
public interface goodsResponisotry extends JpaRepository<Groupcatagory, String> {
    
}
