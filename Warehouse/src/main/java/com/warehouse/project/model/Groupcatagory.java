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
@Table(name = "Groupcatagory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Groupcatagory.findAll", query = "SELECT g FROM Groupcatagory g"),
    @NamedQuery(name = "Groupcatagory.findById", query = "SELECT g FROM Groupcatagory g WHERE g.id = :id"),
    @NamedQuery(name = "Groupcatagory.findByGoodsName", query = "SELECT g FROM Groupcatagory g WHERE g.goodsName = :goodsName"),
    @NamedQuery(name = "Groupcatagory.findByUnit", query = "SELECT g FROM Groupcatagory g WHERE g.unit = :unit"),
    @NamedQuery(name = "Groupcatagory.findByFixedPurchasePrice", query = "SELECT g FROM Groupcatagory g WHERE g.fixedPurchasePrice = :fixedPurchasePrice"),
    @NamedQuery(name = "Groupcatagory.findByLastedPurchasePrice", query = "SELECT g FROM Groupcatagory g WHERE g.lastedPurchasePrice = :lastedPurchasePrice"),
    @NamedQuery(name = "Groupcatagory.findByUnitPrice", query = "SELECT g FROM Groupcatagory g WHERE g.unitPrice = :unitPrice"),
    @NamedQuery(name = "Groupcatagory.findByWeight", query = "SELECT g FROM Groupcatagory g WHERE g.weight = :weight"),
    @NamedQuery(name = "Groupcatagory.findByGroupid", query = "SELECT g FROM Groupcatagory g WHERE g.groupid = :groupid")})
public class Groupcatagory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    @Id
    private String id;
    @Column(name = "goods_name")
    private String goodsName;
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
    @Basic(optional = false)
    @Column(name = "Groupid")
    private String groupid;

    public Groupcatagory() {
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

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }
    
}
