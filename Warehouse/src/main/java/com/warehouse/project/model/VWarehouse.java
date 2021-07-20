/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author trung
 */
@Entity
@Table(name = "V_Warehouse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VWarehouse.findAll", query = "SELECT v FROM VWarehouse v"),
    @NamedQuery(name = "VWarehouse.findByGoodsId", query = "SELECT v FROM VWarehouse v WHERE v.goodsId = :goodsId"),
    @NamedQuery(name = "VWarehouse.findByGoodsName", query = "SELECT v FROM VWarehouse v WHERE v.goodsName = :goodsName"),
    @NamedQuery(name = "VWarehouse.findByUnit", query = "SELECT v FROM VWarehouse v WHERE v.unit = :unit"),
    @NamedQuery(name = "VWarehouse.findByQuantityInStock", query = "SELECT v FROM VWarehouse v WHERE v.quantityInStock = :quantityInStock")})
public class VWarehouse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "goods_id")
    @Id
    private String goodsId;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "unit")
    private String unit;
    @Column(name = "quantity_in_stock")
    private Integer quantityInStock;

    public VWarehouse() {
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
    
}
