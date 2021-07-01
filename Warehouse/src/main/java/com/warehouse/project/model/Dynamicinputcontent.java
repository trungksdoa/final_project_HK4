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
@Table(name = "Dynamic_inputcontent")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dynamicinputcontent.findAll", query = "SELECT d FROM Dynamicinputcontent d"),
    @NamedQuery(name = "Dynamicinputcontent.findById", query = "SELECT d FROM Dynamicinputcontent d WHERE d.id = :id"),
    @NamedQuery(name = "Dynamicinputcontent.findByQuantity", query = "SELECT d FROM Dynamicinputcontent d WHERE d.quantity = :quantity"),
    @NamedQuery(name = "Dynamicinputcontent.findByPrice", query = "SELECT d FROM Dynamicinputcontent d WHERE d.price = :price"),
    @NamedQuery(name = "Dynamicinputcontent.findByWarehouse", query = "SELECT d FROM Dynamicinputcontent d WHERE d.warehouse = :warehouse"),
    @NamedQuery(name = "Dynamicinputcontent.findBySupplier", query = "SELECT d FROM Dynamicinputcontent d WHERE d.supplier = :supplier")})
public class Dynamicinputcontent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id")
    @Id
    private String id;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "price")
    private Integer price;
    @Column(name = "warehouse")
    private String warehouse;
    @Column(name = "supplier")
    private String supplier;

    public Dynamicinputcontent() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
    
}
