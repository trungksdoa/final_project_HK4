/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.model;

import java.io.Serializable;
import javax.persistence.Basic;
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
@Table(name = "Vw_warehouse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vwwarehouse.findAll", query = "SELECT v FROM Vwwarehouse v"),
    @NamedQuery(name = "Vwwarehouse.findById", query = "SELECT v FROM Vwwarehouse v WHERE v.id = :id"),
    @NamedQuery(name = "Vwwarehouse.findByGoodsId", query = "SELECT v FROM Vwwarehouse v WHERE v.goodsId = :goodsId"),
    @NamedQuery(name = "Vwwarehouse.findByGoodsName", query = "SELECT v FROM Vwwarehouse v WHERE v.goodsName = :goodsName"),
    @NamedQuery(name = "Vwwarehouse.findByUnit", query = "SELECT v FROM Vwwarehouse v WHERE v.unit = :unit"),
    @NamedQuery(name = "Vwwarehouse.findByQuantityInStock", query = "SELECT v FROM Vwwarehouse v WHERE v.quantityInStock = :quantityInStock"),
    @NamedQuery(name = "Vwwarehouse.findByImportPrice", query = "SELECT v FROM Vwwarehouse v WHERE v.importPrice = :importPrice"),
    @NamedQuery(name = "Vwwarehouse.findBySupplier", query = "SELECT v FROM Vwwarehouse v WHERE v.supplier = :supplier"),
    @NamedQuery(name = "Vwwarehouse.findByPriceInStock", query = "SELECT v FROM Vwwarehouse v WHERE v.priceInStock = :priceInStock"),
    @NamedQuery(name = "Vwwarehouse.findBySellPrice", query = "SELECT v FROM Vwwarehouse v WHERE v.sellPrice = :sellPrice"),
    @NamedQuery(name = "Vwwarehouse.findByGroupGoods", query = "SELECT v FROM Vwwarehouse v WHERE v.groupGoods = :groupGoods"),
    @NamedQuery(name = "Vwwarehouse.findByWeight", query = "SELECT v FROM Vwwarehouse v WHERE v.weight = :weight"),
    @NamedQuery(name = "Vwwarehouse.findByWarehouse", query = "SELECT v FROM Vwwarehouse v WHERE v.warehouse = :warehouse")})
public class Vwwarehouse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    @Id
    private int id;
    @Column(name = "goods_id")
    private String goodsId;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "unit")
    private String unit;
    @Column(name = "quantity_in_stock")
    private Integer quantityInStock;
    @Column(name = "import_price")
    private Integer importPrice;
    @Column(name = "supplier")
    private String supplier;
    @Column(name = "price_in_stock")
    private Integer priceInStock;
    @Column(name = "sell_price")
    private Integer sellPrice;
    @Column(name = "group_goods")
    private String groupGoods;
    @Column(name = "weight")
    private Integer weight;
    @Basic(optional = false)
    @Column(name = "Warehouse")
    private String warehouse;

    public Vwwarehouse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Integer getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(Integer importPrice) {
        this.importPrice = importPrice;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Integer getPriceInStock() {
        return priceInStock;
    }

    public void setPriceInStock(Integer priceInStock) {
        this.priceInStock = priceInStock;
    }

    public Integer getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Integer sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getGroupGoods() {
        return groupGoods;
    }

    public void setGroupGoods(String groupGoods) {
        this.groupGoods = groupGoods;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }
    
}
