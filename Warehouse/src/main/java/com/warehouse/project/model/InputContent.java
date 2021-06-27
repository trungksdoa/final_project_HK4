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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author trung
 */
@Entity
@Table(name = "input_content")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InputContent.findAll", query = "SELECT i FROM InputContent i"),
    @NamedQuery(name = "InputContent.findById", query = "SELECT i FROM InputContent i WHERE i.id = :id"),
    @NamedQuery(name = "InputContent.findByGoodsName", query = "SELECT i FROM InputContent i WHERE i.goodsName = :goodsName"),
    @NamedQuery(name = "InputContent.findByUnit", query = "SELECT i FROM InputContent i WHERE i.unit = :unit"),
    @NamedQuery(name = "InputContent.findByQuantity", query = "SELECT i FROM InputContent i WHERE i.quantity = :quantity"),
    @NamedQuery(name = "InputContent.findByWarehouse", query = "SELECT i FROM InputContent i WHERE i.warehouse = :warehouse"),
    @NamedQuery(name = "InputContent.findByImportsPrices", query = "SELECT i FROM InputContent i WHERE i.importsPrices = :importsPrices"),
    @NamedQuery(name = "InputContent.findByAfterPrice", query = "SELECT i FROM InputContent i WHERE i.afterPrice = :afterPrice"),
    @NamedQuery(name = "InputContent.findByGroupGoods", query = "SELECT i FROM InputContent i WHERE i.groupGoods = :groupGoods"),
    @NamedQuery(name = "InputContent.findByWeight", query = "SELECT i FROM InputContent i WHERE i.weight = :weight")})
public class InputContent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "unit")
    private String unit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quantity")
    private Double quantity;
    @Column(name = "warehouse")
    private String warehouse;
    @Column(name = "imports_prices")
    private Double importsPrices;
    @Column(name = "after_price")
    private Double afterPrice;
    @Column(name = "group_goods")
    private String groupGoods;
    @Column(name = "weight")
    private Double weight;
    @JoinColumn(name = "goods_id", referencedColumnName = "id")
    @ManyToOne
    private GoodsCatagory goodsId;
    @JoinColumn(name = "input_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Input inputId;

    public InputContent() {
    }

    public InputContent(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
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

    public Double getAfterPrice() {
        return afterPrice;
    }

    public void setAfterPrice(Double afterPrice) {
        this.afterPrice = afterPrice;
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

    public GoodsCatagory getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(GoodsCatagory goodsId) {
        this.goodsId = goodsId;
    }

    public Input getInputId() {
        return inputId;
    }

    public void setInputId(Input inputId) {
        this.inputId = inputId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InputContent)) {
            return false;
        }
        InputContent other = (InputContent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.InputContent[ id=" + id + " ]";
    }
    
}
