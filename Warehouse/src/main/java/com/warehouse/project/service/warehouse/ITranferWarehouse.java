/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.warehouse;

import com.warehouse.project.model.TranferWarehouse;
import java.util.List;

/**
 *
 * @author trung
 */
public interface ITranferWarehouse {
    public abstract TranferWarehouse save(TranferWarehouse tranferWarehouse);
    
    public abstract List<TranferWarehouse> findAll();
    
    public abstract TranferWarehouse findOne(String id);
    
     public abstract TranferWarehouse ListOne();
}
