/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "other")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Other.findAll", query = "SELECT o FROM Other o"),
    @NamedQuery(name = "Other.findById", query = "SELECT o FROM Other o WHERE o.id = :id"),
    @NamedQuery(name = "Other.findByDate", query = "SELECT o FROM Other o WHERE o.date = :date"),
    @NamedQuery(name = "Other.findBySalecoupon", query = "SELECT o FROM Other o WHERE o.salecoupon = :salecoupon"),
    @NamedQuery(name = "Other.findBySubmitter", query = "SELECT o FROM Other o WHERE o.submitter = :submitter"),
    @NamedQuery(name = "Other.findByAddress", query = "SELECT o FROM Other o WHERE o.address = :address"),
    @NamedQuery(name = "Other.findByExplain", query = "SELECT o FROM Other o WHERE o.explain = :explain"),
    @NamedQuery(name = "Other.findByPrice", query = "SELECT o FROM Other o WHERE o.price = :price"),
    @NamedQuery(name = "Other.findByVoter", query = "SELECT o FROM Other o WHERE o.voter = :voter")})
public class Other implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date")
    private String date;
    @Column(name = "Sale_coupon")
    private String salecoupon;
    @Column(name = "submitter")
    private String submitter;
    @Column(name = "address")
    private String address;
    @Column(name = "explain")
    private String explain;
    @Column(name = "price")
    private BigInteger price;
    @Column(name = "voter")
    private String voter;
    @JoinColumn(name = "client", referencedColumnName = "id")
    @ManyToOne
     @JsonIgnore
    private Customer client;

    public Other() {
    }

    public Other(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSalecoupon() {
        return salecoupon;
    }

    public void setSalecoupon(String salecoupon) {
        this.salecoupon = salecoupon;
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
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

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public String getVoter() {
        return voter;
    }

    public void setVoter(String voter) {
        this.voter = voter;
    }

    public Customer getClient() {
        return client;
    }

    public void setClient(Customer client) {
        this.client = client;
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
        if (!(object instanceof Other)) {
            return false;
        }
        Other other = (Other) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Other[ id=" + id + " ]";
    }
    
}
