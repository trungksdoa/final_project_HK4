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
@Table(name = "Vwwarehouses_io")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vwwarehousesio.findAll", query = "SELECT v FROM Vwwarehousesio v"),
    @NamedQuery(name = "Vwwarehousesio.findByDate", query = "SELECT v FROM Vwwarehousesio v WHERE v.date = :date"),
    @NamedQuery(name = "Vwwarehousesio.findByGoodsId", query = "SELECT v FROM Vwwarehousesio v WHERE v.goodsId = :goodsId"),
    @NamedQuery(name = "Vwwarehousesio.findByGoodsName", query = "SELECT v FROM Vwwarehousesio v WHERE v.goodsName = :goodsName"),
    @NamedQuery(name = "Vwwarehousesio.findByInput", query = "SELECT v FROM Vwwarehousesio v WHERE v.input = :input"),
    @NamedQuery(name = "Vwwarehousesio.findByOutput", query = "SELECT v FROM Vwwarehousesio v WHERE v.output = :output"),
    @NamedQuery(name = "Vwwarehousesio.findByUnit", query = "SELECT v FROM Vwwarehousesio v WHERE v.unit = :unit")})
public class Vwwarehousesio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "date")
    @Id
    private String date;
    @Column(name = "goods_id")
    private String goodsId;
    @Column(name = "goods_name")
    private String goodsName;
    @Column(name = "Input")
    private Integer input;
    @Column(name = "Output")
    private Integer output;
    @Column(name = "unit")
    private String unit;

    public Vwwarehousesio() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public Integer getInput() {
        return input;
    }

    public void setInput(Integer input) {
        this.input = input;
    }

    public Integer getOutput() {
        return output;
    }

    public void setOutput(Integer output) {
        this.output = output;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    
}
