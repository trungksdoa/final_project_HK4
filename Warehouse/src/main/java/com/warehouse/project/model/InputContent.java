/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @NamedQuery(name = "InputContent.findByGoodsId", query = "SELECT i FROM InputContent i WHERE i.goodsId = :goodsId"),
    @NamedQuery(name = "InputContent.findByGoodsName", query = "SELECT i FROM InputContent i WHERE i.goodsName = :goodsName"),
    @NamedQuery(name = "InputContent.findByUnit", query = "SELECT i FROM InputContent i WHERE i.unit = :unit"),
    @NamedQuery(name = "InputContent.findByQuantity", query = "SELECT i FROM InputContent i WHERE i.quantity = :quantity"),
    @NamedQuery(name = "InputContent.findByWarehouse", query = "SELECT i FROM InputContent i WHERE i.warehouse = :warehouse"),
    @NamedQuery(name = "InputContent.findByImportsPrices", query = "SELECT i FROM InputContent i WHERE i.importsPrices = :importsPrices"),
    @NamedQuery(name = "InputContent.findByGroupGoods", query = "SELECT i FROM InputContent i WHERE i.groupGoods = :groupGoods"),
    @NamedQuery(name = "InputContent.findByWeight", query = "SELECT i FROM InputContent i WHERE i.weight = :weight"),
    @NamedQuery(name = "InputContent.findBySupplier", query = "SELECT i FROM InputContent i WHERE i.supplier = :supplier"),
    @NamedQuery(name = "InputContent.findByReference", query = "SELECT i FROM InputContent i WHERE i.reference = :reference")})
public class InputContent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "goods_id")
    private String goodsId;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "unit")
    private String unit;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "warehouse")
    private String warehouse;
    @Column(name = "imports_prices")
    private Integer importsPrices;
    @Column(name = "group_goods")
    private String groupGoods;
    @Column(name = "weight")
    private Integer weight;
    @Column(name = "supplier")
    private String supplier;
    @Column(name = "reference")
    private String reference;
    @JoinColumn(name = "input_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    @JsonIgnore
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

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public Integer getImportsPrices() {
        return importsPrices;
    }

    public void setImportsPrices(Integer importsPrices) {
        this.importsPrices = importsPrices;
    }

    public String getGroupGoods() {
        return groupGoods;
    }

    public void setGroupGoods(String groupGoods) {
        this.groupGoods = groupGoods;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
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
