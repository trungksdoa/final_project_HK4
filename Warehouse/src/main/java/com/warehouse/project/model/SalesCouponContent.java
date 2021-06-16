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
@Table(name = "sales_coupon_content")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalesCouponContent.findAll", query = "SELECT s FROM SalesCouponContent s"),
    @NamedQuery(name = "SalesCouponContent.findById", query = "SELECT s FROM SalesCouponContent s WHERE s.id = :id"),
    @NamedQuery(name = "SalesCouponContent.findByGoodsName", query = "SELECT s FROM SalesCouponContent s WHERE s.goodsName = :goodsName"),
    @NamedQuery(name = "SalesCouponContent.findByUnit", query = "SELECT s FROM SalesCouponContent s WHERE s.unit = :unit"),
    @NamedQuery(name = "SalesCouponContent.findByQuantity", query = "SELECT s FROM SalesCouponContent s WHERE s.quantity = :quantity"),
    @NamedQuery(name = "SalesCouponContent.findByGoodsPrice", query = "SELECT s FROM SalesCouponContent s WHERE s.goodsPrice = :goodsPrice"),
    @NamedQuery(name = "SalesCouponContent.findByDiscount", query = "SELECT s FROM SalesCouponContent s WHERE s.discount = :discount"),
    @NamedQuery(name = "SalesCouponContent.findByAfterpirce", query = "SELECT s FROM SalesCouponContent s WHERE s.afterpirce = :afterpirce")})
public class SalesCouponContent implements Serializable {

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
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "goods_price")
    private Integer goodsPrice;
    @Column(name = "discount")
    private Integer discount;
    @Column(name = "afterpirce")
    private String afterpirce;
    @JoinColumn(name = "sales_coupon_id", referencedColumnName = "id")
    @ManyToOne
    private SalesCoupon salesCouponId;
    @JoinColumn(name = "goods_id", referencedColumnName = "goods_id")
    @ManyToOne
    private Warehouse goodsId;

    public SalesCouponContent() {
    }

    public SalesCouponContent(Integer id) {
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Integer goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getAfterpirce() {
        return afterpirce;
    }

    public void setAfterpirce(String afterpirce) {
        this.afterpirce = afterpirce;
    }

    public SalesCoupon getSalesCouponId() {
        return salesCouponId;
    }

    public void setSalesCouponId(SalesCoupon salesCouponId) {
        this.salesCouponId = salesCouponId;
    }

    public Warehouse getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Warehouse goodsId) {
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
        if (!(object instanceof SalesCouponContent)) {
            return false;
        }
        SalesCouponContent other = (SalesCouponContent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.SalesCouponContent[ id=" + id + " ]";
    }
    
}
