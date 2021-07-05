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
public class Hisotryio {
    private String licenece;
    private String date;
    private String goodsId;
    private String goodsName;
    private int input;   
    private int output;
    private String unit;
     private int price;

    public Hisotryio(String licenece,String date, String goodsId, String goodsName, int input, int output, String unit, int price) {
        this.date = date;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.input = input;
        this.output = output;
        this.unit = unit;
        this.price = price;
        this.licenece = licenece;
    }

    public int getPrice() {
        return price;
    }

    public String getLicenece() {
        return licenece;
    }

    public void setLicenece(String licenece) {
        this.licenece = licenece;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "Hisotryio{" + "date=" + date + ", goodsId=" + goodsId + ", goodsName=" + goodsName + ", input=" + input + ", output=" + output + ", unit=" + unit + '}';
    }
    
    
}