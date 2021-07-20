/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.warehouse;

import com.warehouse.project.model.Warehouse;
import java.util.List;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author trung
 */
public interface IWarehouse {

    public abstract Warehouse Save(Warehouse input);

    public abstract List<Object[]> FindALl(String stockcard);

    public abstract Warehouse FindDupGoods(String goods_id, String StockCard, String Supplier);

    public abstract List<Warehouse> findAllData();

    public abstract List<Object[]> findAllWarehouse();

    public abstract List<Object[]> findAll(String id);

    public abstract Warehouse findOnes(String id, String warehouse);

    public abstract List<Warehouse> findWhere(String warehouse);

    public abstract List<Object[]> findAllGroupById();

    public abstract List<Warehouse> SearchWhere(String keyword);

    public abstract List<Warehouse> SearchByDataList(String SearchByDataList);
    

}
