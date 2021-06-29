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
@Table(name = "Findmaterialbygoods")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Findmaterialbygoods.findAll", query = "SELECT f FROM Findmaterialbygoods f"),
    @NamedQuery(name = "Findmaterialbygoods.findById", query = "SELECT f FROM Findmaterialbygoods f WHERE f.id = :id"),
    @NamedQuery(name = "Findmaterialbygoods.findByGoodsId", query = "SELECT f FROM Findmaterialbygoods f WHERE f.goodsId = :goodsId"),
    @NamedQuery(name = "Findmaterialbygoods.findByGoodsName", query = "SELECT f FROM Findmaterialbygoods f WHERE f.goodsName = :goodsName"),
    @NamedQuery(name = "Findmaterialbygoods.findByExpr1", query = "SELECT f FROM Findmaterialbygoods f WHERE f.expr1 = :expr1"),
    @NamedQuery(name = "Findmaterialbygoods.findByUnit", query = "SELECT f FROM Findmaterialbygoods f WHERE f.unit = :unit"),
    @NamedQuery(name = "Findmaterialbygoods.findByQuantity", query = "SELECT f FROM Findmaterialbygoods f WHERE f.quantity = :quantity"),
    @NamedQuery(name = "Findmaterialbygoods.findByExpr2", query = "SELECT f FROM Findmaterialbygoods f WHERE f.expr2 = :expr2")})
public class Findmaterialbygoods implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    @Id
    private String id;
    @Column(name = "goods_id")
    private String goodsId;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "Expr1")
    private String expr1;
    @Column(name = "unit")
    private String unit;
    @Column(name = "quantity")
    private Integer quantity;
    @Basic(optional = false)
    @Column(name = "Expr2")
    private String expr2;

    public Findmaterialbygoods() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getExpr1() {
        return expr1;
    }

    public void setExpr1(String expr1) {
        this.expr1 = expr1;
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

    public String getExpr2() {
        return expr2;
    }

    public void setExpr2(String expr2) {
        this.expr2 = expr2;
    }
    
}
