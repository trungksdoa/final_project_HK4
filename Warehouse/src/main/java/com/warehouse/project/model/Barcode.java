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
@Table(name = "Barcode")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Barcode.findAll", query = "SELECT b FROM Barcode b"),
    @NamedQuery(name = "Barcode.findById", query = "SELECT b FROM Barcode b WHERE b.id = :id"),
    @NamedQuery(name = "Barcode.findByBarcode", query = "SELECT b FROM Barcode b WHERE b.barcode = :barcode"),
    @NamedQuery(name = "Barcode.findByDate", query = "SELECT b FROM Barcode b WHERE b.date = :date")})
public class Barcode implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "barcode")
    private String barcode;
    @Column(name = "date")
    private String date;
    @JoinColumn(name = "goods_id", referencedColumnName = "goods_id")
    @ManyToOne
    private Warehouse goodsId;

    public Barcode() {
    }

    public Barcode(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
        if (!(object instanceof Barcode)) {
            return false;
        }
        Barcode other = (Barcode) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Barcode[ id=" + id + " ]";
    }
    
}
