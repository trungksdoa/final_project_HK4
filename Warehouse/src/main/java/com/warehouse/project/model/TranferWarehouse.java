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
@Table(name = "tranfer_warehouse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TranferWarehouse.findAll", query = "SELECT t FROM TranferWarehouse t"),
    @NamedQuery(name = "TranferWarehouse.findById", query = "SELECT t FROM TranferWarehouse t WHERE t.id = :id"),
    @NamedQuery(name = "TranferWarehouse.findByDate", query = "SELECT t FROM TranferWarehouse t WHERE t.date = :date"),
    @NamedQuery(name = "TranferWarehouse.findByDate2", query = "SELECT t FROM TranferWarehouse t WHERE t.date2 = :date2"),
    @NamedQuery(name = "TranferWarehouse.findByExplain", query = "SELECT t FROM TranferWarehouse t WHERE t.explain = :explain"),
    @NamedQuery(name = "TranferWarehouse.findByStatus", query = "SELECT t FROM TranferWarehouse t WHERE t.status = :status")})
public class TranferWarehouse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "date")
    private String date;
    @Column(name = "date2")
    private String date2;
    @Column(name = "explain")
    private String explain;
    @Column(name = "status")
    private Integer status;
    @OneToMany(mappedBy = "traferId")
    private Collection<TranferConent> tranferConentCollection;

    public TranferWarehouse() {
    }

    public TranferWarehouse(String id) {
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

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @XmlTransient
    public Collection<TranferConent> getTranferConentCollection() {
        return tranferConentCollection;
    }

    public void setTranferConentCollection(Collection<TranferConent> tranferConentCollection) {
        this.tranferConentCollection = tranferConentCollection;
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
        if (!(object instanceof TranferWarehouse)) {
            return false;
        }
        TranferWarehouse other = (TranferWarehouse) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id;
    }
    
}
