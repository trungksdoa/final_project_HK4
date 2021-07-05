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
@Table(name = "His_io")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hisio.findAll", query = "SELECT h FROM Hisio h"),
    @NamedQuery(name = "Hisio.findById", query = "SELECT h FROM Hisio h WHERE h.id = :id"),
    @NamedQuery(name = "Hisio.findByDate", query = "SELECT h FROM Hisio h WHERE h.date = :date"),
    @NamedQuery(name = "Hisio.findByGoodsId", query = "SELECT h FROM Hisio h WHERE h.goodsId = :goodsId"),
    @NamedQuery(name = "Hisio.findByGoodsName", query = "SELECT h FROM Hisio h WHERE h.goodsName = :goodsName"),
    @NamedQuery(name = "Hisio.findByQuantity", query = "SELECT h FROM Hisio h WHERE h.quantity = :quantity"),
    @NamedQuery(name = "Hisio.findByUnit", query = "SELECT h FROM Hisio h WHERE h.unit = :unit"),
    @NamedQuery(name = "Hisio.findByPrice", query = "SELECT h FROM Hisio h WHERE h.price = :price"),
    @NamedQuery(name = "Hisio.findByWarehouse", query = "SELECT h FROM Hisio h WHERE h.warehouse = :warehouse"),
    @NamedQuery(name = "Hisio.findByLicense", query = "SELECT h FROM Hisio h WHERE h.license = :license"),
    @NamedQuery(name = "Hisio.findByMajor", query = "SELECT h FROM Hisio h WHERE h.major = :major")})
public class Hisio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date")
    private String date;
    @Column(name = "goods_id")
    private String goodsId;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "unit")
    private String unit;
    @Column(name = "price")
    private Integer price;
    @Column(name = "warehouse")
    private String warehouse;
    @Column(name = "License")
    private String license;
    @Column(name = "Major")
    private String major;

    public Hisio() {
    }

    public Hisio(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
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
        if (!(object instanceof Hisio)) {
            return false;
        }
        Hisio other = (Hisio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Hisio[ id=" + id + " ]";
    }
    
}
