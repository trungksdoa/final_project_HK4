/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.warehouse;

import com.warehouse.project.model.Warehouse;
import java.util.List;

/**
 *
 * @author trung
 */
public interface IWarehouse {

    public abstract Warehouse Save(Warehouse input);

    public abstract List<Warehouse> FindALl();
    
    public abstract Warehouse FindDupGoods(String goods_id,String StockCard,String Supplier);
}
