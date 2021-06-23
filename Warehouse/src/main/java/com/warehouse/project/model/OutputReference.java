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
@Table(name = "output_reference")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OutputReference.findAll", query = "SELECT o FROM OutputReference o"),
    @NamedQuery(name = "OutputReference.findById", query = "SELECT o FROM OutputReference o WHERE o.id = :id"),
    @NamedQuery(name = "OutputReference.findByCodeId", query = "SELECT o FROM OutputReference o WHERE o.codeId = :codeId"),
    @NamedQuery(name = "OutputReference.findByDate", query = "SELECT o FROM OutputReference o WHERE o.date = :date")})
public class OutputReference implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "code_id")
    private String codeId;
    @Column(name = "date")
    private String date;
    @JoinColumn(name = "output_id", referencedColumnName = "id")
    @ManyToOne
    private Output outputId;

    public OutputReference() {
    }

    public OutputReference(Integer id) {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Output getOutputId() {
        return outputId;
    }

    public void setOutputId(Output outputId) {
        this.outputId = outputId;
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
        if (!(object instanceof OutputReference)) {
            return false;
        }
        OutputReference other = (OutputReference) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.OutputReference[ id=" + id + " ]";
    }
    
}
