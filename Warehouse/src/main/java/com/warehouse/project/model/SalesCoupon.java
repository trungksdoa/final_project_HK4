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
@Table(name = "sales_coupon")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalesCoupon.findAll", query = "SELECT s FROM SalesCoupon s"),
    @NamedQuery(name = "SalesCoupon.findById", query = "SELECT s FROM SalesCoupon s WHERE s.id = :id"),
    @NamedQuery(name = "SalesCoupon.findByDate", query = "SELECT s FROM SalesCoupon s WHERE s.date = :date"),
    @NamedQuery(name = "SalesCoupon.findByAddress", query = "SELECT s FROM SalesCoupon s WHERE s.address = :address"),
    @NamedQuery(name = "SalesCoupon.findByPhone", query = "SELECT s FROM SalesCoupon s WHERE s.phone = :phone"),
    @NamedQuery(name = "SalesCoupon.findByExpain", query = "SELECT s FROM SalesCoupon s WHERE s.expain = :expain"),
    @NamedQuery(name = "SalesCoupon.findBySeller", query = "SELECT s FROM SalesCoupon s WHERE s.seller = :seller")})
public class SalesCoupon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "date")
    private String date;
    @Column(name = "address")
    private String address;
    @Column(name = "phone")
    private Integer phone;
    @Column(name = "expain")
    private String expain;
    @Column(name = "seller")
    private String seller;
    @OneToMany(mappedBy = "salesCouponId")
    private Collection<SalesCouponContent> salesCouponContentCollection;
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    @ManyToOne
    private Customer customerId;

    public SalesCoupon() {
    }

    public SalesCoupon(String id) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getExpain() {
        return expain;
    }

    public void setExpain(String expain) {
        this.expain = expain;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    @XmlTransient
    public Collection<SalesCouponContent> getSalesCouponContentCollection() {
        return salesCouponContentCollection;
    }

    public void setSalesCouponContentCollection(Collection<SalesCouponContent> salesCouponContentCollection) {
        this.salesCouponContentCollection = salesCouponContentCollection;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
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
        if (!(object instanceof SalesCoupon)) {
            return false;
        }
        SalesCoupon other = (SalesCoupon) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.SalesCoupon[ id=" + id + " ]";
    }
    
}
