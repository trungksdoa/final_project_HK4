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
public class VoucherBean {
    String id;
    String date;
    String supId;
    String Address;
    int phone;
    String expalins;

    public VoucherBean(String id, String date, String supId, String Address, int phone, String expalins) {
        this.id = id;
        this.date = date;
        this.supId = supId;
        this.Address = Address;
        this.phone = phone;
        this.expalins = expalins;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSupId() {
        return supId;
    }

    public void setSupId(String supId) {
        this.supId = supId;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getExpalins() {
        return expalins;
    }

    public void setExpalins(String expalins) {
        this.expalins = expalins;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VoucherBean{id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", supId=").append(supId);
        sb.append(", Address=").append(Address);
        sb.append(", phone=").append(phone);
        sb.append(", expalins=").append(expalins);
        sb.append('}');
        return sb.toString();
    }
    
    
}
