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
@Table(name = "qr_code")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QrCode.findAll", query = "SELECT q FROM QrCode q"),
    @NamedQuery(name = "QrCode.findById", query = "SELECT q FROM QrCode q WHERE q.id = :id"),
    @NamedQuery(name = "QrCode.findByBarcode", query = "SELECT q FROM QrCode q WHERE q.barcode = :barcode"),
    @NamedQuery(name = "QrCode.findByGoodsId", query = "SELECT q FROM QrCode q WHERE q.goodsId = :goodsId"),
    @NamedQuery(name = "QrCode.findByDate", query = "SELECT q FROM QrCode q WHERE q.date = :date"),
    @NamedQuery(name = "QrCode.findByTexthere", query = "SELECT q FROM QrCode q WHERE q.texthere = :texthere")})
public class QrCode implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "barcode")
    private String barcode;
    @Column(name = "goods_id")
    private String goodsId;
    @Column(name = "date")
    private String date;
    @Column(name = "texthere")
    private String texthere;

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

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
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
        return "com.warehouse.project.model.QrCode[ id=" + id + " ]";
    }
    
}
