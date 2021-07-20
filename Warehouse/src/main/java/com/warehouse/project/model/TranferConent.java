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
@Table(name = "tranfer_conent")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TranferConent.findAll", query = "SELECT t FROM TranferConent t"),
    @NamedQuery(name = "TranferConent.findById", query = "SELECT t FROM TranferConent t WHERE t.id = :id"),
    @NamedQuery(name = "TranferConent.findByGoodsid", query = "SELECT t FROM TranferConent t WHERE t.goodsid = :goodsid"),
    @NamedQuery(name = "TranferConent.findByUnit", query = "SELECT t FROM TranferConent t WHERE t.unit = :unit"),
    @NamedQuery(name = "TranferConent.findByQuantity", query = "SELECT t FROM TranferConent t WHERE t.quantity = :quantity"),
    @NamedQuery(name = "TranferConent.findByFroms", query = "SELECT t FROM TranferConent t WHERE t.froms = :froms"),
    @NamedQuery(name = "TranferConent.findByTos", query = "SELECT t FROM TranferConent t WHERE t.tos = :tos")})
public class TranferConent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Goods_id")
    private String goodsid;
    @Column(name = "unit")
    private String unit;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "froms")
    private String froms;
    @Column(name = "tos")
    private String tos;
    @JoinColumn(name = "trafer_id", referencedColumnName = "id")
    @ManyToOne
     @JsonIgnore
    private TranferWarehouse traferId;

    public TranferConent() {
    }

    public TranferConent(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getFroms() {
        return froms;
    }

    public void setFroms(String froms) {
        this.froms = froms;
    }

    public String getTos() {
        return tos;
    }

    public void setTos(String tos) {
        this.tos = tos;
    }

    public TranferWarehouse getTraferId() {
        return traferId;
    }

    public void setTraferId(TranferWarehouse traferId) {
        this.traferId = traferId;
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
        if (!(object instanceof TranferConent)) {
            return false;
        }
        TranferConent other = (TranferConent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.TranferConent[ id=" + id + " ]";
    }
    
}
