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
public class TranferContnetDTO {
    int id;
    String goodsId;
    String unit;
    int quantity;
    String from;
    String to;
    String tranferId;

    public TranferContnetDTO(int id, String goodsId, String unit, int quantity, String from, String to, String tranferId) {
        this.id = id;
        this.goodsId = goodsId;
        this.unit = unit;
        this.quantity = quantity;
        this.from = from;
        this.to = to;
        this.tranferId = tranferId;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTranferId() {
        return tranferId;
    }

    public void setTranferId(String tranferId) {
        this.tranferId = tranferId;
    }
    
        
}
