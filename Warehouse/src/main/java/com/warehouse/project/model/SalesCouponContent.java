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
@Table(name = "sales_coupon_content")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalesCouponContent.findAll", query = "SELECT s FROM SalesCouponContent s"),
    @NamedQuery(name = "SalesCouponContent.findById", query = "SELECT s FROM SalesCouponContent s WHERE s.id = :id"),
    @NamedQuery(name = "SalesCouponContent.findByGoodsId", query = "SELECT s FROM SalesCouponContent s WHERE s.goodsId = :goodsId"),
    @NamedQuery(name = "SalesCouponContent.findByGoodsName", query = "SELECT s FROM SalesCouponContent s WHERE s.goodsName = :goodsName"),
    @NamedQuery(name = "SalesCouponContent.findByUnit", query = "SELECT s FROM SalesCouponContent s WHERE s.unit = :unit"),
    @NamedQuery(name = "SalesCouponContent.findByQuantity", query = "SELECT s FROM SalesCouponContent s WHERE s.quantity = :quantity"),
    @NamedQuery(name = "SalesCouponContent.findByUnitPrice", query = "SELECT s FROM SalesCouponContent s WHERE s.unitPrice = :unitPrice"),
    @NamedQuery(name = "SalesCouponContent.findByDiscount", query = "SELECT s FROM SalesCouponContent s WHERE s.discount = :discount"),
    @NamedQuery(name = "SalesCouponContent.findByAfterpirce", query = "SELECT s FROM SalesCouponContent s WHERE s.afterpirce = :afterpirce"),
    @NamedQuery(name = "SalesCouponContent.findBySalesCouponId", query = "SELECT s FROM SalesCouponContent s WHERE s.salesCouponId = :salesCouponId"),
    @NamedQuery(name = "SalesCouponContent.findByStatus", query = "SELECT s FROM SalesCouponContent s WHERE s.status = :status"),
    @NamedQuery(name = "SalesCouponContent.findByDiscoutPrice", query = "SELECT s FROM SalesCouponContent s WHERE s.discoutPrice = :discoutPrice")})
public class SalesCouponContent implements Serializable {

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
    @Column(name = "unit_price")
    private Integer unitPrice;
    @Column(name = "discount")
    private Integer discount;
    @Column(name = "afterpirce")
    private Integer afterpirce;
    @Column(name = "sales_coupon_id")
    private String salesCouponId;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "discout_price")
    private Integer discoutPrice;

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

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getAfterpirce() {
        return afterpirce;
    }

    public void setAfterpirce(Integer afterpirce) {
        this.afterpirce = afterpirce;
    }

    public String getSalesCouponId() {
        return salesCouponId;
    }

    public void setSalesCouponId(String salesCouponId) {
        this.salesCouponId = salesCouponId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getDiscoutPrice() {
        return discoutPrice;
    }

    public void setDiscoutPrice(Integer discoutPrice) {
        this.discoutPrice = discoutPrice;
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
