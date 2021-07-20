/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "input")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Input.findAll", query = "SELECT i FROM Input i"),
    @NamedQuery(name = "Input.findById", query = "SELECT i FROM Input i WHERE i.id = :id"),
    @NamedQuery(name = "Input.findByDate", query = "SELECT i FROM Input i WHERE i.date = :date"),
    @NamedQuery(name = "Input.findByDate2", query = "SELECT i FROM Input i WHERE i.date2 = :date2"),
    @NamedQuery(name = "Input.findByExplain", query = "SELECT i FROM Input i WHERE i.explain = :explain"),
    @NamedQuery(name = "Input.findByService", query = "SELECT i FROM Input i WHERE i.service = :service"),
    @NamedQuery(name = "Input.findByStatus", query = "SELECT i FROM Input i WHERE i.status = :status")})
public class Input implements Serializable {

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
    @Column(name = "service")
    private String service;
    @Column(name = "status")
    private Integer status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inputId")
    private Collection<InputContent> inputContentCollection;

    public Input() {
    }

    public Input(String id) {
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

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @XmlTransient
    public Collection<InputContent> getInputContentCollection() {
        return inputContentCollection;
    }

    public void setInputContentCollection(Collection<InputContent> inputContentCollection) {
        this.inputContentCollection = inputContentCollection;
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
        if (!(object instanceof Input)) {
            return false;
        }
        Input other = (Input) object;
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
