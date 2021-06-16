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
    @NamedQuery(name = "TranferWarehouse.findByFromss", query = "SELECT t FROM TranferWarehouse t WHERE t.fromss = :fromss"),
    @NamedQuery(name = "TranferWarehouse.findByToss", query = "SELECT t FROM TranferWarehouse t WHERE t.toss = :toss"),
    @NamedQuery(name = "TranferWarehouse.findByDate", query = "SELECT t FROM TranferWarehouse t WHERE t.date = :date"),
    @NamedQuery(name = "TranferWarehouse.findByExplain", query = "SELECT t FROM TranferWarehouse t WHERE t.explain = :explain")})
public class TranferWarehouse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "fromss")
    private String fromss;
    @Column(name = "toss")
    private String toss;
    @Column(name = "date")
    private String date;
    @Column(name = "explain")
    private String explain;
    @OneToMany(mappedBy = "traferId")
    private Collection<TranferWarehouseConent> tranferWarehouseConentCollection;

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

    public String getFromss() {
        return fromss;
    }

    public void setFromss(String fromss) {
        this.fromss = fromss;
    }

    public String getToss() {
        return toss;
    }

    public void setToss(String toss) {
        this.toss = toss;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    @XmlTransient
    public Collection<TranferWarehouseConent> getTranferWarehouseConentCollection() {
        return tranferWarehouseConentCollection;
    }

    public void setTranferWarehouseConentCollection(Collection<TranferWarehouseConent> tranferWarehouseConentCollection) {
        this.tranferWarehouseConentCollection = tranferWarehouseConentCollection;
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
        return "com.warehouse.project.model.TranferWarehouse[ id=" + id + " ]";
    }
    
}
