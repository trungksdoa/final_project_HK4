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
@Table(name = "catagory_group_supplier")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatagoryGroupSupplier.findAll", query = "SELECT c FROM CatagoryGroupSupplier c"),
    @NamedQuery(name = "CatagoryGroupSupplier.findById", query = "SELECT c FROM CatagoryGroupSupplier c WHERE c.id = :id"),
    @NamedQuery(name = "CatagoryGroupSupplier.findByGoodsName", query = "SELECT c FROM CatagoryGroupSupplier c WHERE c.goodsName = :goodsName"),
    @NamedQuery(name = "CatagoryGroupSupplier.findByGroupid", query = "SELECT c FROM CatagoryGroupSupplier c WHERE c.groupid = :groupid"),
    @NamedQuery(name = "CatagoryGroupSupplier.findByUnit", query = "SELECT c FROM CatagoryGroupSupplier c WHERE c.unit = :unit"),
    @NamedQuery(name = "CatagoryGroupSupplier.findByFixedPurchasePrice", query = "SELECT c FROM CatagoryGroupSupplier c WHERE c.fixedPurchasePrice = :fixedPurchasePrice"),
    @NamedQuery(name = "CatagoryGroupSupplier.findByLastedPurchasePrice", query = "SELECT c FROM CatagoryGroupSupplier c WHERE c.lastedPurchasePrice = :lastedPurchasePrice"),
    @NamedQuery(name = "CatagoryGroupSupplier.findByUnitPrice", query = "SELECT c FROM CatagoryGroupSupplier c WHERE c.unitPrice = :unitPrice"),
    @NamedQuery(name = "CatagoryGroupSupplier.findByWeight", query = "SELECT c FROM CatagoryGroupSupplier c WHERE c.weight = :weight")})
public class CatagoryGroupSupplier implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    @Id
    private String id;
    @Column(name = "goods_name")
    private String goodsName;
    @Basic(optional = false)
    @Column(name = "groupid")
    private String groupid;
    @Column(name = "unit")
    private String unit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "fixed_purchase_price")
    private Double fixedPurchasePrice;
    @Column(name = "lasted_purchase_price")
    private Double lastedPurchasePrice;
    @Column(name = "unit_price")
    private Double unitPrice;
    @Column(name = "weight")
    private Integer weight;

    public CatagoryGroupSupplier() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getFixedPurchasePrice() {
        return fixedPurchasePrice;
    }

    public void setFixedPurchasePrice(Double fixedPurchasePrice) {
        this.fixedPurchasePrice = fixedPurchasePrice;
    }

    public Double getLastedPurchasePrice() {
        return lastedPurchasePrice;
    }

    public void setLastedPurchasePrice(Double lastedPurchasePrice) {
        this.lastedPurchasePrice = lastedPurchasePrice;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    
}
