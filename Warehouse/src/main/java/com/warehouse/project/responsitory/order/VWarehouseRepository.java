/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.order;


import com.warehouse.project.model.*;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VWarehouseRepository extends JpaRepository<VWarehouse, String> {
    
}
