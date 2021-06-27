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
@Table(name = "Production_order")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productionorder.findAll", query = "SELECT p FROM Productionorder p"),
    @NamedQuery(name = "Productionorder.findById", query = "SELECT p FROM Productionorder p WHERE p.id = :id"),
    @NamedQuery(name = "Productionorder.findByDate", query = "SELECT p FROM Productionorder p WHERE p.date = :date"),
    @NamedQuery(name = "Productionorder.findByExplain", query = "SELECT p FROM Productionorder p WHERE p.explain = :explain"),
    @NamedQuery(name = "Productionorder.findByStatus", query = "SELECT p FROM Productionorder p WHERE p.status = :status")})
public class Productionorder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "date")
    private String date;
    @Column(name = "explain")
    private String explain;
    @Column(name = "status")
    private String status;

    public Productionorder() {
    }

    public Productionorder(String id) {
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

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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
        if (!(object instanceof Productionorder)) {
            return false;
        }
        Productionorder other = (Productionorder) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Productionorder[ id=" + id + " ]";
    }
    
}
