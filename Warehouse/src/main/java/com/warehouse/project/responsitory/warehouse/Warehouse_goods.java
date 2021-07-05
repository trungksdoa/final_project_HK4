/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.warehouse;

import com.warehouse.project.model.Warehouse;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author trung
 */
public interface Warehouse_goods extends JpaRepository<Warehouse, Integer> {

    @Query(nativeQuery = true, value = "Select *\n"
            + " From Warehouse\n"
            + " Where goods_id = :goodsId AND stock_card = :stock AND supplier = :supplier")
    public Warehouse findByGoods(@Param("goodsId") String id, @Param("stock") String stock, @Param("supplier") String supplier);

    @Query(nativeQuery = true, value = "SELECT TOP 10 * FROM Warehouse\n"
            + "\n"
            + "ORDER BY quantity_in_stock DESC")
    public List<Warehouse> findTop5();

    @Query(nativeQuery = true, value = "Select *\n"
            + " From Warehouse\n"
            + " Where  stock_card = :stock ")
    public List<Warehouse> findWhere(@Param("stock") String stock);

    @Query(nativeQuery = true, value = "SELECT goods_id, SUM(quantity_in_stock) AS QuantityAll, goods_name\n"
            + "FROM     dbo.Warehouse\n"
            + "WHERE  goods_id = :id\n"
            + "GROUP BY goods_id, goods_name")
    public List<Object[]> findALl(@Param("id") String id);

    @Query(nativeQuery = true, value = "SELECT goods_id, goods_name, SUM(quantity_in_stock) AS QuantityAll\n"
            + "FROM     dbo.Warehouse\n"
            + "GROUP BY goods_id, goods_name")
    public List<Object[]> FindALl();

    @Query(nativeQuery = true, value = "SELECT stock_card as Warehouse\n"
            + "FROM     dbo.Warehouse\n"
            + "GROUP BY stock_card")
    public List<Object[]> FindALlWarehouse();

}
