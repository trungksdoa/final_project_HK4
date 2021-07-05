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
@Table(name = "Material_production")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materialproduction.findAll", query = "SELECT m FROM Materialproduction m"),
    @NamedQuery(name = "Materialproduction.findById", query = "SELECT m FROM Materialproduction m WHERE m.id = :id"),
    @NamedQuery(name = "Materialproduction.findByGoodsId", query = "SELECT m FROM Materialproduction m WHERE m.goodsId = :goodsId"),
    @NamedQuery(name = "Materialproduction.findByLsx", query = "SELECT m FROM Materialproduction m WHERE m.lsx = :lsx")})
public class Materialproduction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    @Id
    private int id;
    @Column(name = "goods_id")
    private String goodsId;
    @Basic(optional = false)
    @Column(name = "lsx")
    private String lsx;

    public Materialproduction() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getLsx() {
        return lsx;
    }

    public void setLsx(String lsx) {
        this.lsx = lsx;
    }
    
}
