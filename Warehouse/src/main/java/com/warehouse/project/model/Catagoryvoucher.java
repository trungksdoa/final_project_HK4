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
@Table(name = "Catagoryvoucher")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Catagoryvoucher.findAll", query = "SELECT c FROM Catagoryvoucher c"),
    @NamedQuery(name = "Catagoryvoucher.findById", query = "SELECT c FROM Catagoryvoucher c WHERE c.id = :id"),
    @NamedQuery(name = "Catagoryvoucher.findByVoucherId", query = "SELECT c FROM Catagoryvoucher c WHERE c.voucherId = :voucherId"),
    @NamedQuery(name = "Catagoryvoucher.findByGoodsId", query = "SELECT c FROM Catagoryvoucher c WHERE c.goodsId = :goodsId"),
    @NamedQuery(name = "Catagoryvoucher.findByGoodsName", query = "SELECT c FROM Catagoryvoucher c WHERE c.goodsName = :goodsName"),
    @NamedQuery(name = "Catagoryvoucher.findByUnit", query = "SELECT c FROM Catagoryvoucher c WHERE c.unit = :unit"),
    @NamedQuery(name = "Catagoryvoucher.findByQuantity", query = "SELECT c FROM Catagoryvoucher c WHERE c.quantity = :quantity"),
    @NamedQuery(name = "Catagoryvoucher.findByGroupGoods", query = "SELECT c FROM Catagoryvoucher c WHERE c.groupGoods = :groupGoods")})
public class Catagoryvoucher implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    @Id
    private int id;
    @Basic(optional = false)
    @Column(name = "voucher_id")
    private String voucherId;
    @Column(name = "goods_id")
    private String goodsId;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "unit")
    private String unit;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "group_goods")
    private String groupGoods;

    public Catagoryvoucher() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
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

    public String getGroupGoods() {
        return groupGoods;
    }

    public void setGroupGoods(String groupGoods) {
        this.groupGoods = groupGoods;
    }
    
}
