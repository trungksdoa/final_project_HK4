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
@Table(name = "output_content")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OutputContent.findAll", query = "SELECT o FROM OutputContent o"),
    @NamedQuery(name = "OutputContent.findById", query = "SELECT o FROM OutputContent o WHERE o.id = :id"),
    @NamedQuery(name = "OutputContent.findByGoodsName", query = "SELECT o FROM OutputContent o WHERE o.goodsName = :goodsName"),
    @NamedQuery(name = "OutputContent.findByUnit", query = "SELECT o FROM OutputContent o WHERE o.unit = :unit"),
    @NamedQuery(name = "OutputContent.findByWarehouse", query = "SELECT o FROM OutputContent o WHERE o.warehouse = :warehouse"),
    @NamedQuery(name = "OutputContent.findByQuantity", query = "SELECT o FROM OutputContent o WHERE o.quantity = :quantity"),
    @NamedQuery(name = "OutputContent.findByExportsPrices", query = "SELECT o FROM OutputContent o WHERE o.exportsPrices = :exportsPrices"),
    @NamedQuery(name = "OutputContent.findByDiscounts", query = "SELECT o FROM OutputContent o WHERE o.discounts = :discounts"),
    @NamedQuery(name = "OutputContent.findByWeight", query = "SELECT o FROM OutputContent o WHERE o.weight = :weight"),
    @NamedQuery(name = "OutputContent.findBySupplier", query = "SELECT o FROM OutputContent o WHERE o.supplier = :supplier")})
public class OutputContent implements Serializable {

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
    @Column(name = "warehouse")
    private String warehouse;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quantity")
    private Double quantity;
    @Column(name = "exports_prices")
    private Double exportsPrices;
    @Column(name = "discounts")
    private Integer discounts;
    @Column(name = "weight")
    private Double weight;
    @Column(name = "supplier")
    private String supplier;
    @JoinColumn(name = "output_id", referencedColumnName = "id")
    @ManyToOne
    private Output outputId;
    @JoinColumn(name = "goods_id", referencedColumnName = "goods_id")
    @ManyToOne
    private Warehouse_1 goodsId;

    public OutputContent() {
    }

    public OutputContent(Integer id) {
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

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getExportsPrices() {
        return exportsPrices;
    }

    public void setExportsPrices(Double exportsPrices) {
        this.exportsPrices = exportsPrices;
    }

    public Integer getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Integer discounts) {
        this.discounts = discounts;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
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

    public Warehouse_1 getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Warehouse_1 goodsId) {
        this.goodsId = goodsId;
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
