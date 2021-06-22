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
@Table(name = "IO_report_refererence", catalog = "Databases_", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IOreportrefererence.findAll", query = "SELECT i FROM IOreportrefererence i"),
    @NamedQuery(name = "IOreportrefererence.findById", query = "SELECT i FROM IOreportrefererence i WHERE i.id = :id"),
    @NamedQuery(name = "IOreportrefererence.findByCodeId", query = "SELECT i FROM IOreportrefererence i WHERE i.codeId = :codeId"),
    @NamedQuery(name = "IOreportrefererence.findByExplain", query = "SELECT i FROM IOreportrefererence i WHERE i.explain = :explain")})
public class IOreportrefererence implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "code_id", length = 50)
    private String codeId;
    @Column(name = "explain", length = 10)
    private String explain;
    @JoinColumn(name = "IO_report_id", referencedColumnName = "id")
    @ManyToOne
    private IOreport iOreportid;

    public IOreportrefererence() {
    }

    public IOreportrefererence(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodeId() {
        return codeId;
    }

    public void setCodeId(String codeId) {
        this.codeId = codeId;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public IOreport getIOreportid() {
        return iOreportid;
    }

    public void setIOreportid(IOreport iOreportid) {
        this.iOreportid = iOreportid;
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
        if (!(object instanceof IOreportrefererence)) {
            return false;
        }
        IOreportrefererence other = (IOreportrefererence) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.IOreportrefererence[ id=" + id + " ]";
    }
    
}
