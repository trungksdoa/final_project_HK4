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
@Table(name = "Productiongoods")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productiongoods.findAll", query = "SELECT p FROM Productiongoods p"),
    @NamedQuery(name = "Productiongoods.findById", query = "SELECT p FROM Productiongoods p WHERE p.id = :id"),
    @NamedQuery(name = "Productiongoods.findByMaterialId", query = "SELECT p FROM Productiongoods p WHERE p.materialId = :materialId"),
    @NamedQuery(name = "Productiongoods.findByGoodsName", query = "SELECT p FROM Productiongoods p WHERE p.goodsName = :goodsName"),
    @NamedQuery(name = "Productiongoods.findByUnit", query = "SELECT p FROM Productiongoods p WHERE p.unit = :unit"),
    @NamedQuery(name = "Productiongoods.findByQuantityon1", query = "SELECT p FROM Productiongoods p WHERE p.quantityon1 = :quantityon1"),
    @NamedQuery(name = "Productiongoods.findByQuantity", query = "SELECT p FROM Productiongoods p WHERE p.quantity = :quantity"),
    @NamedQuery(name = "Productiongoods.findByPrice", query = "SELECT p FROM Productiongoods p WHERE p.price = :price"),
    @NamedQuery(name = "Productiongoods.findByGoodsId", query = "SELECT p FROM Productiongoods p WHERE p.goodsId = :goodsId"),
    @NamedQuery(name = "Productiongoods.findByOrderRequirement", query = "SELECT p FROM Productiongoods p WHERE p.orderRequirement = :orderRequirement")})
public class Productiongoods implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    @Id
    private int id;
    @Basic(optional = false)
    @Column(name = "material_id")
    private String materialId;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "unit")
    private String unit;
    @Column(name = "quantityon1")
    private Integer quantityon1;
    @Column(name = "quantity")
    private Integer quantity;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Double price;
    @Column(name = "goods_id")
    private String goodsId;
    @Basic(optional = false)
    @Column(name = "order_requirement")
    private String orderRequirement;

    public Productiongoods() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
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

    public Integer getQuantityon1() {
        return quantityon1;
    }

    public void setQuantityon1(Integer quantityon1) {
        this.quantityon1 = quantityon1;
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

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getOrderRequirement() {
        return orderRequirement;
    }

    public void setOrderRequirement(String orderRequirement) {
        this.orderRequirement = orderRequirement;
    }
    
}
