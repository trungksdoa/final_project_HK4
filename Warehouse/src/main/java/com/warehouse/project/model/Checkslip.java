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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author trung
 */
@Entity
@Table(name = "Checkslip")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Checkslip.findAll", query = "SELECT c FROM Checkslip c"),
    @NamedQuery(name = "Checkslip.findById", query = "SELECT c FROM Checkslip c WHERE c.id = :id"),
    @NamedQuery(name = "Checkslip.findByGoodsId", query = "SELECT c FROM Checkslip c WHERE c.goodsId = :goodsId"),
    @NamedQuery(name = "Checkslip.findByDate", query = "SELECT c FROM Checkslip c WHERE c.date = :date"),
    @NamedQuery(name = "Checkslip.findByQuantityinsystem", query = "SELECT c FROM Checkslip c WHERE c.quantityinsystem = :quantityinsystem"),
    @NamedQuery(name = "Checkslip.findByQuantityireal", query = "SELECT c FROM Checkslip c WHERE c.quantityireal = :quantityireal"),
    @NamedQuery(name = "Checkslip.findByDifference", query = "SELECT c FROM Checkslip c WHERE c.difference = :difference"),
    @NamedQuery(name = "Checkslip.findByExplain", query = "SELECT c FROM Checkslip c WHERE c.explain = :explain"),
    @NamedQuery(name = "Checkslip.findByStatus", query = "SELECT c FROM Checkslip c WHERE c.status = :status"),
    @NamedQuery(name = "Checkslip.findByCheckslipid", query = "SELECT c FROM Checkslip c WHERE c.checkslipid = :checkslipid")})
public class Checkslip implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "goods_id")
    private String goodsId;
    @Column(name = "date")
    private String date;
    @Column(name = "quantityinsystem")
    private Integer quantityinsystem;
    @Column(name = "quantityireal")
    private Integer quantityireal;
    @Column(name = "difference")
    private Integer difference;
    @Column(name = "Explain")
    private String explain;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "checkslipid")
    private String checkslipid;

    public Checkslip() {
    }

    public Checkslip(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getQuantityinsystem() {
        return quantityinsystem;
    }

    public void setQuantityinsystem(Integer quantityinsystem) {
        this.quantityinsystem = quantityinsystem;
    }

    public Integer getQuantityireal() {
        return quantityireal;
    }

    public void setQuantityireal(Integer quantityireal) {
        this.quantityireal = quantityireal;
    }

    public Integer getDifference() {
        return difference;
    }

    public void setDifference(Integer difference) {
        this.difference = difference;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getCheckslipid() {
        return checkslipid;
    }

    public void setCheckslipid(String checkslipid) {
        this.checkslipid = checkslipid;
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
        if (!(object instanceof Checkslip)) {
            return false;
        }
        Checkslip other = (Checkslip) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Checkslip[ id=" + id + " ]";
    }
    
}
