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
@Table(name = "Quotes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Quotes.findAll", query = "SELECT q FROM Quotes q"),
    @NamedQuery(name = "Quotes.findById", query = "SELECT q FROM Quotes q WHERE q.id = :id"),
    @NamedQuery(name = "Quotes.findByDate", query = "SELECT q FROM Quotes q WHERE q.date = :date"),
    @NamedQuery(name = "Quotes.findByCustomerId", query = "SELECT q FROM Quotes q WHERE q.customerId = :customerId"),
    @NamedQuery(name = "Quotes.findByAddress", query = "SELECT q FROM Quotes q WHERE q.address = :address"),
    @NamedQuery(name = "Quotes.findByPhone", query = "SELECT q FROM Quotes q WHERE q.phone = :phone"),
    @NamedQuery(name = "Quotes.findByReceiver", query = "SELECT q FROM Quotes q WHERE q.receiver = :receiver"),
    @NamedQuery(name = "Quotes.findByExplain", query = "SELECT q FROM Quotes q WHERE q.explain = :explain"),
    @NamedQuery(name = "Quotes.findByCreator", query = "SELECT q FROM Quotes q WHERE q.creator = :creator"),
    @NamedQuery(name = "Quotes.findByTotalquantity", query = "SELECT q FROM Quotes q WHERE q.totalquantity = :totalquantity"),
    @NamedQuery(name = "Quotes.findByTotalDiscount", query = "SELECT q FROM Quotes q WHERE q.totalDiscount = :totalDiscount"),
    @NamedQuery(name = "Quotes.findByTatolPrice", query = "SELECT q FROM Quotes q WHERE q.tatolPrice = :tatolPrice"),
    @NamedQuery(name = "Quotes.findByLastedPrice", query = "SELECT q FROM Quotes q WHERE q.lastedPrice = :lastedPrice")})
public class Quotes implements Serializable {

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
    @OneToMany(mappedBy = "quotesid")
    private Collection<VQuotesContent> vQuotesContentCollection;
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

    @XmlTransient
    public Collection<VQuotesContent> getVQuotesContentCollection() {
        return vQuotesContentCollection;
    }

    public void setVQuotesContentCollection(Collection<VQuotesContent> vQuotesContentCollection) {
        this.vQuotesContentCollection = vQuotesContentCollection;
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
