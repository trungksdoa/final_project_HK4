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
@Table(name = "Material_goods")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materialgoods.findAll", query = "SELECT m FROM Materialgoods m"),
    @NamedQuery(name = "Materialgoods.findById", query = "SELECT m FROM Materialgoods m WHERE m.id = :id"),
    @NamedQuery(name = "Materialgoods.findByUnit", query = "SELECT m FROM Materialgoods m WHERE m.unit = :unit"),
    @NamedQuery(name = "Materialgoods.findByQuantity", query = "SELECT m FROM Materialgoods m WHERE m.quantity = :quantity"),
    @NamedQuery(name = "Materialgoods.findByWeight", query = "SELECT m FROM Materialgoods m WHERE m.weight = :weight"),
    @NamedQuery(name = "Materialgoods.findByPrice", query = "SELECT m FROM Materialgoods m WHERE m.price = :price")})
public class Materialgoods implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "unit")
    private String unit;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "weight")
    private Integer weight;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Double price;
    @JoinColumn(name = "goods_catagory_id", referencedColumnName = "id")
    @ManyToOne
    @JsonIgnore
    private GoodsCatagory goodsCatagoryId;

    public Materialgoods() {
    }

    public Materialgoods(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public GoodsCatagory getGoodsCatagoryId() {
        return goodsCatagoryId;
    }

    public void setGoodsCatagoryId(GoodsCatagory goodsCatagoryId) {
        this.goodsCatagoryId = goodsCatagoryId;
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
        if (!(object instanceof Materialgoods)) {
            return false;
        }
        Materialgoods other = (Materialgoods) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Materialgoods[ id=" + id + " ]";
    }

}
