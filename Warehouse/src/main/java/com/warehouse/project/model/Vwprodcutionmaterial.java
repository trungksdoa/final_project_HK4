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
    @NamedQuery(name = "Vwprodcutionmaterial.findByWeight", query = "SELECT v FROM Vwprodcutionmaterial v WHERE v.weight = :weight"),
    @NamedQuery(name = "Vwprodcutionmaterial.findByProductionordercontentid", query = "SELECT v FROM Vwprodcutionmaterial v WHERE v.productionordercontentid = :productionordercontentid"),
    @NamedQuery(name = "Vwprodcutionmaterial.findByGroupGoods", query = "SELECT v FROM Vwprodcutionmaterial v WHERE v.groupGoods = :groupGoods")})
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
    @Column(name = "weight")
    private Integer weight;
    @Column(name = "Production_order_content_id")
    private Integer productionordercontentid;
    @Column(name = "group_goods")
    private String groupGoods;

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

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getProductionordercontentid() {
        return productionordercontentid;
    }

    public void setProductionordercontentid(Integer productionordercontentid) {
        this.productionordercontentid = productionordercontentid;
    }

    public String getGroupGoods() {
        return groupGoods;
    }

    public void setGroupGoods(String groupGoods) {
        this.groupGoods = groupGoods;
    }
    
}
