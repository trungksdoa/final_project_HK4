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
@Table(name = "debt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Debt.findAll", query = "SELECT d FROM Debt d"),
    @NamedQuery(name = "Debt.findById", query = "SELECT d FROM Debt d WHERE d.id = :id"),
    @NamedQuery(name = "Debt.findByDate", query = "SELECT d FROM Debt d WHERE d.date = :date"),
    @NamedQuery(name = "Debt.findByCustomerid", query = "SELECT d FROM Debt d WHERE d.customerid = :customerid"),
    @NamedQuery(name = "Debt.findBySubmitter", query = "SELECT d FROM Debt d WHERE d.submitter = :submitter"),
    @NamedQuery(name = "Debt.findByAddress", query = "SELECT d FROM Debt d WHERE d.address = :address"),
    @NamedQuery(name = "Debt.findByExplain", query = "SELECT d FROM Debt d WHERE d.explain = :explain"),
    @NamedQuery(name = "Debt.findByPrice", query = "SELECT d FROM Debt d WHERE d.price = :price"),
    @NamedQuery(name = "Debt.findByMajor", query = "SELECT d FROM Debt d WHERE d.major = :major"),
    @NamedQuery(name = "Debt.findByVoter", query = "SELECT d FROM Debt d WHERE d.voter = :voter")})
public class Debt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date")
    private String date;
    @Column(name = "customerid")
    private String customerid;
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

    public Debt() {
    }

    public Debt(Integer id) {
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

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
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
        if (!(object instanceof Debt)) {
            return false;
        }
        Debt other = (Debt) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Debt[ id=" + id + " ]";
    }
    
}
