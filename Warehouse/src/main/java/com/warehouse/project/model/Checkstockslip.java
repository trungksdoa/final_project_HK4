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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author trung
 */
@Entity
@Table(name = "Checkstockslip")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Checkstockslip.findAll", query = "SELECT c FROM Checkstockslip c"),
    @NamedQuery(name = "Checkstockslip.findById", query = "SELECT c FROM Checkstockslip c WHERE c.id = :id"),
    @NamedQuery(name = "Checkstockslip.findByDate", query = "SELECT c FROM Checkstockslip c WHERE c.date = :date"),
    @NamedQuery(name = "Checkstockslip.findByDate2", query = "SELECT c FROM Checkstockslip c WHERE c.date2 = :date2"),
    @NamedQuery(name = "Checkstockslip.findByWarehouse", query = "SELECT c FROM Checkstockslip c WHERE c.warehouse = :warehouse"),
    @NamedQuery(name = "Checkstockslip.findByStatus", query = "SELECT c FROM Checkstockslip c WHERE c.status = :status")})
public class Checkstockslip implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "Date")
    private String date;
    @Column(name = "Date2")
    private String date2;
    @Column(name = "warehouse")
    private String warehouse;
    @Column(name = "status")
    private Integer status;

    public Checkstockslip() {
    }

    public Checkstockslip(String id) {
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

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        if (!(object instanceof Checkstockslip)) {
            return false;
        }
        Checkstockslip other = (Checkstockslip) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Checkstockslip[ id=" + id + " ]";
    }
    
}
