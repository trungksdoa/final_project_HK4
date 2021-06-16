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
@Table(name = "coupon_pay_reference")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CouponPayReference.findAll", query = "SELECT c FROM CouponPayReference c"),
    @NamedQuery(name = "CouponPayReference.findById", query = "SELECT c FROM CouponPayReference c WHERE c.id = :id"),
    @NamedQuery(name = "CouponPayReference.findByReference", query = "SELECT c FROM CouponPayReference c WHERE c.reference = :reference")})
public class CouponPayReference implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "reference")
    private String reference;
    @JoinColumn(name = "coupon_pay_id", referencedColumnName = "id")
    @ManyToOne
    private CouponPay couponPayId;

    public CouponPayReference() {
    }

    public CouponPayReference(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public CouponPay getCouponPayId() {
        return couponPayId;
    }

    public void setCouponPayId(CouponPay couponPayId) {
        this.couponPayId = couponPayId;
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
        if (!(object instanceof CouponPayReference)) {
            return false;
        }
        CouponPayReference other = (CouponPayReference) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.CouponPayReference[ id=" + id + " ]";
    }
    
}
