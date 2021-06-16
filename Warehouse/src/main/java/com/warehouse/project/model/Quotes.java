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
@Table(name = "Quotes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Quotes.findAll", query = "SELECT q FROM Quotes q"),
    @NamedQuery(name = "Quotes.findById", query = "SELECT q FROM Quotes q WHERE q.id = :id"),
    @NamedQuery(name = "Quotes.findByDate", query = "SELECT q FROM Quotes q WHERE q.date = :date"),
    @NamedQuery(name = "Quotes.findByAddress", query = "SELECT q FROM Quotes q WHERE q.address = :address"),
    @NamedQuery(name = "Quotes.findByPhone", query = "SELECT q FROM Quotes q WHERE q.phone = :phone"),
    @NamedQuery(name = "Quotes.findByReceiver", query = "SELECT q FROM Quotes q WHERE q.receiver = :receiver"),
    @NamedQuery(name = "Quotes.findByExplain", query = "SELECT q FROM Quotes q WHERE q.explain = :explain"),
    @NamedQuery(name = "Quotes.findByCreator", query = "SELECT q FROM Quotes q WHERE q.creator = :creator")})
public class Quotes implements Serializable {

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
    private String phone;
    @Column(name = "receiver")
    private String receiver;
    @Column(name = "explain")
    private String explain;
    @Column(name = "creator")
    private String creator;
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    @ManyToOne
    private Customer customerId;
    @OneToMany(mappedBy = "quotesid")
    private Collection<Quotescontent> quotescontentCollection;

    public Quotes() {
    }

    public Quotes(String id) {
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

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    @XmlTransient
    public Collection<Quotescontent> getQuotescontentCollection() {
        return quotescontentCollection;
    }

    public void setQuotescontentCollection(Collection<Quotescontent> quotescontentCollection) {
        this.quotescontentCollection = quotescontentCollection;
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
        if (!(object instanceof Quotes)) {
            return false;
        }
        Quotes other = (Quotes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Quotes[ id=" + id + " ]";
    }
    
}
