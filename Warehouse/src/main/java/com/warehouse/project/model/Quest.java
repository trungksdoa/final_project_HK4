/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "Quest")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Quest.findAll", query = "SELECT q FROM Quest q"),
    @NamedQuery(name = "Quest.findById", query = "SELECT q FROM Quest q WHERE q.id = :id"),
    @NamedQuery(name = "Quest.findByJobName", query = "SELECT q FROM Quest q WHERE q.jobName = :jobName"),
    @NamedQuery(name = "Quest.findByQuest", query = "SELECT q FROM Quest q WHERE q.quest = :quest"),
    @NamedQuery(name = "Quest.findByDate", query = "SELECT q FROM Quest q WHERE q.date = :date"),
    @NamedQuery(name = "Quest.findByStatus", query = "SELECT q FROM Quest q WHERE q.status = :status")})
public class Quest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "job_name")
    private String jobName;
    @Column(name = "quest")
    private String quest;
    @Column(name = "date")
    private String date;
    @Column(name = "status")
    private Boolean status;
    @JoinColumn(name = "User_id", referencedColumnName = "id")
    @ManyToOne
    @JsonIgnore
    private Account userid;

    public Quest() {
    }

    public Quest(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Account getUserid() {
        return userid;
    }

    public void setUserid(Account userid) {
        this.userid = userid;
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
        if (!(object instanceof Quest)) {
            return false;
        }
        Quest other = (Quest) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Quest[ id=" + id + " ]";
    }
    
}
