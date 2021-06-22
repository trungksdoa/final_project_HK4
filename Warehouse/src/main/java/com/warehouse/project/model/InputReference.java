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
@Table(name = "input_reference", catalog = "Databases_", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InputReference.findAll", query = "SELECT i FROM InputReference i"),
    @NamedQuery(name = "InputReference.findById", query = "SELECT i FROM InputReference i WHERE i.id = :id"),
    @NamedQuery(name = "InputReference.findByCodeId", query = "SELECT i FROM InputReference i WHERE i.codeId = :codeId"),
    @NamedQuery(name = "InputReference.findByDate", query = "SELECT i FROM InputReference i WHERE i.date = :date")})
public class InputReference implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "code_id", length = 50)
    private String codeId;
    @Column(name = "date", length = 50)
    private String date;
    @JoinColumn(name = "input_id", referencedColumnName = "id")
    @ManyToOne
    private Input inputId;

    public InputReference() {
    }

    public InputReference(Integer id) {
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

    public Input getInputId() {
        return inputId;
    }

    public void setInputId(Input inputId) {
        this.inputId = inputId;
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
        if (!(object instanceof InputReference)) {
            return false;
        }
        InputReference other = (InputReference) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.InputReference[ id=" + id + " ]";
    }
    
}
