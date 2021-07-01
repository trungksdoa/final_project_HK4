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
@Table(name = "Findbyid")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Findbyid.findAll", query = "SELECT f FROM Findbyid f"),
    @NamedQuery(name = "Findbyid.findById", query = "SELECT f FROM Findbyid f WHERE f.id = :id"),
    @NamedQuery(name = "Findbyid.findByCatagoryids", query = "SELECT f FROM Findbyid f WHERE f.catagoryids = :catagoryids"),
    @NamedQuery(name = "Findbyid.findByGoodsName", query = "SELECT f FROM Findbyid f WHERE f.goodsName = :goodsName"),
    @NamedQuery(name = "Findbyid.findByUnit", query = "SELECT f FROM Findbyid f WHERE f.unit = :unit"),
    @NamedQuery(name = "Findbyid.findByQuantity", query = "SELECT f FROM Findbyid f WHERE f.quantity = :quantity"),
    @NamedQuery(name = "Findbyid.findByWarehouse", query = "SELECT f FROM Findbyid f WHERE f.warehouse = :warehouse"),
    @NamedQuery(name = "Findbyid.findByImportsPrices", query = "SELECT f FROM Findbyid f WHERE f.importsPrices = :importsPrices"),
    @NamedQuery(name = "Findbyid.findByGroupGoods", query = "SELECT f FROM Findbyid f WHERE f.groupGoods = :groupGoods"),
    @NamedQuery(name = "Findbyid.findByWeight", query = "SELECT f FROM Findbyid f WHERE f.weight = :weight"),
    @NamedQuery(name = "Findbyid.findByInputId", query = "SELECT f FROM Findbyid f WHERE f.inputId = :inputId"),
    @NamedQuery(name = "Findbyid.findBySupplier", query = "SELECT f FROM Findbyid f WHERE f.supplier = :supplier")})
public class Findbyid implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    @Id
    private int id;
    @Basic(optional = false)
    @Column(name = "catagoryids")
    private String catagoryids;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "unit")
    private String unit;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "warehouse")
    private String warehouse;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "imports_prices")
    private Double importsPrices;
    @Column(name = "group_goods")
    private String groupGoods;
    @Column(name = "weight")
    private Double weight;
    @Basic(optional = false)
    @Column(name = "input_id")
    private String inputId;
    @Column(name = "supplier")
    private String supplier;

    public Findbyid() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatagoryids() {
        return catagoryids;
    }

    public void setCatagoryids(String catagoryids) {
        this.catagoryids = catagoryids;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public Double getImportsPrices() {
        return importsPrices;
    }

    public void setImportsPrices(Double importsPrices) {
        this.importsPrices = importsPrices;
    }

    public String getGroupGoods() {
        return groupGoods;
    }

    public void setGroupGoods(String groupGoods) {
        this.groupGoods = groupGoods;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getInputId() {
        return inputId;
    }

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
    
}
