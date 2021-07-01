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
    @NamedQuery(name = "TranferConent.findByGoodsName", query = "SELECT t FROM TranferConent t WHERE t.goodsName = :goodsName"),
    @NamedQuery(name = "TranferConent.findByUnit", query = "SELECT t FROM TranferConent t WHERE t.unit = :unit"),
    @NamedQuery(name = "TranferConent.findByQuantity", query = "SELECT t FROM TranferConent t WHERE t.quantity = :quantity"),
    @NamedQuery(name = "TranferConent.findByPrice", query = "SELECT t FROM TranferConent t WHERE t.price = :price")})
public class TranferConent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "unit")
    private String unit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quantity")
    private Double quantity;
    @Column(name = "price")
    private Integer price;
    @JoinColumn(name = "trafer_id", referencedColumnName = "id")
    @ManyToOne
    @JsonIgnore
    private TranferWarehouse traferId;
    @JoinColumn(name = "warehouse_id", referencedColumnName = "id")
    @ManyToOne
    @JsonIgnore
    private Warehouse warehouseId;

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

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public TranferWarehouse getTraferId() {
        return traferId;
    }

    public void setTraferId(TranferWarehouse traferId) {
        this.traferId = traferId;
    }

    public Warehouse getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Warehouse warehouseId) {
        this.warehouseId = warehouseId;
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
