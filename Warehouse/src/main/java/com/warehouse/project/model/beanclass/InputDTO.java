/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.model.beanclass;

/**
 *
 * @author trung
 */
public class InputDTO {

    public int id;
    public String goodsid;
    public String goodsname;
    public String unit;
    public int Quantity;
    public String warehouse;
    public int inputPrice;
    public String Groupgoods;
    public int weight;
    public String inputId;
    public String supplierid;
    public String refeences;

    public InputDTO(int id, String goodsid, String goodsname, String unit, int Quantity, String warehouse, int inputPrice, String Groupgoods, int weight, String inputId, String supplierid, String refeences) {
        this.id = id;
        this.goodsid = goodsid;
        this.goodsname = goodsname;
        this.unit = unit;
        this.Quantity = Quantity;
        this.warehouse = warehouse;
        this.inputPrice = inputPrice;
        this.Groupgoods = Groupgoods;
        this.weight = weight;
        this.inputId = inputId;
        this.supplierid = supplierid;
        this.refeences = refeences;
    }

    public InputDTO() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public int getInputPrice() {
        return inputPrice;
    }

    public void setInputPrice(int inputPrice) {
        this.inputPrice = inputPrice;
    }

    public String getGroupgoods() {
        return Groupgoods;
    }

    public void setGroupgoods(String Groupgoods) {
        this.Groupgoods = Groupgoods;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getInputId() {
        return inputId;
    }

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    public String getRefeences() {
        return refeences;
    }

    public void setRefeences(String refeences) {
        this.refeences = refeences;
    }

}
