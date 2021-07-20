/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "V_Quotes_Content")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VQuotesContent.findAll", query = "SELECT v FROM VQuotesContent v"),
    @NamedQuery(name = "VQuotesContent.findByGoodsName", query = "SELECT v FROM VQuotesContent v WHERE v.goodsName = :goodsName"),
    @NamedQuery(name = "VQuotesContent.findByUnit", query = "SELECT v FROM VQuotesContent v WHERE v.unit = :unit"),
    @NamedQuery(name = "VQuotesContent.findByQuantity", query = "SELECT v FROM VQuotesContent v WHERE v.quantity = :quantity"),
    @NamedQuery(name = "VQuotesContent.findByGoodsPrice", query = "SELECT v FROM VQuotesContent v WHERE v.goodsPrice = :goodsPrice"),
    @NamedQuery(name = "VQuotesContent.findByAfterpirce", query = "SELECT v FROM VQuotesContent v WHERE v.afterpirce = :afterpirce"),
    @NamedQuery(name = "VQuotesContent.findByDiscount", query = "SELECT v FROM VQuotesContent v WHERE v.discount = :discount"),
    @NamedQuery(name = "VQuotesContent.findByLastedPrice", query = "SELECT v FROM VQuotesContent v WHERE v.lastedPrice = :lastedPrice")})
public class VQuotesContent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "goods_name")
    @Id
    private String goodsName;
    @Column(name = "unit")
    private String unit;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "goods_price")
    private Integer goodsPrice;
    @Column(name = "afterpirce")
    private Integer afterpirce;
    @Column(name = "discount")
    private Integer discount;
    @Column(name = "lasted_price")
    private Integer lastedPrice;
    @JoinColumn(name = "goods_id", referencedColumnName = "id")
    @ManyToOne
    @JsonIgnore
    private GoodsCatagory goodsId;
    @JoinColumn(name = "Quotes_id", referencedColumnName = "id")
    @ManyToOne
    @JsonIgnore
    private Quotes quotesid;

    public VQuotesContent() {
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

    public Integer getAfterpirce() {
        return afterpirce;
    }

    public void setAfterpirce(Integer afterpirce) {
        this.afterpirce = afterpirce;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getLastedPrice() {
        return lastedPrice;
    }

    public void setLastedPrice(Integer lastedPrice) {
        this.lastedPrice = lastedPrice;
    }

    public GoodsCatagory getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(GoodsCatagory goodsId) {
        this.goodsId = goodsId;
    }

    public Quotes getQuotesid() {
        return quotesid;
    }

    public void setQuotesid(Quotes quotesid) {
        this.quotesid = quotesid;
    }

}
