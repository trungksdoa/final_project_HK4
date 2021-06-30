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
import javax.persistence.Id;
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
@Table(name = "Groups_goods")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Groupsgoods.findAll", query = "SELECT g FROM Groupsgoods g"),
    @NamedQuery(name = "Groupsgoods.findById", query = "SELECT g FROM Groupsgoods g WHERE g.id = :id"),
    @NamedQuery(name = "Groupsgoods.findByName", query = "SELECT g FROM Groupsgoods g WHERE g.name = :name")})
public class Groupsgoods implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "Name")
    private String name;
    @OneToMany(mappedBy = "groupGoods")
    private Collection<GoodsCatagory> goodsCatagoryCollection;

    public Groupsgoods() {
    }

    public Groupsgoods(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public Collection<GoodsCatagory> getGoodsCatagoryCollection() {
        return goodsCatagoryCollection;
    }

    public void setGoodsCatagoryCollection(Collection<GoodsCatagory> goodsCatagoryCollection) {
        this.goodsCatagoryCollection = goodsCatagoryCollection;
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
        if (!(object instanceof Groupsgoods)) {
            return false;
        }
        Groupsgoods other = (Groupsgoods) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.warehouse.project.model.Groupsgoods[ id=" + id + " ]";
    }


}
