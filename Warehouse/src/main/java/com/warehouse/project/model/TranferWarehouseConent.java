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
@Table(name = "tranfer_warehouse_conent", catalog = "Databases_", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TranferWarehouseConent.findAll", query = "SELECT t FROM TranferWarehouseConent t"),
    @NamedQuery(name = "TranferWarehouseConent.findById", query = "SELECT t FROM TranferWarehouseConent t WHERE t.id = :id"),
    @NamedQuery(name = "TranferWarehouseConent.findByGoodsName", query = "SELECT t FROM TranferWarehouseConent t WHERE t.goodsName = :goodsName"),
    @NamedQuery(name = "TranferWarehouseConent.findByUnit", query = "SELECT t FROM TranferWarehouseConent t WHERE t.unit = :unit"),
    @NamedQuery(name = "TranferWarehouseConent.findByQuantity", query = "SELECT t FROM TranferWarehouseConent t WHERE t.quantity = :quantity"),
    @NamedQuery(name = "TranferWarehouseConent.findByPrice", query = "SELECT t FROM TranferWarehouseConent t WHERE t.price = :price")})
public class TranferWarehouseConent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "goods_name", length = 50)
    private String goodsName;
    @Column(name = "unit", length = 10)
    private String unit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quantity", precision = 53)
    private Double quantity;
    @Column(name = "price", precision = 53)
    private Double price;
    @JoinColumn(name = "trafer_id", referencedColumnName = "id")
    @ManyToOne
    private TranferWarehouse traferId;
    @JoinColumn(name = "warehouse_id", referencedColumnName = "goods_id")
    @ManyToOne
    private Warehouse warehouseId;

    public TranferWarehouseConent() {
    }

    public TranferWarehouseConent(Integer id) {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
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
        if (!(object instanceof TranferWarehouseConent)) {
            return false;
        }
        TranferWarehouseConent other = (TranferWarehouseConent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.TranferWarehouseConent[ id=" + id + " ]";
    }
    
}
