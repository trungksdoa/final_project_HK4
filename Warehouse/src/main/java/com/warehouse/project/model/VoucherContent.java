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
@Table(name = "voucher_content", catalog = "Databases_", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VoucherContent.findAll", query = "SELECT v FROM VoucherContent v"),
    @NamedQuery(name = "VoucherContent.findById", query = "SELECT v FROM VoucherContent v WHERE v.id = :id"),
    @NamedQuery(name = "VoucherContent.findByGoodsName", query = "SELECT v FROM VoucherContent v WHERE v.goodsName = :goodsName"),
    @NamedQuery(name = "VoucherContent.findByUnit", query = "SELECT v FROM VoucherContent v WHERE v.unit = :unit"),
    @NamedQuery(name = "VoucherContent.findByQuantity", query = "SELECT v FROM VoucherContent v WHERE v.quantity = :quantity"),
    @NamedQuery(name = "VoucherContent.findByGoodsPrice", query = "SELECT v FROM VoucherContent v WHERE v.goodsPrice = :goodsPrice"),
    @NamedQuery(name = "VoucherContent.findByAfteprice", query = "SELECT v FROM VoucherContent v WHERE v.afteprice = :afteprice")})
public class VoucherContent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "goods_name", length = 50)
    private String goodsName;
    @Column(name = "unit", length = 10)
    private String unit;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "goods_price")
    private Integer goodsPrice;
    @Column(name = "afteprice")
    private Integer afteprice;
    @JoinColumn(name = "goods_id", referencedColumnName = "id")
    @ManyToOne
    private GoodsCatagory goodsId;
    @JoinColumn(name = "coupon_id", referencedColumnName = "id")
    @ManyToOne
    private Voucher couponId;

    public VoucherContent() {
    }

    public VoucherContent(Integer id) {
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

    public GoodsCatagory getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(GoodsCatagory goodsId) {
        this.goodsId = goodsId;
    }

    public Voucher getCouponId() {
        return couponId;
    }

    public void setCouponId(Voucher couponId) {
        this.couponId = couponId;
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
        if (!(object instanceof VoucherContent)) {
            return false;
        }
        VoucherContent other = (VoucherContent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.VoucherContent[ id=" + id + " ]";
    }
    
}
