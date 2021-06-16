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
@Table(name = "coupon_content")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CouponContent.findAll", query = "SELECT c FROM CouponContent c"),
    @NamedQuery(name = "CouponContent.findById", query = "SELECT c FROM CouponContent c WHERE c.id = :id"),
    @NamedQuery(name = "CouponContent.findByGoodsName", query = "SELECT c FROM CouponContent c WHERE c.goodsName = :goodsName"),
    @NamedQuery(name = "CouponContent.findByUnit", query = "SELECT c FROM CouponContent c WHERE c.unit = :unit"),
    @NamedQuery(name = "CouponContent.findByQuantity", query = "SELECT c FROM CouponContent c WHERE c.quantity = :quantity"),
    @NamedQuery(name = "CouponContent.findByGoodsPrice", query = "SELECT c FROM CouponContent c WHERE c.goodsPrice = :goodsPrice"),
    @NamedQuery(name = "CouponContent.findByAfteprice", query = "SELECT c FROM CouponContent c WHERE c.afteprice = :afteprice")})
public class CouponContent implements Serializable {

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
    @Column(name = "afteprice")
    private Integer afteprice;
    @JoinColumn(name = "coupon_id", referencedColumnName = "id")
    @ManyToOne
    private Coupon couponId;
    @JoinColumn(name = "goods_id", referencedColumnName = "goods_id")
    @ManyToOne
    private Warehouse goodsId;

    public CouponContent() {
    }

    public CouponContent(Integer id) {
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

    public Integer getAfteprice() {
        return afteprice;
    }

    public void setAfteprice(Integer afteprice) {
        this.afteprice = afteprice;
    }

    public Coupon getCouponId() {
        return couponId;
    }

    public void setCouponId(Coupon couponId) {
        this.couponId = couponId;
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
        if (!(object instanceof CouponContent)) {
            return false;
        }
        CouponContent other = (CouponContent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.CouponContent[ id=" + id + " ]";
    }
    
}
