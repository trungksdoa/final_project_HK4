/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "Quotes_content")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Quotescontent.findAll", query = "SELECT q FROM Quotescontent q"),
    @NamedQuery(name = "Quotescontent.findById", query = "SELECT q FROM Quotescontent q WHERE q.id = :id"),
    @NamedQuery(name = "Quotescontent.findByGoodsName", query = "SELECT q FROM Quotescontent q WHERE q.goodsName = :goodsName"),
    @NamedQuery(name = "Quotescontent.findByUnit", query = "SELECT q FROM Quotescontent q WHERE q.unit = :unit"),
    @NamedQuery(name = "Quotescontent.findByQuantity", query = "SELECT q FROM Quotescontent q WHERE q.quantity = :quantity"),
    @NamedQuery(name = "Quotescontent.findByGoodsPrice", query = "SELECT q FROM Quotescontent q WHERE q.goodsPrice = :goodsPrice"),
    @NamedQuery(name = "Quotescontent.findByAfterpirce", query = "SELECT q FROM Quotescontent q WHERE q.afterpirce = :afterpirce"),
    @NamedQuery(name = "Quotescontent.findByDiscount", query = "SELECT q FROM Quotescontent q WHERE q.discount = :discount"),
    @NamedQuery(name = "Quotescontent.findByLastedPrice", query = "SELECT q FROM Quotescontent q WHERE q.lastedPrice = :lastedPrice")})
public class Quotescontent implements Serializable {

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

    public Quotescontent() {
    }

    public Quotescontent(Integer id) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quotescontent)) {
            return false;
        }
        Quotescontent other = (Quotescontent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Quotescontent[ id=" + id + " ]";
    }

}
