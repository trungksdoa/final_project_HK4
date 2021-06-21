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
@Table(name = "Customer", catalog = "Databases_", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"),
    @NamedQuery(name = "Customer.findById", query = "SELECT c FROM Customer c WHERE c.id = :id"),
    @NamedQuery(name = "Customer.findByName", query = "SELECT c FROM Customer c WHERE c.name = :name"),
    @NamedQuery(name = "Customer.findByPhone", query = "SELECT c FROM Customer c WHERE c.phone = :phone"),
    @NamedQuery(name = "Customer.findByAddress", query = "SELECT c FROM Customer c WHERE c.address = :address"),
    @NamedQuery(name = "Customer.findByEmail", query = "SELECT c FROM Customer c WHERE c.email = :email"),
    @NamedQuery(name = "Customer.findByTaxNumber", query = "SELECT c FROM Customer c WHERE c.taxNumber = :taxNumber"),
    @NamedQuery(name = "Customer.findByExplain", query = "SELECT c FROM Customer c WHERE c.explain = :explain"),
    @NamedQuery(name = "Customer.findByBirthdate", query = "SELECT c FROM Customer c WHERE c.birthdate = :birthdate"),
    @NamedQuery(name = "Customer.findBySex", query = "SELECT c FROM Customer c WHERE c.sex = :sex"),
    @NamedQuery(name = "Customer.findByCustomerPoint", query = "SELECT c FROM Customer c WHERE c.customerPoint = :customerPoint")})
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false, length = 50)
    private String id;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "phone")
    private Integer phone;
    @Column(name = "address", length = 50)
    private String address;
    @Column(name = "email", length = 50)
    private String email;
    @Column(name = "tax_number")
    private Integer taxNumber;
    @Column(name = "explain", length = 50)
    private String explain;
    @Column(name = "birthdate", length = 20)
    private String birthdate;
    @Column(name = "sex")
    private Boolean sex;
    @Column(name = "customer_point")
    private Integer customerPoint;
    @OneToMany(mappedBy = "customerId")
    private Collection<Quotes> quotesCollection;
    @OneToMany(mappedBy = "customerId")
    private Collection<Output> outputCollection;
    @OneToMany(mappedBy = "object1")
    private Collection<Receipts> receiptsCollection;
    @OneToMany(mappedBy = "customerId")
    private Collection<SalesCoupon> salesCouponCollection;

    public Customer() {
    }

    public Customer(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(Integer taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Integer getCustomerPoint() {
        return customerPoint;
    }

    public void setCustomerPoint(Integer customerPoint) {
        this.customerPoint = customerPoint;
    }

    @XmlTransient
    public Collection<Quotes> getQuotesCollection() {
        return quotesCollection;
    }

    public void setQuotesCollection(Collection<Quotes> quotesCollection) {
        this.quotesCollection = quotesCollection;
    }

    @XmlTransient
    public Collection<Output> getOutputCollection() {
        return outputCollection;
    }

    public void setOutputCollection(Collection<Output> outputCollection) {
        this.outputCollection = outputCollection;
    }

    @XmlTransient
    public Collection<Receipts> getReceiptsCollection() {
        return receiptsCollection;
    }

    public void setReceiptsCollection(Collection<Receipts> receiptsCollection) {
        this.receiptsCollection = receiptsCollection;
    }

    @XmlTransient
    public Collection<SalesCoupon> getSalesCouponCollection() {
        return salesCouponCollection;
    }

    public void setSalesCouponCollection(Collection<SalesCoupon> salesCouponCollection) {
        this.salesCouponCollection = salesCouponCollection;
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
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Customer[ id=" + id + " ]";
    }
    
}
