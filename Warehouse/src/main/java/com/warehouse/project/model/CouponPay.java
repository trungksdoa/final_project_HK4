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
@Table(name = "coupon_pay")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CouponPay.findAll", query = "SELECT c FROM CouponPay c"),
    @NamedQuery(name = "CouponPay.findById", query = "SELECT c FROM CouponPay c WHERE c.id = :id"),
    @NamedQuery(name = "CouponPay.findByDate", query = "SELECT c FROM CouponPay c WHERE c.date = :date"),
    @NamedQuery(name = "CouponPay.findByObject", query = "SELECT c FROM CouponPay c WHERE c.object = :object"),
    @NamedQuery(name = "CouponPay.findByPrice", query = "SELECT c FROM CouponPay c WHERE c.price = :price"),
    @NamedQuery(name = "CouponPay.findByMajor", query = "SELECT c FROM CouponPay c WHERE c.major = :major"),
    @NamedQuery(name = "CouponPay.findByAddress", query = "SELECT c FROM CouponPay c WHERE c.address = :address"),
    @NamedQuery(name = "CouponPay.findByExplain", query = "SELECT c FROM CouponPay c WHERE c.explain = :explain"),
    @NamedQuery(name = "CouponPay.findByPayer", query = "SELECT c FROM CouponPay c WHERE c.payer = :payer")})
public class CouponPay implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "date")
    private String date;
    @Column(name = "object")
    private String object;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Double price;
    @Column(name = "major")
    private String major;
    @Column(name = "address")
    private String address;
    @Column(name = "explain")
    private String explain;
    @Column(name = "payer")
    private String payer;
    @OneToMany(mappedBy = "couponPayId")
    private Collection<CouponPayReference> couponPayReferenceCollection;

    public CouponPay() {
    }

    public CouponPay(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    @XmlTransient
    public Collection<CouponPayReference> getCouponPayReferenceCollection() {
        return couponPayReferenceCollection;
    }

    public void setCouponPayReferenceCollection(Collection<CouponPayReference> couponPayReferenceCollection) {
        this.couponPayReferenceCollection = couponPayReferenceCollection;
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
        if (!(object instanceof CouponPay)) {
            return false;
        }
        CouponPay other = (CouponPay) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.CouponPay[ id=" + id + " ]";
    }
    
}
