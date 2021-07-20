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
@Table(name = "CheckDupSlip")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CheckDupSlip.findAll", query = "SELECT c FROM CheckDupSlip c"),
    @NamedQuery(name = "CheckDupSlip.findById", query = "SELECT c FROM CheckDupSlip c WHERE c.id = :id"),
    @NamedQuery(name = "CheckDupSlip.findByGoodsName", query = "SELECT c FROM CheckDupSlip c WHERE c.goodsName = :goodsName"),
    @NamedQuery(name = "CheckDupSlip.findByWarehouse", query = "SELECT c FROM CheckDupSlip c WHERE c.warehouse = :warehouse"),
    @NamedQuery(name = "CheckDupSlip.findByInputId", query = "SELECT c FROM CheckDupSlip c WHERE c.inputId = :inputId"),
    @NamedQuery(name = "CheckDupSlip.findBySupplier", query = "SELECT c FROM CheckDupSlip c WHERE c.supplier = :supplier")})
public class CheckDupSlip implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    @Id
    private String id;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "warehouse")
    private String warehouse;
    @Basic(optional = false)
    @Column(name = "input_id")
    private String inputId;
    @Column(name = "supplier")
    private String supplier;

    public CheckDupSlip() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getInputId() {
        return inputId;
    }

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
    
}
