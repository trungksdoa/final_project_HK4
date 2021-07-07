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
    @NamedQuery(name = "Checkstockslip.findByWarehouse", query = "SELECT c FROM Checkstockslip c WHERE c.warehouse = :warehouse"),
    @NamedQuery(name = "Checkstockslip.findByStatus", query = "SELECT c FROM Checkstockslip c WHERE c.status = :status"),
    @NamedQuery(name = "Checkstockslip.findByStatus2", query = "SELECT c FROM Checkstockslip c WHERE c.status2 = :status2")})
public class Checkstockslip implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "Date")
    private String date;
    @Column(name = "warehouse")
    private String warehouse;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "status2")
    private String status2;

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

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getStatus2() {
        return status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2;
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
        return id;
    }
    
}
