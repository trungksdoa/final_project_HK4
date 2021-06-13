/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Backend.demo.model.trung;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author trung
 */
@Entity
@Table(name = "chi", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chi.findAll", query = "SELECT c FROM Chi c"),
    @NamedQuery(name = "Chi.findByMa", query = "SELECT c FROM Chi c WHERE c.ma = :ma"),
    @NamedQuery(name = "Chi.findByNgay", query = "SELECT c FROM Chi c WHERE c.ngay = :ngay"),
    @NamedQuery(name = "Chi.findByDoituong", query = "SELECT c FROM Chi c WHERE c.doituong = :doituong"),
    @NamedQuery(name = "Chi.findByGia", query = "SELECT c FROM Chi c WHERE c.gia = :gia"),
    @NamedQuery(name = "Chi.findByChugiai", query = "SELECT c FROM Chi c WHERE c.chugiai = :chugiai"),
    @NamedQuery(name = "Chi.findByNguoithu", query = "SELECT c FROM Chi c WHERE c.nguoithu = :nguoithu"),
    @NamedQuery(name = "Chi.findByDiachi", query = "SELECT c FROM Chi c WHERE c.diachi = :diachi")})
public class Chi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ma", nullable = false, length = 50)
    private String ma;
    @Size(max = 50)
    @Column(name = "ngay", length = 50)
    private String ngay;
    @Size(max = 50)
    @Column(name = "doituong", length = 50)
    private String doituong;
    @Column(name = "gia")
    private Integer gia;
    @Size(max = 50)
    @Column(name = "chugiai", length = 50)
    private String chugiai;
    @Size(max = 50)
    @Column(name = "nguoithu", length = 50)
    private String nguoithu;
    @Size(max = 50)
    @Column(name = "diachi", length = 50)
    private String diachi;

    public Chi() {
    }

    public Chi(String ma) {
        this.ma = ma;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getDoituong() {
        return doituong;
    }

    public void setDoituong(String doituong) {
        this.doituong = doituong;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public String getChugiai() {
        return chugiai;
    }

    public void setChugiai(String chugiai) {
        this.chugiai = chugiai;
    }

    public String getNguoithu() {
        return nguoithu;
    }

    public void setNguoithu(String nguoithu) {
        this.nguoithu = nguoithu;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ma != null ? ma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chi)) {
            return false;
        }
        Chi other = (Chi) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Backend.demo.model.trung.Chi[ ma=" + ma + " ]";
    }
    
}
