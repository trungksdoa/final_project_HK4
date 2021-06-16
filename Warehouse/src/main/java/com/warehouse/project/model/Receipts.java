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
@Table(name = "receipts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Receipts.findAll", query = "SELECT r FROM Receipts r"),
    @NamedQuery(name = "Receipts.findById", query = "SELECT r FROM Receipts r WHERE r.id = :id"),
    @NamedQuery(name = "Receipts.findByDate", query = "SELECT r FROM Receipts r WHERE r.date = :date"),
    @NamedQuery(name = "Receipts.findByObject", query = "SELECT r FROM Receipts r WHERE r.object = :object"),
    @NamedQuery(name = "Receipts.findByPrice", query = "SELECT r FROM Receipts r WHERE r.price = :price"),
    @NamedQuery(name = "Receipts.findByMajor", query = "SELECT r FROM Receipts r WHERE r.major = :major"),
    @NamedQuery(name = "Receipts.findByAddress", query = "SELECT r FROM Receipts r WHERE r.address = :address"),
    @NamedQuery(name = "Receipts.findByExplain", query = "SELECT r FROM Receipts r WHERE r.explain = :explain"),
    @NamedQuery(name = "Receipts.findByCollector", query = "SELECT r FROM Receipts r WHERE r.collector = :collector")})
public class Receipts implements Serializable {

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
    @Column(name = "collector")
    private String collector;
    @OneToMany(mappedBy = "receiptsId")
    private Collection<ReceiptsReference> receiptsReferenceCollection;

    public Receipts() {
    }

    public Receipts(String id) {
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

    public String getCollector() {
        return collector;
    }

    public void setCollector(String collector) {
        this.collector = collector;
    }

    @XmlTransient
    public Collection<ReceiptsReference> getReceiptsReferenceCollection() {
        return receiptsReferenceCollection;
    }

    public void setReceiptsReferenceCollection(Collection<ReceiptsReference> receiptsReferenceCollection) {
        this.receiptsReferenceCollection = receiptsReferenceCollection;
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
        if (!(object instanceof Receipts)) {
            return false;
        }
        Receipts other = (Receipts) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Receipts[ id=" + id + " ]";
    }
    
}
