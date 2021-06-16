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
@Table(name = "receipts_reference")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReceiptsReference.findAll", query = "SELECT r FROM ReceiptsReference r"),
    @NamedQuery(name = "ReceiptsReference.findById", query = "SELECT r FROM ReceiptsReference r WHERE r.id = :id"),
    @NamedQuery(name = "ReceiptsReference.findByReference", query = "SELECT r FROM ReceiptsReference r WHERE r.reference = :reference")})
public class ReceiptsReference implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "reference")
    private String reference;
    @JoinColumn(name = "receipts_id", referencedColumnName = "id")
    @ManyToOne
    private Receipts receiptsId;

    public ReceiptsReference() {
    }

    public ReceiptsReference(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Receipts getReceiptsId() {
        return receiptsId;
    }

    public void setReceiptsId(Receipts receiptsId) {
        this.receiptsId = receiptsId;
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
        if (!(object instanceof ReceiptsReference)) {
            return false;
        }
        ReceiptsReference other = (ReceiptsReference) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.ReceiptsReference[ id=" + id + " ]";
    }
    
}
