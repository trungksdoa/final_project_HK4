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
@Table(name = "Production_order_material")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productionordermaterial.findAll", query = "SELECT p FROM Productionordermaterial p"),
    @NamedQuery(name = "Productionordermaterial.findById", query = "SELECT p FROM Productionordermaterial p WHERE p.id = :id"),
    @NamedQuery(name = "Productionordermaterial.findByGoodsName", query = "SELECT p FROM Productionordermaterial p WHERE p.goodsName = :goodsName"),
    @NamedQuery(name = "Productionordermaterial.findByUnit", query = "SELECT p FROM Productionordermaterial p WHERE p.unit = :unit"),
    @NamedQuery(name = "Productionordermaterial.findByQuantityon1", query = "SELECT p FROM Productionordermaterial p WHERE p.quantityon1 = :quantityon1"),
    @NamedQuery(name = "Productionordermaterial.findByQuantity", query = "SELECT p FROM Productionordermaterial p WHERE p.quantity = :quantity"),
    @NamedQuery(name = "Productionordermaterial.findByPrice", query = "SELECT p FROM Productionordermaterial p WHERE p.price = :price")})
public class Productionordermaterial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "unit")
    private String unit;
    @Column(name = "quantityon1")
    private Integer quantityon1;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "price")
    private Integer price;
    @JoinColumn(name = "Production_order_content_id", referencedColumnName = "id")
    @ManyToOne
    private Productionordercontent productionordercontentid;

    public Productionordermaterial() {
    }

    public Productionordermaterial(String id) {
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

    public Integer getQuantityon1() {
        return quantityon1;
    }

    public void setQuantityon1(Integer quantityon1) {
        this.quantityon1 = quantityon1;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Productionordercontent getProductionordercontentid() {
        return productionordercontentid;
    }

    public void setProductionordercontentid(Productionordercontent productionordercontentid) {
        this.productionordercontentid = productionordercontentid;
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
        if (!(object instanceof Productionordermaterial)) {
            return false;
        }
        Productionordermaterial other = (Productionordermaterial) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Productionordermaterial[ id=" + id + " ]";
    }
    
}
