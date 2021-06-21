/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.model;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author trung
 */
@Entity
@Table(name = "Production_order_content", catalog = "Databases_", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productionordercontent.findAll", query = "SELECT p FROM Productionordercontent p"),
    @NamedQuery(name = "Productionordercontent.findById", query = "SELECT p FROM Productionordercontent p WHERE p.id = :id"),
    @NamedQuery(name = "Productionordercontent.findByGoodsName", query = "SELECT p FROM Productionordercontent p WHERE p.goodsName = :goodsName"),
    @NamedQuery(name = "Productionordercontent.findByUnit", query = "SELECT p FROM Productionordercontent p WHERE p.unit = :unit"),
    @NamedQuery(name = "Productionordercontent.findByQuantity", query = "SELECT p FROM Productionordercontent p WHERE p.quantity = :quantity")})
public class Productionordercontent implements Serializable {

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
    @Column(name = "quantity")
    private Integer quantity;
    @JoinColumn(name = "goods_id", referencedColumnName = "id")
    @ManyToOne
    private GoodsCatagory goodsId;
    @JoinColumn(name = "Production_order_id", referencedColumnName = "id")
    @ManyToOne
    private Productionorder productionorderid;
    @OneToMany(mappedBy = "productionordercontentid")
    private Collection<Productionordermaterial> productionordermaterialCollection;

    public Productionordercontent() {
    }

    public Productionordercontent(Integer id) {
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public GoodsCatagory getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(GoodsCatagory goodsId) {
        this.goodsId = goodsId;
    }

    public Productionorder getProductionorderid() {
        return productionorderid;
    }

    public void setProductionorderid(Productionorder productionorderid) {
        this.productionorderid = productionorderid;
    }

    @XmlTransient
    public Collection<Productionordermaterial> getProductionordermaterialCollection() {
        return productionordermaterialCollection;
    }

    public void setProductionordermaterialCollection(Collection<Productionordermaterial> productionordermaterialCollection) {
        this.productionordermaterialCollection = productionordermaterialCollection;
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
        if (!(object instanceof Productionordercontent)) {
            return false;
        }
        Productionordercontent other = (Productionordercontent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Productionordercontent[ id=" + id + " ]";
    }
    
}
