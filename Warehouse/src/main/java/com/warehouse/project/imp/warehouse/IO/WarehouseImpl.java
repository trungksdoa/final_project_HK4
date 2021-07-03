/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.IO;

import com.warehouse.project.model.InputContent;
import com.warehouse.project.model.Warehouse;
import com.warehouse.project.responsitory.warehouse.Warehouse_goods;
import com.warehouse.project.service.warehouse.IWarehouse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class WarehouseImpl implements IWarehouse {

    @Autowired
    Warehouse_goods lab;
    
    
    @Override
    public Warehouse Save(Warehouse input) {
        return lab.save(input);
    }

    @Override
    public List<Warehouse> FindALl() {
       return lab.findAll();
    }

    @Override
    public Warehouse FindDupGoods(String goods_id, String StockCard, String Supplier) {
      return lab.findByGoods(goods_id, StockCard, Supplier);
    }

    @Override
    public List<Warehouse> findAllTop5() {
       return lab.findTop5();
    }

    @Override
    public List<Warehouse> findWhere(String warehouse) {
        return lab.findWhere(warehouse);
    }

//    @Override
//    public Warehouse FindGoodsToSubtract(int goods_id, String StockCard, String Supplier) {
//      return lab.findByGoodsWarehouse(goods_id, StockCard, Supplier);
//    }

    @Override
    public Warehouse FindQuantity(int quantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
