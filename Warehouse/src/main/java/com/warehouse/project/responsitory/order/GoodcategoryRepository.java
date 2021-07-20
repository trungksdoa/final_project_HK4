/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.order;

import org.springframework.data.jpa.repository.JpaRepository;
import com.warehouse.project.model.*;

/**
 *
 * @author lenovo
 */
public interface GoodcategoryRepository extends JpaRepository<GoodsCatagory, String> {
    
}
