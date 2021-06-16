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
@Table(name = "supplier")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Supplier.findAll", query = "SELECT s FROM Supplier s"),
    @NamedQuery(name = "Supplier.findById", query = "SELECT s FROM Supplier s WHERE s.id = :id"),
    @NamedQuery(name = "Supplier.findByName", query = "SELECT s FROM Supplier s WHERE s.name = :name"),
    @NamedQuery(name = "Supplier.findByPhone", query = "SELECT s FROM Supplier s WHERE s.phone = :phone"),
    @NamedQuery(name = "Supplier.findByAddress", query = "SELECT s FROM Supplier s WHERE s.address = :address"),
    @NamedQuery(name = "Supplier.findByEmail", query = "SELECT s FROM Supplier s WHERE s.email = :email"),
    @NamedQuery(name = "Supplier.findByTaxNumber", query = "SELECT s FROM Supplier s WHERE s.taxNumber = :taxNumber"),
    @NamedQuery(name = "Supplier.findByExplain", query = "SELECT s FROM Supplier s WHERE s.explain = :explain"),
    @NamedQuery(name = "Supplier.findByBirthdate", query = "SELECT s FROM Supplier s WHERE s.birthdate = :birthdate"),
    @NamedQuery(name = "Supplier.findBySex", query = "SELECT s FROM Supplier s WHERE s.sex = :sex"),
    @NamedQuery(name = "Supplier.findByCustomerPoint", query = "SELECT s FROM Supplier s WHERE s.customerPoint = :customerPoint")})
public class Supplier implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "phone")
    private Integer phone;
    @Column(name = "address")
    private String address;
    @Column(name = "email")
    private String email;
    @Column(name = "tax_number")
    private Integer taxNumber;
    @Column(name = "explain")
    private String explain;
    @Column(name = "birthdate")
    private String birthdate;
    @Column(name = "sex")
    private Boolean sex;
    @Column(name = "customer_point")
    private Integer customerPoint;
    @OneToMany(mappedBy = "supplierId")
    private Collection<Coupon> couponCollection;
    @OneToMany(mappedBy = "supplierId")
    private Collection<Input> inputCollection;

    public Supplier() {
    }

    public Supplier(String id) {
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
    public Collection<Coupon> getCouponCollection() {
        return couponCollection;
    }

    public void setCouponCollection(Collection<Coupon> couponCollection) {
        this.couponCollection = couponCollection;
    }

    @XmlTransient
    public Collection<Input> getInputCollection() {
        return inputCollection;
    }

    public void setInputCollection(Collection<Input> inputCollection) {
        this.inputCollection = inputCollection;
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
        if (!(object instanceof Supplier)) {
            return false;
        }
        Supplier other = (Supplier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Supplier[ id=" + id + " ]";
    }
    
}
