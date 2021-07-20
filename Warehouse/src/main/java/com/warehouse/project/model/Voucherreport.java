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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "Voucher_report")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Voucherreport.findAll", query = "SELECT v FROM Voucherreport v"),
    @NamedQuery(name = "Voucherreport.findById", query = "SELECT v FROM Voucherreport v WHERE v.id = :id"),
    @NamedQuery(name = "Voucherreport.findByDatecreate", query = "SELECT v FROM Voucherreport v WHERE v.datecreate = :datecreate"),
    @NamedQuery(name = "Voucherreport.findByExplain", query = "SELECT v FROM Voucherreport v WHERE v.explain = :explain")})
public class Voucherreport implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "datecreate")
    private String datecreate;
    @Column(name = "explain")
    private String explain;
    @OneToMany(mappedBy = "voucherId")
    private Collection<Voucherreportrefere> voucherreportrefereCollection;

    public Voucherreport() {
    }

    public Voucherreport(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDatecreate() {
        return datecreate;
    }

    public void setDatecreate(String datecreate) {
        this.datecreate = datecreate;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    @XmlTransient
    public Collection<Voucherreportrefere> getVoucherreportrefereCollection() {
        return voucherreportrefereCollection;
    }

    public void setVoucherreportrefereCollection(Collection<Voucherreportrefere> voucherreportrefereCollection) {
        this.voucherreportrefereCollection = voucherreportrefereCollection;
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
        if (!(object instanceof Voucherreport)) {
            return false;
        }
        Voucherreport other = (Voucherreport) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Voucherreport[ id=" + id + " ]";
    }
    
}
