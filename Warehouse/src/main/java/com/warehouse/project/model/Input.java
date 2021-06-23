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
    @NamedQuery(name = "Input.findByObject", query = "SELECT i FROM Input i WHERE i.object = :object"),
    @NamedQuery(name = "Input.findByImporter", query = "SELECT i FROM Input i WHERE i.importer = :importer"),
    @NamedQuery(name = "Input.findByWarehouse", query = "SELECT i FROM Input i WHERE i.warehouse = :warehouse"),
    @NamedQuery(name = "Input.findByShipper", query = "SELECT i FROM Input i WHERE i.shipper = :shipper"),
    @NamedQuery(name = "Input.findByExplain", query = "SELECT i FROM Input i WHERE i.explain = :explain"),
    @NamedQuery(name = "Input.findByStatus", query = "SELECT i FROM Input i WHERE i.status = :status")})
public class Input implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "date")
    private String date;
    @Column(name = "object")
    private String object;
    @Column(name = "importer")
    private String importer;
    @Column(name = "warehouse")
    private String warehouse;
    @Column(name = "shipper")
    private String shipper;
    @Column(name = "explain")
    private String explain;
    @Column(name = "status")
    private String status;
    @OneToMany(mappedBy = "inputId")
    private Collection<InputReference> inputReferenceCollection;
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

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getImporter() {
        return importer;
    }

    public void setImporter(String importer) {
        this.importer = importer;
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
    public Collection<InputReference> getInputReferenceCollection() {
        return inputReferenceCollection;
    }

    public void setInputReferenceCollection(Collection<InputReference> inputReferenceCollection) {
        this.inputReferenceCollection = inputReferenceCollection;
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
        return "com.warehouse.project.model.Input[ id=" + id + " ]";
    }
    
}
