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
@Table(name = "Voucher_report_refere")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Voucherreportrefere.findAll", query = "SELECT v FROM Voucherreportrefere v"),
    @NamedQuery(name = "Voucherreportrefere.findById", query = "SELECT v FROM Voucherreportrefere v WHERE v.id = :id"),
    @NamedQuery(name = "Voucherreportrefere.findByGoodsname", query = "SELECT v FROM Voucherreportrefere v WHERE v.goodsname = :goodsname"),
    @NamedQuery(name = "Voucherreportrefere.findByQuantity", query = "SELECT v FROM Voucherreportrefere v WHERE v.quantity = :quantity"),
    @NamedQuery(name = "Voucherreportrefere.findByUnitprice", query = "SELECT v FROM Voucherreportrefere v WHERE v.unitprice = :unitprice"),
    @NamedQuery(name = "Voucherreportrefere.findByWheretobuy", query = "SELECT v FROM Voucherreportrefere v WHERE v.wheretobuy = :wheretobuy"),
    @NamedQuery(name = "Voucherreportrefere.findByDate", query = "SELECT v FROM Voucherreportrefere v WHERE v.date = :date")})
public class Voucherreportrefere implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Goods_name")
    private String goodsname;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Quantity")
    private Double quantity;
    @Column(name = "unitprice")
    private Double unitprice;
    @Column(name = "Where_to_buy")
    private String wheretobuy;
    @Column(name = "Date")
    private String date;
    @JoinColumn(name = "voucherId", referencedColumnName = "id")
    @ManyToOne
     @JsonIgnore
    private Voucherreport voucherId;

    public Voucherreportrefere() {
    }

    public Voucherreportrefere(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    public String getWheretobuy() {
        return wheretobuy;
    }

    public void setWheretobuy(String wheretobuy) {
        this.wheretobuy = wheretobuy;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Voucherreport getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(Voucherreport voucherId) {
        this.voucherId = voucherId;
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
        if (!(object instanceof Voucherreportrefere)) {
            return false;
        }
        Voucherreportrefere other = (Voucherreportrefere) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Voucherreportrefere[ id=" + id + " ]";
    }
    
}
