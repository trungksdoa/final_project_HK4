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
@Table(name = "voucher", catalog = "Databases_", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Voucher.findAll", query = "SELECT v FROM Voucher v"),
    @NamedQuery(name = "Voucher.findById", query = "SELECT v FROM Voucher v WHERE v.id = :id"),
    @NamedQuery(name = "Voucher.findByDate", query = "SELECT v FROM Voucher v WHERE v.date = :date"),
    @NamedQuery(name = "Voucher.findByAddress", query = "SELECT v FROM Voucher v WHERE v.address = :address"),
    @NamedQuery(name = "Voucher.findByPhone", query = "SELECT v FROM Voucher v WHERE v.phone = :phone"),
    @NamedQuery(name = "Voucher.findByExpain", query = "SELECT v FROM Voucher v WHERE v.expain = :expain"),
    @NamedQuery(name = "Voucher.findByCreator", query = "SELECT v FROM Voucher v WHERE v.creator = :creator")})
public class Voucher implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false, length = 50)
    private String id;
    @Column(name = "date", length = 20)
    private String date;
    @Column(name = "address", length = 50)
    private String address;
    @Column(name = "phone")
    private Integer phone;
    @Column(name = "expain", length = 100)
    private String expain;
    @Column(name = "creator", length = 50)
    private String creator;
    @JoinColumn(name = "supplier_id", referencedColumnName = "id")
    @ManyToOne
    private Supplier supplierId;
    @OneToMany(mappedBy = "couponId")
    private Collection<VoucherContent> voucherContentCollection;

    public Voucher() {
    }

    public Voucher(String id) {
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

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getExpain() {
        return expain;
    }

    public void setExpain(String expain) {
        this.expain = expain;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Supplier getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Supplier supplierId) {
        this.supplierId = supplierId;
    }

    @XmlTransient
    public Collection<VoucherContent> getVoucherContentCollection() {
        return voucherContentCollection;
    }

    public void setVoucherContentCollection(Collection<VoucherContent> voucherContentCollection) {
        this.voucherContentCollection = voucherContentCollection;
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
        if (!(object instanceof Voucher)) {
            return false;
        }
        Voucher other = (Voucher) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Voucher[ id=" + id + " ]";
    }
    
}
