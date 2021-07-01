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
@Table(name = "Material_production")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materialproduction.findAll", query = "SELECT m FROM Materialproduction m"),
    @NamedQuery(name = "Materialproduction.findById", query = "SELECT m FROM Materialproduction m WHERE m.id = :id"),
    @NamedQuery(name = "Materialproduction.findByGoodsName", query = "SELECT m FROM Materialproduction m WHERE m.goodsName = :goodsName"),
    @NamedQuery(name = "Materialproduction.findByUnit", query = "SELECT m FROM Materialproduction m WHERE m.unit = :unit"),
    @NamedQuery(name = "Materialproduction.findByQuantity", query = "SELECT m FROM Materialproduction m WHERE m.quantity = :quantity"),
    @NamedQuery(name = "Materialproduction.findByPrice", query = "SELECT m FROM Materialproduction m WHERE m.price = :price"),
    @NamedQuery(name = "Materialproduction.findByGoodsId", query = "SELECT m FROM Materialproduction m WHERE m.goodsId = :goodsId"),
    @NamedQuery(name = "Materialproduction.findByExpr1", query = "SELECT m FROM Materialproduction m WHERE m.expr1 = :expr1")})
public class Materialproduction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    @Id
    private String id;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "unit")
    private String unit;
    @Column(name = "quantity")
    private Integer quantity;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Double price;
    @Basic(optional = false)
    @Column(name = "goods_id")
    private int goodsId;
    @Column(name = "Expr1")
    private String expr1;

    public Materialproduction() {
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getExpr1() {
        return expr1;
    }

    public void setExpr1(String expr1) {
        this.expr1 = expr1;
    }
    
}
