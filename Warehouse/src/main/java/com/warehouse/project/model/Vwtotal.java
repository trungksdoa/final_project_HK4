/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.model;

import java.io.Serializable;
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
@Table(name = "Vwtotal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vwtotal.findAll", query = "SELECT v FROM Vwtotal v"),
    @NamedQuery(name = "Vwtotal.findByQuantity", query = "SELECT v FROM Vwtotal v WHERE v.quantity = :quantity"),
    @NamedQuery(name = "Vwtotal.findByGoodsName", query = "SELECT v FROM Vwtotal v WHERE v.goodsName = :goodsName")})
public class Vwtotal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "Quantity")
    @Id
    private Integer quantity;
    @Column(name = "goods_name")
    private String goodsName;

    public Vwtotal() {
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    
}
