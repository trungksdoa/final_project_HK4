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
@Table(name = "Vwprodcutionmaterial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vwprodcutionmaterial.findAll", query = "SELECT v FROM Vwprodcutionmaterial v"),
    @NamedQuery(name = "Vwprodcutionmaterial.findById", query = "SELECT v FROM Vwprodcutionmaterial v WHERE v.id = :id"),
    @NamedQuery(name = "Vwprodcutionmaterial.findByGoodsName", query = "SELECT v FROM Vwprodcutionmaterial v WHERE v.goodsName = :goodsName"),
    @NamedQuery(name = "Vwprodcutionmaterial.findByUnit", query = "SELECT v FROM Vwprodcutionmaterial v WHERE v.unit = :unit"),
    @NamedQuery(name = "Vwprodcutionmaterial.findByQuantity", query = "SELECT v FROM Vwprodcutionmaterial v WHERE v.quantity = :quantity"),
    @NamedQuery(name = "Vwprodcutionmaterial.findByPrice", query = "SELECT v FROM Vwprodcutionmaterial v WHERE v.price = :price"),
    @NamedQuery(name = "Vwprodcutionmaterial.findByProductionordercontentid", query = "SELECT v FROM Vwprodcutionmaterial v WHERE v.productionordercontentid = :productionordercontentid"),
    @NamedQuery(name = "Vwprodcutionmaterial.findByProductionorderid", query = "SELECT v FROM Vwprodcutionmaterial v WHERE v.productionorderid = :productionorderid")})
public class Vwprodcutionmaterial implements Serializable {

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
    @Column(name = "Production_order_content_id")
    private Integer productionordercontentid;
    @Column(name = "Production_order_id")
    private String productionorderid;

    public Vwprodcutionmaterial() {
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

    public Integer getProductionordercontentid() {
        return productionordercontentid;
    }

    public void setProductionordercontentid(Integer productionordercontentid) {
        this.productionordercontentid = productionordercontentid;
    }

    public String getProductionorderid() {
        return productionorderid;
    }

    public void setProductionorderid(String productionorderid) {
        this.productionorderid = productionorderid;
    }
    
}
