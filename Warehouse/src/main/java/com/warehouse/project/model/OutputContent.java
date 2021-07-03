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
@Table(name = "output_content")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OutputContent.findAll", query = "SELECT o FROM OutputContent o"),
    @NamedQuery(name = "OutputContent.findById", query = "SELECT o FROM OutputContent o WHERE o.id = :id"),
    @NamedQuery(name = "OutputContent.findByGoodsId", query = "SELECT o FROM OutputContent o WHERE o.goodsId = :goodsId"),
    @NamedQuery(name = "OutputContent.findByGoodsName", query = "SELECT o FROM OutputContent o WHERE o.goodsName = :goodsName"),
    @NamedQuery(name = "OutputContent.findByUnit", query = "SELECT o FROM OutputContent o WHERE o.unit = :unit"),
    @NamedQuery(name = "OutputContent.findByWarehouse", query = "SELECT o FROM OutputContent o WHERE o.warehouse = :warehouse"),
    @NamedQuery(name = "OutputContent.findByQuantity", query = "SELECT o FROM OutputContent o WHERE o.quantity = :quantity"),
    @NamedQuery(name = "OutputContent.findByExportsPrices", query = "SELECT o FROM OutputContent o WHERE o.exportsPrices = :exportsPrices"),
    @NamedQuery(name = "OutputContent.findByGroupGoods", query = "SELECT o FROM OutputContent o WHERE o.groupGoods = :groupGoods"),
    @NamedQuery(name = "OutputContent.findByWeight", query = "SELECT o FROM OutputContent o WHERE o.weight = :weight"),
    @NamedQuery(name = "OutputContent.findBySupplier", query = "SELECT o FROM OutputContent o WHERE o.supplier = :supplier")})
public class OutputContent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "goods_id")
    private String goodsId;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "unit")
    private String unit;
    @Column(name = "warehouse")
    private String warehouse;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "exports_prices")
    private Integer exportsPrices;
    @Column(name = "group_goods")
    private String groupGoods;
    @Column(name = "weight")
    private Integer weight;
    @Column(name = "supplier")
    private String supplier;
    @JoinColumn(name = "output_id", referencedColumnName = "id")
    @ManyToOne
    @JsonIgnore
    private Output outputId;

    public OutputContent() {
    }

    public OutputContent(Integer id) {
        this.id = id;
    }

    public OutputContent(Integer id, String goodsId) {
        this.id = id;
        this.goodsId = goodsId;
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

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getExportsPrices() {
        return exportsPrices;
    }

    public void setExportsPrices(Integer exportsPrices) {
        this.exportsPrices = exportsPrices;
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

    public Output getOutputId() {
        return outputId;
    }

    public void setOutputId(Output outputId) {
        this.outputId = outputId;
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
        if (!(object instanceof OutputContent)) {
            return false;
        }
        OutputContent other = (OutputContent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.OutputContent[ id=" + id + " ]";
    }
    
}
