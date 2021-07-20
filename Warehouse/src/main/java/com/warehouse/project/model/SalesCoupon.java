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
    @NamedQuery(name = "SalesCoupon.findByCustomerId", query = "SELECT s FROM SalesCoupon s WHERE s.customerId = :customerId"),
    @NamedQuery(name = "SalesCoupon.findByAddress", query = "SELECT s FROM SalesCoupon s WHERE s.address = :address"),
    @NamedQuery(name = "SalesCoupon.findByPhone", query = "SELECT s FROM SalesCoupon s WHERE s.phone = :phone"),
    @NamedQuery(name = "SalesCoupon.findByExpain", query = "SELECT s FROM SalesCoupon s WHERE s.expain = :expain"),
    @NamedQuery(name = "SalesCoupon.findBySeller", query = "SELECT s FROM SalesCoupon s WHERE s.seller = :seller"),
    @NamedQuery(name = "SalesCoupon.findByCircumstance", query = "SELECT s FROM SalesCoupon s WHERE s.circumstance = :circumstance"),
    @NamedQuery(name = "SalesCoupon.findByStatus", query = "SELECT s FROM SalesCoupon s WHERE s.status = :status"),
    @NamedQuery(name = "SalesCoupon.findByReceiver", query = "SELECT s FROM SalesCoupon s WHERE s.receiver = :receiver"),
    @NamedQuery(name = "SalesCoupon.findByTotalquantity", query = "SELECT s FROM SalesCoupon s WHERE s.totalquantity = :totalquantity"),
    @NamedQuery(name = "SalesCoupon.findByTotalDiscount", query = "SELECT s FROM SalesCoupon s WHERE s.totalDiscount = :totalDiscount"),
    @NamedQuery(name = "SalesCoupon.findByTatolPrice", query = "SELECT s FROM SalesCoupon s WHERE s.tatolPrice = :tatolPrice"),
    @NamedQuery(name = "SalesCoupon.findByQuotesId", query = "SELECT s FROM SalesCoupon s WHERE s.quotesId = :quotesId"),
    @NamedQuery(name = "SalesCoupon.findByPayments", query = "SELECT s FROM SalesCoupon s WHERE s.payments = :payments"),
    @NamedQuery(name = "SalesCoupon.findByLastedPrice", query = "SELECT s FROM SalesCoupon s WHERE s.lastedPrice = :lastedPrice"),
    @NamedQuery(name = "SalesCoupon.findByPaid", query = "SELECT s FROM SalesCoupon s WHERE s.paid = :paid"),
    @NamedQuery(name = "SalesCoupon.findByOwed", query = "SELECT s FROM SalesCoupon s WHERE s.owed = :owed")})
public class SalesCoupon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "date")
    private String date;
    @Column(name = "customer_id")
    private String customerId;
    @Column(name = "address")
    private String address;
    @Column(name = "phone")
    private String phone;
    @Column(name = "expain")
    private String expain;
    @Column(name = "seller")
    private String seller;
    @Column(name = "circumstance")
    private Integer circumstance;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "receiver")
    private String receiver;
    @Column(name = "totalquantity")
    private Integer totalquantity;
    @Column(name = "total_discount")
    private Integer totalDiscount;
    @Column(name = "tatol_price")
    private Integer tatolPrice;
    @Column(name = "quotes_id")
    private String quotesId;
    @Column(name = "payments")
    private String payments;
    @Column(name = "lasted_price")
    private Integer lastedPrice;
    @Column(name = "paid")
    private Integer paid;
    @Column(name = "owed")
    private Integer owed;

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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
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

    public Integer getCircumstance() {
        return circumstance;
    }

    public void setCircumstance(Integer circumstance) {
        this.circumstance = circumstance;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Integer getTotalquantity() {
        return totalquantity;
    }

    public void setTotalquantity(Integer totalquantity) {
        this.totalquantity = totalquantity;
    }

    public Integer getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(Integer totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public Integer getTatolPrice() {
        return tatolPrice;
    }

    public void setTatolPrice(Integer tatolPrice) {
        this.tatolPrice = tatolPrice;
    }

    public String getQuotesId() {
        return quotesId;
    }

    public void setQuotesId(String quotesId) {
        this.quotesId = quotesId;
    }

    public String getPayments() {
        return payments;
    }

    public void setPayments(String payments) {
        this.payments = payments;
    }

    public Integer getLastedPrice() {
        return lastedPrice;
    }

    public void setLastedPrice(Integer lastedPrice) {
        this.lastedPrice = lastedPrice;
    }

    public Integer getPaid() {
        return paid;
    }

    public void setPaid(Integer paid) {
        this.paid = paid;
    }

    public Integer getOwed() {
        return owed;
    }

    public void setOwed(Integer owed) {
        this.owed = owed;
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
