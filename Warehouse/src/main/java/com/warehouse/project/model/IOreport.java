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
@Table(name = "IO_report")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IOreport.findAll", query = "SELECT i FROM IOreport i"),
    @NamedQuery(name = "IOreport.findById", query = "SELECT i FROM IOreport i WHERE i.id = :id"),
    @NamedQuery(name = "IOreport.findByDate", query = "SELECT i FROM IOreport i WHERE i.date = :date"),
    @NamedQuery(name = "IOreport.findByExplain", query = "SELECT i FROM IOreport i WHERE i.explain = :explain"),
    @NamedQuery(name = "IOreport.findByMajor", query = "SELECT i FROM IOreport i WHERE i.major = :major")})
public class IOreport implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date")
    private String date;
    @Column(name = "explain")
    private String explain;
    @Column(name = "major")
    private String major;
    @OneToMany(mappedBy = "iOreportid")
    private Collection<IOreportrefererence> iOreportrefererenceCollection;

    public IOreport() {
    }

    public IOreport(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @XmlTransient
    public Collection<IOreportrefererence> getIOreportrefererenceCollection() {
        return iOreportrefererenceCollection;
    }

    public void setIOreportrefererenceCollection(Collection<IOreportrefererence> iOreportrefererenceCollection) {
        this.iOreportrefererenceCollection = iOreportrefererenceCollection;
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
        if (!(object instanceof IOreport)) {
            return false;
        }
        IOreport other = (IOreport) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.IOreport[ id=" + id + " ]";
    }
    
}
