/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.model.beanclass;

/**
 *
 * @author trung
 */
public class WarehouseStock {
    public  String Warehouse;

    public WarehouseStock(String Warehouse) {
        this.Warehouse = Warehouse;
    }

    public String getWarehouse() {
        return Warehouse;
    }

    public void setWarehouse(String Warehouse) {
        this.Warehouse = Warehouse;
    }
    
}
