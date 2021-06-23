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
@Table(name = "output")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Output.findAll", query = "SELECT o FROM Output o"),
    @NamedQuery(name = "Output.findById", query = "SELECT o FROM Output o WHERE o.id = :id"),
    @NamedQuery(name = "Output.findByDate", query = "SELECT o FROM Output o WHERE o.date = :date"),
    @NamedQuery(name = "Output.findByObject", query = "SELECT o FROM Output o WHERE o.object = :object"),
    @NamedQuery(name = "Output.findByWarehouse", query = "SELECT o FROM Output o WHERE o.warehouse = :warehouse"),
    @NamedQuery(name = "Output.findByShipper", query = "SELECT o FROM Output o WHERE o.shipper = :shipper"),
    @NamedQuery(name = "Output.findByExplain", query = "SELECT o FROM Output o WHERE o.explain = :explain"),
    @NamedQuery(name = "Output.findByStatus", query = "SELECT o FROM Output o WHERE o.status = :status")})
public class Output implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "date")
    private String date;
    @Column(name = "object")
    private String object;
    @Column(name = "warehouse")
    private String warehouse;
    @Column(name = "shipper")
    private String shipper;
    @Column(name = "explain")
    private String explain;
    @Column(name = "status")
    private String status;
    @OneToMany(mappedBy = "outputId")
    private Collection<OutputContent> outputContentCollection;
    @OneToMany(mappedBy = "outputId")
    private Collection<OutputReference> outputReferenceCollection;

    public Output() {
    }

    public Output(String id) {
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

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getShipper() {
        return shipper;
    }

    public void setShipper(String shipper) {
        this.shipper = shipper;
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

    @XmlTransient
    public Collection<OutputContent> getOutputContentCollection() {
        return outputContentCollection;
    }

    public void setOutputContentCollection(Collection<OutputContent> outputContentCollection) {
        this.outputContentCollection = outputContentCollection;
    }

    @XmlTransient
    public Collection<OutputReference> getOutputReferenceCollection() {
        return outputReferenceCollection;
    }

    public void setOutputReferenceCollection(Collection<OutputReference> outputReferenceCollection) {
        this.outputReferenceCollection = outputReferenceCollection;
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
        if (!(object instanceof Output)) {
            return false;
        }
        Output other = (Output) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Output[ id=" + id + " ]";
    }
    
}
