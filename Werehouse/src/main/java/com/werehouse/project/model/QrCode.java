/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werehouse.project.model;

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
 * @author PC
 */
@Entity
@Table(name = "qr_code", catalog = "Databases_", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QrCode.findAll", query = "SELECT q FROM QrCode q"),
    @NamedQuery(name = "QrCode.findById", query = "SELECT q FROM QrCode q WHERE q.id = :id"),
    @NamedQuery(name = "QrCode.findByBarcode", query = "SELECT q FROM QrCode q WHERE q.barcode = :barcode"),
    @NamedQuery(name = "QrCode.findByDate", query = "SELECT q FROM QrCode q WHERE q.date = :date"),
    @NamedQuery(name = "QrCode.findByTexthere", query = "SELECT q FROM QrCode q WHERE q.texthere = :texthere")})
public class QrCode implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "barcode", length = 100)
    private String barcode;
    @Column(name = "date", length = 50)
    private String date;
    @Column(name = "texthere", length = 100)
    private String texthere;
    @JoinColumn(name = "goods_id", referencedColumnName = "goods_id")
    @ManyToOne
    private Warehouse goodsId;

    public QrCode() {
    }

    public QrCode(Integer id) {
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

    public String getTexthere() {
        return texthere;
    }

    public void setTexthere(String texthere) {
        this.texthere = texthere;
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
        if (!(object instanceof QrCode)) {
            return false;
        }
        QrCode other = (QrCode) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.werehouse.project.model.QrCode[ id=" + id + " ]";
    }
    
}
