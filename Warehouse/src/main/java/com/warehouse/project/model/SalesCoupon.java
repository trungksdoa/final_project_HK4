/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "sales_coupon")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalesCoupon.findAll", query = "SELECT s FROM SalesCoupon s"),
    @NamedQuery(name = "SalesCoupon.findById", query = "SELECT s FROM SalesCoupon s WHERE s.id = :id"),
    @NamedQuery(name = "SalesCoupon.findByDate", query = "SELECT s FROM SalesCoupon s WHERE s.date = :date"),
    @NamedQuery(name = "SalesCoupon.findByAddress", query = "SELECT s FROM SalesCoupon s WHERE s.address = :address"),
    @NamedQuery(name = "SalesCoupon.findByPhone", query = "SELECT s FROM SalesCoupon s WHERE s.phone = :phone"),
    @NamedQuery(name = "SalesCoupon.findByExpain", query = "SELECT s FROM SalesCoupon s WHERE s.expain = :expain"),
    @NamedQuery(name = "SalesCoupon.findByPaymentterm", query = "SELECT s FROM SalesCoupon s WHERE s.paymentterm = :paymentterm"),
    @NamedQuery(name = "SalesCoupon.findByPaymentterm2", query = "SELECT s FROM SalesCoupon s WHERE s.paymentterm2 = :paymentterm2"),
    @NamedQuery(name = "SalesCoupon.findByTotalprice", query = "SELECT s FROM SalesCoupon s WHERE s.totalprice = :totalprice"),
    @NamedQuery(name = "SalesCoupon.findBySeller", query = "SELECT s FROM SalesCoupon s WHERE s.seller = :seller"),
    @NamedQuery(name = "SalesCoupon.findByStatus", query = "SELECT s FROM SalesCoupon s WHERE s.status = :status")})
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
    @Column(name = "paymentterm")
    private String paymentterm;
    @Column(name = "paymentterm2")
    private String paymentterm2;
    @Column(name = "Total_price")
    private BigInteger totalprice;
    @Column(name = "seller")
    private String seller;
    @Column(name = "status")
    private Boolean status;
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

    public String getPaymentterm() {
        return paymentterm;
    }

    public void setPaymentterm(String paymentterm) {
        this.paymentterm = paymentterm;
    }

    public String getPaymentterm2() {
        return paymentterm2;
    }

    public void setPaymentterm2(String paymentterm2) {
        this.paymentterm2 = paymentterm2;
    }

    public BigInteger getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigInteger totalprice) {
        this.totalprice = totalprice;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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
