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
@Table(name = "suplierpay")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Suplierpay.findAll", query = "SELECT s FROM Suplierpay s"),
    @NamedQuery(name = "Suplierpay.findById", query = "SELECT s FROM Suplierpay s WHERE s.id = :id"),
    @NamedQuery(name = "Suplierpay.findByDate", query = "SELECT s FROM Suplierpay s WHERE s.date = :date"),
    @NamedQuery(name = "Suplierpay.findBySuplierid", query = "SELECT s FROM Suplierpay s WHERE s.suplierid = :suplierid"),
    @NamedQuery(name = "Suplierpay.findBySubmitter", query = "SELECT s FROM Suplierpay s WHERE s.submitter = :submitter"),
    @NamedQuery(name = "Suplierpay.findByAddress", query = "SELECT s FROM Suplierpay s WHERE s.address = :address"),
    @NamedQuery(name = "Suplierpay.findByExplain", query = "SELECT s FROM Suplierpay s WHERE s.explain = :explain"),
    @NamedQuery(name = "Suplierpay.findByPrice", query = "SELECT s FROM Suplierpay s WHERE s.price = :price"),
    @NamedQuery(name = "Suplierpay.findByMajor", query = "SELECT s FROM Suplierpay s WHERE s.major = :major"),
    @NamedQuery(name = "Suplierpay.findByVoter", query = "SELECT s FROM Suplierpay s WHERE s.voter = :voter")})
public class Suplierpay implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date")
    private String date;
    @Column(name = "suplierid")
    private String suplierid;
    @Column(name = "submitter")
    private String submitter;
    @Column(name = "address")
    private String address;
    @Column(name = "explain")
    private String explain;
    @Column(name = "price")
    private Integer price;
    @Column(name = "major")
    private String major;
    @Column(name = "voter")
    private String voter;

    public Suplierpay() {
    }

    public Suplierpay(Integer id) {
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

    public String getSuplierid() {
        return suplierid;
    }

    public void setSuplierid(String suplierid) {
        this.suplierid = suplierid;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getVoter() {
        return voter;
    }

    public void setVoter(String voter) {
        this.voter = voter;
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
        if (!(object instanceof Suplierpay)) {
            return false;
        }
        Suplierpay other = (Suplierpay) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Suplierpay[ id=" + id + " ]";
    }
    
}
