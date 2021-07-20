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
@Table(name = "V_sales_coupon")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vsalescoupon.findAll", query = "SELECT v FROM Vsalescoupon v"),
    @NamedQuery(name = "Vsalescoupon.findById", query = "SELECT v FROM Vsalescoupon v WHERE v.id = :id"),
    @NamedQuery(name = "Vsalescoupon.findByDate", query = "SELECT v FROM Vsalescoupon v WHERE v.date = :date"),
    @NamedQuery(name = "Vsalescoupon.findByCustomerId", query = "SELECT v FROM Vsalescoupon v WHERE v.customerId = :customerId"),
    @NamedQuery(name = "Vsalescoupon.findByAddress", query = "SELECT v FROM Vsalescoupon v WHERE v.address = :address"),
    @NamedQuery(name = "Vsalescoupon.findByPhone", query = "SELECT v FROM Vsalescoupon v WHERE v.phone = :phone"),
    @NamedQuery(name = "Vsalescoupon.findByReceiver", query = "SELECT v FROM Vsalescoupon v WHERE v.receiver = :receiver"),
    @NamedQuery(name = "Vsalescoupon.findByExpain", query = "SELECT v FROM Vsalescoupon v WHERE v.expain = :expain"),
    @NamedQuery(name = "Vsalescoupon.findBySeller", query = "SELECT v FROM Vsalescoupon v WHERE v.seller = :seller"),
    @NamedQuery(name = "Vsalescoupon.findByCircumstance", query = "SELECT v FROM Vsalescoupon v WHERE v.circumstance = :circumstance"),
    @NamedQuery(name = "Vsalescoupon.findByStatus", query = "SELECT v FROM Vsalescoupon v WHERE v.status = :status"),
    @NamedQuery(name = "Vsalescoupon.findByTotalquantity", query = "SELECT v FROM Vsalescoupon v WHERE v.totalquantity = :totalquantity"),
    @NamedQuery(name = "Vsalescoupon.findByTotalDiscount", query = "SELECT v FROM Vsalescoupon v WHERE v.totalDiscount = :totalDiscount"),
    @NamedQuery(name = "Vsalescoupon.findByTatolPrice", query = "SELECT v FROM Vsalescoupon v WHERE v.tatolPrice = :tatolPrice"),
    @NamedQuery(name = "Vsalescoupon.findByLastedPrice", query = "SELECT v FROM Vsalescoupon v WHERE v.lastedPrice = :lastedPrice"),
    @NamedQuery(name = "Vsalescoupon.findByName", query = "SELECT v FROM Vsalescoupon v WHERE v.name = :name")})
public class Vsalescoupon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    @Id
    private String id;
    @Column(name = "date")
    private String date;
    @Column(name = "customer_id")
    private String customerId;
    @Column(name = "address")
    private String address;
    @Column(name = "phone")
    private String phone;
    @Column(name = "receiver")
    private String receiver;
    @Column(name = "expain")
    private String expain;
    @Column(name = "seller")
    private String seller;
    @Column(name = "circumstance")
    private Integer circumstance;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "totalquantity")
    private Integer totalquantity;
    @Column(name = "total_discount")
    private Integer totalDiscount;
    @Column(name = "tatol_price")
    private Integer tatolPrice;
    @Column(name = "lasted_price")
    private Integer lastedPrice;
    @Column(name = "name")
    private String name;

    public Vsalescoupon() {
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

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
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

    public Integer getLastedPrice() {
        return lastedPrice;
    }

    public void setLastedPrice(Integer lastedPrice) {
        this.lastedPrice = lastedPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
