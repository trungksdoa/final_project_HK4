/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Collection;
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
    @NamedQuery(name = "Warehouse.findAll", query = "SELECT w FROM Warehouse w"),
    @NamedQuery(name = "Warehouse.findById", query = "SELECT w FROM Warehouse w WHERE w.id = :id"),
    @NamedQuery(name = "Warehouse.findByGoodsId", query = "SELECT w FROM Warehouse w WHERE w.goodsId = :goodsId"),
    @NamedQuery(name = "Warehouse.findByGoodsName", query = "SELECT w FROM Warehouse w WHERE w.goodsName = :goodsName"),
    @NamedQuery(name = "Warehouse.findByUnit", query = "SELECT w FROM Warehouse w WHERE w.unit = :unit"),
    @NamedQuery(name = "Warehouse.findByQuantityInStock", query = "SELECT w FROM Warehouse w WHERE w.quantityInStock = :quantityInStock"),
    @NamedQuery(name = "Warehouse.findByImportPrice", query = "SELECT w FROM Warehouse w WHERE w.importPrice = :importPrice"),
    @NamedQuery(name = "Warehouse.findBySupplier", query = "SELECT w FROM Warehouse w WHERE w.supplier = :supplier"),
    @NamedQuery(name = "Warehouse.findByPriceInStock", query = "SELECT w FROM Warehouse w WHERE w.priceInStock = :priceInStock"),
    @NamedQuery(name = "Warehouse.findBySellPrice", query = "SELECT w FROM Warehouse w WHERE w.sellPrice = :sellPrice"),
    @NamedQuery(name = "Warehouse.findByGroupGoods", query = "SELECT w FROM Warehouse w WHERE w.groupGoods = :groupGoods"),
    @NamedQuery(name = "Warehouse.findByWeight", query = "SELECT w FROM Warehouse w WHERE w.weight = :weight")})
public class Warehouse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "goods_id")
    private String goodsId;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "unit")
    private String unit;
    @Column(name = "quantity_in_stock")
    private Integer quantityInStock;
    @Column(name = "import_price")
    private Integer importPrice;
    @Column(name = "supplier")
    private String supplier;
    @Column(name = "price_in_stock")
    private Integer priceInStock;
    @Column(name = "sell_price")
    private Integer sellPrice;
    @Column(name = "group_goods")
    private String groupGoods;
    @Column(name = "weight")
    private Integer weight;
    @JoinColumn(name = "stock_card", referencedColumnName = "id")
    @ManyToOne
    @JsonIgnore
    private StockCard stockCard;
    @OneToMany(mappedBy = "warehouseId")
    private Collection<TranferConent> tranferConentCollection;

    public Warehouse() {
    }

    public Warehouse(Integer id) {
        this.id = id;
    }

    public Warehouse(Integer id, String goodsId) {
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

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public Integer getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(Integer importPrice) {
        this.importPrice = importPrice;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Integer getPriceInStock() {
        return priceInStock;
    }

    public void setPriceInStock(Integer priceInStock) {
        this.priceInStock = priceInStock;
    }

    public Integer getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Integer sellPrice) {
        this.sellPrice = sellPrice;
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

    public StockCard getStockCard() {
        return stockCard;
    }

    public void setStockCard(StockCard stockCard) {
        this.stockCard = stockCard;
    }

    @XmlTransient
    public Collection<TranferConent> getTranferConentCollection() {
        return tranferConentCollection;
    }

    public void setTranferConentCollection(Collection<TranferConent> tranferConentCollection) {
        this.tranferConentCollection = tranferConentCollection;
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
        if (!(object instanceof Warehouse)) {
            return false;
        }
        Warehouse other = (Warehouse) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Warehouse[ id=" + id + " ]";
    }

}
