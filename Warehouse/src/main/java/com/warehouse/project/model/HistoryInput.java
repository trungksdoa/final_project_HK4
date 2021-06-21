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
@Table(name = "history_input", catalog = "Databases_", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoryInput.findAll", query = "SELECT h FROM HistoryInput h"),
    @NamedQuery(name = "HistoryInput.findById", query = "SELECT h FROM HistoryInput h WHERE h.id = :id"),
    @NamedQuery(name = "HistoryInput.findByNoteId", query = "SELECT h FROM HistoryInput h WHERE h.noteId = :noteId"),
    @NamedQuery(name = "HistoryInput.findByDate", query = "SELECT h FROM HistoryInput h WHERE h.date = :date"),
    @NamedQuery(name = "HistoryInput.findByExplain", query = "SELECT h FROM HistoryInput h WHERE h.explain = :explain"),
    @NamedQuery(name = "HistoryInput.findByOwed", query = "SELECT h FROM HistoryInput h WHERE h.owed = :owed"),
    @NamedQuery(name = "HistoryInput.findByPay", query = "SELECT h FROM HistoryInput h WHERE h.pay = :pay"),
    @NamedQuery(name = "HistoryInput.findByImporter", query = "SELECT h FROM HistoryInput h WHERE h.importer = :importer")})
public class HistoryInput implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "note_id", length = 50)
    private String noteId;
    @Column(name = "date", length = 50)
    private String date;
    @Column(name = "explain", length = 50)
    private String explain;
    @Column(name = "owed")
    private Integer owed;
    @Column(name = "pay")
    private Integer pay;
    @Column(name = "importer", length = 50)
    private String importer;

    public HistoryInput() {
    }

    public HistoryInput(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
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

    public Integer getOwed() {
        return owed;
    }

    public void setOwed(Integer owed) {
        this.owed = owed;
    }

    public Integer getPay() {
        return pay;
    }

    public void setPay(Integer pay) {
        this.pay = pay;
    }

    public String getImporter() {
        return importer;
    }

    public void setImporter(String importer) {
        this.importer = importer;
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
        if (!(object instanceof HistoryInput)) {
            return false;
        }
        HistoryInput other = (HistoryInput) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.HistoryInput[ id=" + id + " ]";
    }
    
}
