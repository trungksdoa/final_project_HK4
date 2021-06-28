/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werehouse.project.model;

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
 * @author PC
 */
@Entity
@Table(name = "Warehouse", catalog = "Databases_", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Warehouse.findAll", query = "SELECT w FROM Warehouse w"),
    @NamedQuery(name = "Warehouse.findByGoodsId", query = "SELECT w FROM Warehouse w WHERE w.goodsId = :goodsId"),
    @NamedQuery(name = "Warehouse.findByGoodsName", query = "SELECT w FROM Warehouse w WHERE w.goodsName = :goodsName"),
    @NamedQuery(name = "Warehouse.findByUnit", query = "SELECT w FROM Warehouse w WHERE w.unit = :unit"),
    @NamedQuery(name = "Warehouse.findByQuantityInStock", query = "SELECT w FROM Warehouse w WHERE w.quantityInStock = :quantityInStock"),
    @NamedQuery(name = "Warehouse.findByImportPrice", query = "SELECT w FROM Warehouse w WHERE w.importPrice = :importPrice"),
    @NamedQuery(name = "Warehouse.findByPriceInStock", query = "SELECT w FROM Warehouse w WHERE w.priceInStock = :priceInStock"),
    @NamedQuery(name = "Warehouse.findBySellPrice", query = "SELECT w FROM Warehouse w WHERE w.sellPrice = :sellPrice"),
    @NamedQuery(name = "Warehouse.findByGroupGoods", query = "SELECT w FROM Warehouse w WHERE w.groupGoods = :groupGoods"),
    @NamedQuery(name = "Warehouse.findByWeight", query = "SELECT w FROM Warehouse w WHERE w.weight = :weight")})
public class Warehouse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "goods_id", nullable = false, length = 50)
    private String goodsId;
    @Column(name = "goods_name", length = 50)
    private String goodsName;
    @Column(name = "unit", length = 20)
    private String unit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quantity_in_stock", precision = 53)
    private Double quantityInStock;
    @Column(name = "import_price", precision = 53)
    private Double importPrice;
    @Column(name = "price_in_stock", precision = 53)
    private Double priceInStock;
    @Column(name = "sell_price", precision = 53)
    private Double sellPrice;
    @Column(name = "group_goods", length = 5)
    private String groupGoods;
    @Column(name = "weight", precision = 53)
    private Double weight;
    @JoinColumn(name = "stock_card", referencedColumnName = "id")
    @ManyToOne
    private StockCard stockCard;
    @OneToMany(mappedBy = "goodsId")
    private Collection<QrCode> qrCodeCollection;

    public Warehouse() {
    }

    public Warehouse(String goodsId) {
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
    public Collection<QrCode> getQrCodeCollection() {
        return qrCodeCollection;
    }

    public void setQrCodeCollection(Collection<QrCode> qrCodeCollection) {
        this.qrCodeCollection = qrCodeCollection;
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
        if (!(object instanceof Warehouse)) {
            return false;
        }
        Warehouse other = (Warehouse) object;
        if ((this.goodsId == null && other.goodsId != null) || (this.goodsId != null && !this.goodsId.equals(other.goodsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.werehouse.project.model.Warehouse[ goodsId=" + goodsId + " ]";
    }
    
}
