/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author trung
 */
@Entity
@Table(name = "Warehouse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Warehouse_1.findAll", query = "SELECT w FROM Warehouse_1 w"),
    @NamedQuery(name = "Warehouse_1.findByGoodsId", query = "SELECT w FROM Warehouse_1 w WHERE w.goodsId = :goodsId"),
    @NamedQuery(name = "Warehouse_1.findByGoodsName", query = "SELECT w FROM Warehouse_1 w WHERE w.goodsName = :goodsName"),
    @NamedQuery(name = "Warehouse_1.findByUnit", query = "SELECT w FROM Warehouse_1 w WHERE w.unit = :unit"),
    @NamedQuery(name = "Warehouse_1.findByQuantityInStock", query = "SELECT w FROM Warehouse_1 w WHERE w.quantityInStock = :quantityInStock"),
    @NamedQuery(name = "Warehouse_1.findByImportPrice", query = "SELECT w FROM Warehouse_1 w WHERE w.importPrice = :importPrice"),
    @NamedQuery(name = "Warehouse_1.findBySupplier", query = "SELECT w FROM Warehouse_1 w WHERE w.supplier = :supplier"),
    @NamedQuery(name = "Warehouse_1.findByPriceInStock", query = "SELECT w FROM Warehouse_1 w WHERE w.priceInStock = :priceInStock"),
    @NamedQuery(name = "Warehouse_1.findBySellPrice", query = "SELECT w FROM Warehouse_1 w WHERE w.sellPrice = :sellPrice"),
    @NamedQuery(name = "Warehouse_1.findByGroupGoods", query = "SELECT w FROM Warehouse_1 w WHERE w.groupGoods = :groupGoods"),
    @NamedQuery(name = "Warehouse_1.findByWeight", query = "SELECT w FROM Warehouse_1 w WHERE w.weight = :weight")})
public class Warehouse_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "goods_id")
    private String goodsId;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "unit")
    private String unit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quantity_in_stock")
    private Double quantityInStock;
    @Column(name = "import_price")
    private Double importPrice;
    @Column(name = "supplier")
    private String supplier;
    @Column(name = "price_in_stock")
    private Double priceInStock;
    @Column(name = "sell_price")
    private Double sellPrice;
    @Column(name = "group_goods")
    private String groupGoods;
    @Column(name = "weight")
    private Double weight;
    @JoinColumn(name = "stock_card", referencedColumnName = "id")
    @ManyToOne
    private StockCard stockCard;
    @OneToMany(mappedBy = "goodsId")
    private Collection<OutputContent> outputContentCollection;

    public Warehouse_1() {
    }

    public Warehouse_1(String goodsId) {
        this.goodsId = goodsId;
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

    public Double getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Double quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public Double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(Double importPrice) {
        this.importPrice = importPrice;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Double getPriceInStock() {
        return priceInStock;
    }

    public void setPriceInStock(Double priceInStock) {
        this.priceInStock = priceInStock;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
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

    public StockCard getStockCard() {
        return stockCard;
    }

    public void setStockCard(StockCard stockCard) {
        this.stockCard = stockCard;
    }

    @XmlTransient
    public Collection<OutputContent> getOutputContentCollection() {
        return outputContentCollection;
    }

    public void setOutputContentCollection(Collection<OutputContent> outputContentCollection) {
        this.outputContentCollection = outputContentCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (goodsId != null ? goodsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Warehouse_1)) {
            return false;
        }
        Warehouse_1 other = (Warehouse_1) object;
        if ((this.goodsId == null && other.goodsId != null) || (this.goodsId != null && !this.goodsId.equals(other.goodsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Warehouse_1[ goodsId=" + goodsId + " ]";
    }
    
}
