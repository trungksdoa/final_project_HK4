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
@Table(name = "V_Quotes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VQuotes.findAll", query = "SELECT v FROM VQuotes v"),
    @NamedQuery(name = "VQuotes.findById", query = "SELECT v FROM VQuotes v WHERE v.id = :id"),
    @NamedQuery(name = "VQuotes.findByDate", query = "SELECT v FROM VQuotes v WHERE v.date = :date"),
    @NamedQuery(name = "VQuotes.findByCustomerId", query = "SELECT v FROM VQuotes v WHERE v.customerId = :customerId"),
    @NamedQuery(name = "VQuotes.findByAddress", query = "SELECT v FROM VQuotes v WHERE v.address = :address"),
    @NamedQuery(name = "VQuotes.findByPhone", query = "SELECT v FROM VQuotes v WHERE v.phone = :phone"),
    @NamedQuery(name = "VQuotes.findByReceiver", query = "SELECT v FROM VQuotes v WHERE v.receiver = :receiver"),
    @NamedQuery(name = "VQuotes.findByExplain", query = "SELECT v FROM VQuotes v WHERE v.explain = :explain"),
    @NamedQuery(name = "VQuotes.findByCreator", query = "SELECT v FROM VQuotes v WHERE v.creator = :creator"),
    @NamedQuery(name = "VQuotes.findByTotalquantity", query = "SELECT v FROM VQuotes v WHERE v.totalquantity = :totalquantity"),
    @NamedQuery(name = "VQuotes.findByTotalDiscount", query = "SELECT v FROM VQuotes v WHERE v.totalDiscount = :totalDiscount"),
    @NamedQuery(name = "VQuotes.findByTatolPrice", query = "SELECT v FROM VQuotes v WHERE v.tatolPrice = :tatolPrice"),
    @NamedQuery(name = "VQuotes.findByLastedPrice", query = "SELECT v FROM VQuotes v WHERE v.lastedPrice = :lastedPrice"),
    @NamedQuery(name = "VQuotes.findByName", query = "SELECT v FROM VQuotes v WHERE v.name = :name")})
public class VQuotes implements Serializable {

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
    @Column(name = "explain")
    private String explain;
    @Column(name = "creator")
    private String creator;
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

    public VQuotes() {
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

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
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
