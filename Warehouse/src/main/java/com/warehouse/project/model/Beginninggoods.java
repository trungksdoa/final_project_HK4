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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author trung
 */
@Entity
@Table(name = "Beginninggoods")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Beginninggoods.findAll", query = "SELECT b FROM Beginninggoods b"),
    @NamedQuery(name = "Beginninggoods.findById", query = "SELECT b FROM Beginninggoods b WHERE b.id = :id"),
    @NamedQuery(name = "Beginninggoods.findByGoodsId", query = "SELECT b FROM Beginninggoods b WHERE b.goodsId = :goodsId"),
    @NamedQuery(name = "Beginninggoods.findByGoodsName", query = "SELECT b FROM Beginninggoods b WHERE b.goodsName = :goodsName"),
    @NamedQuery(name = "Beginninggoods.findByUnit", query = "SELECT b FROM Beginninggoods b WHERE b.unit = :unit"),
    @NamedQuery(name = "Beginninggoods.findByQuantityInStock", query = "SELECT b FROM Beginninggoods b WHERE b.quantityInStock = :quantityInStock"),
    @NamedQuery(name = "Beginninggoods.findByImportPrice", query = "SELECT b FROM Beginninggoods b WHERE b.importPrice = :importPrice"),
    @NamedQuery(name = "Beginninggoods.findBySupplier", query = "SELECT b FROM Beginninggoods b WHERE b.supplier = :supplier"),
    @NamedQuery(name = "Beginninggoods.findByPriceInStock", query = "SELECT b FROM Beginninggoods b WHERE b.priceInStock = :priceInStock"),
    @NamedQuery(name = "Beginninggoods.findByGroupGoods", query = "SELECT b FROM Beginninggoods b WHERE b.groupGoods = :groupGoods"),
    @NamedQuery(name = "Beginninggoods.findByWeight", query = "SELECT b FROM Beginninggoods b WHERE b.weight = :weight"),
    @NamedQuery(name = "Beginninggoods.findByStockCard", query = "SELECT b FROM Beginninggoods b WHERE b.stockCard = :stockCard")})
public class Beginninggoods implements Serializable {

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
    @Column(name = "quantity_in_stock")
    private Integer quantityInStock;
    @Column(name = "import_price")
    private Integer importPrice;
    @Column(name = "supplier")
    private String supplier;
    @Column(name = "price_in_stock")
    private Integer priceInStock;
    @Column(name = "group_goods")
    private String groupGoods;
    @Column(name = "weight")
    private Integer weight;
    @Column(name = "stock_card")
    private String stockCard;

    public Beginninggoods() {
    }

    public Beginninggoods(Integer id) {
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

    public String getStockCard() {
        return stockCard;
    }

    public void setStockCard(String stockCard) {
        this.stockCard = stockCard;
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
        if (!(object instanceof Beginninggoods)) {
            return false;
        }
        Beginninggoods other = (Beginninggoods) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Beginninggoods[ id=" + id + " ]";
    }
    
}
