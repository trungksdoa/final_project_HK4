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
    public  String name;

    public WarehouseStock(String name) {
        this.name = name;
    }

    public String getWarehouse() {
        return name;
    }

    public void setWarehouse(String name) {
        this.name = name;
    }
    
}
