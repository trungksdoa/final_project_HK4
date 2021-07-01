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
@Table(name = "Production")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Production.findAll", query = "SELECT p FROM Production p"),
    @NamedQuery(name = "Production.findById", query = "SELECT p FROM Production p WHERE p.id = :id"),
    @NamedQuery(name = "Production.findByGoodsId", query = "SELECT p FROM Production p WHERE p.goodsId = :goodsId"),
    @NamedQuery(name = "Production.findByGoodsName", query = "SELECT p FROM Production p WHERE p.goodsName = :goodsName"),
    @NamedQuery(name = "Production.findByUnit", query = "SELECT p FROM Production p WHERE p.unit = :unit"),
    @NamedQuery(name = "Production.findByQuantity", query = "SELECT p FROM Production p WHERE p.quantity = :quantity"),
    @NamedQuery(name = "Production.findByProductid", query = "SELECT p FROM Production p WHERE p.productid = :productid"),
    @NamedQuery(name = "Production.findByDate", query = "SELECT p FROM Production p WHERE p.date = :date"),
    @NamedQuery(name = "Production.findByStatus", query = "SELECT p FROM Production p WHERE p.status = :status")})
public class Production implements Serializable {

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
    @Column(name = "quantity")
    private Integer quantity;
    @Basic(optional = false)
    @Column(name = "productid")
    private String productid;
    @Column(name = "date")
    private String date;
    @Column(name = "status")
    private String status;

    public Production() {
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
