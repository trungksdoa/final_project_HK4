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
@Table(name = "goods_catagory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GoodsCatagory.findAll", query = "SELECT g FROM GoodsCatagory g"),
    @NamedQuery(name = "GoodsCatagory.findById", query = "SELECT g FROM GoodsCatagory g WHERE g.id = :id"),
    @NamedQuery(name = "GoodsCatagory.findByGoodsName", query = "SELECT g FROM GoodsCatagory g WHERE g.goodsName = :goodsName"),
    @NamedQuery(name = "GoodsCatagory.findByUnit", query = "SELECT g FROM GoodsCatagory g WHERE g.unit = :unit"),
    @NamedQuery(name = "GoodsCatagory.findByFixedPurchasePrice", query = "SELECT g FROM GoodsCatagory g WHERE g.fixedPurchasePrice = :fixedPurchasePrice"),
    @NamedQuery(name = "GoodsCatagory.findByLastedPurchasePrice", query = "SELECT g FROM GoodsCatagory g WHERE g.lastedPurchasePrice = :lastedPurchasePrice"),
    @NamedQuery(name = "GoodsCatagory.findByUnitPrice", query = "SELECT g FROM GoodsCatagory g WHERE g.unitPrice = :unitPrice"),
    @NamedQuery(name = "GoodsCatagory.findByWeight", query = "SELECT g FROM GoodsCatagory g WHERE g.weight = :weight")})
public class GoodsCatagory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "unit")
    private String unit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "fixed_purchase_price")
    private Double fixedPurchasePrice;
    @Column(name = "lasted_purchase_price")
    private Double lastedPurchasePrice;
    @Column(name = "unit_price")
    private Double unitPrice;
    @Column(name = "weight")
    private Integer weight;
    @JoinColumn(name = "group_goods", referencedColumnName = "id")
    @ManyToOne
    private Groupsgoods groupGoods;
    @OneToMany(mappedBy = "goodsId")
    private Collection<InputContent> inputContentCollection;

    public GoodsCatagory() {
    }

    public GoodsCatagory(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Double getFixedPurchasePrice() {
        return fixedPurchasePrice;
    }

    public void setFixedPurchasePrice(Double fixedPurchasePrice) {
        this.fixedPurchasePrice = fixedPurchasePrice;
    }

    public Double getLastedPurchasePrice() {
        return lastedPurchasePrice;
    }

    public void setLastedPurchasePrice(Double lastedPurchasePrice) {
        this.lastedPurchasePrice = lastedPurchasePrice;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Groupsgoods getGroupGoods() {
        return groupGoods;
    }

    public void setGroupGoods(Groupsgoods groupGoods) {
        this.groupGoods = groupGoods;
    }

    @XmlTransient
    public Collection<InputContent> getInputContentCollection() {
        return inputContentCollection;
    }

    public void setInputContentCollection(Collection<InputContent> inputContentCollection) {
        this.inputContentCollection = inputContentCollection;
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
        if (!(object instanceof GoodsCatagory)) {
            return false;
        }
        GoodsCatagory other = (GoodsCatagory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.GoodsCatagory[ id=" + id + " ]";
    }
    
}
