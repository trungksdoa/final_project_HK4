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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "thekho", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Thekho.findAll", query = "SELECT t FROM Thekho t"),
    @NamedQuery(name = "Thekho.findByMa", query = "SELECT t FROM Thekho t WHERE t.ma = :ma"),
    @NamedQuery(name = "Thekho.findByTen", query = "SELECT t FROM Thekho t WHERE t.ten = :ten"),
    @NamedQuery(name = "Thekho.findByDonvitinh", query = "SELECT t FROM Thekho t WHERE t.donvitinh = :donvitinh"),
    @NamedQuery(name = "Thekho.findBySoluongton", query = "SELECT t FROM Thekho t WHERE t.soluongton = :soluongton"),
    @NamedQuery(name = "Thekho.findByGiatriton", query = "SELECT t FROM Thekho t WHERE t.giatriton = :giatriton"),
    @NamedQuery(name = "Thekho.findByVonsanxuat", query = "SELECT t FROM Thekho t WHERE t.vonsanxuat = :vonsanxuat"),
    @NamedQuery(name = "Thekho.findByTrongluong", query = "SELECT t FROM Thekho t WHERE t.trongluong = :trongluong")})
public class Thekho implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ma", nullable = false, length = 50)
    private String ma;
    @Size(max = 50)
    @Column(name = "ten", length = 50)
    private String ten;
    @Size(max = 50)
    @Column(name = "donvitinh", length = 50)
    private String donvitinh;
    @Column(name = "soluongton")
    private Integer soluongton;
    @Column(name = "giatriton")
    private Integer giatriton;
    @Column(name = "vonsanxuat")
    private Integer vonsanxuat;
    @Size(max = 10)
    @Column(name = "trongluong", length = 10)
    private String trongluong;
    @JoinColumn(name = "makho", referencedColumnName = "ma")
    @ManyToOne
    private Thongtinkho makho;

    public Thekho() {
    }

    public Thekho(String ma) {
        this.ma = ma;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDonvitinh() {
        return donvitinh;
    }

    public void setDonvitinh(String donvitinh) {
        this.donvitinh = donvitinh;
    }

    public Integer getSoluongton() {
        return soluongton;
    }

    public void setSoluongton(Integer soluongton) {
        this.soluongton = soluongton;
    }

    public Integer getGiatriton() {
        return giatriton;
    }

    public void setGiatriton(Integer giatriton) {
        this.giatriton = giatriton;
    }

    public Integer getVonsanxuat() {
        return vonsanxuat;
    }

    public void setVonsanxuat(Integer vonsanxuat) {
        this.vonsanxuat = vonsanxuat;
    }

    public String getTrongluong() {
        return trongluong;
    }

    public void setTrongluong(String trongluong) {
        this.trongluong = trongluong;
    }

    public Thongtinkho getMakho() {
        return makho;
    }

    public void setMakho(Thongtinkho makho) {
        this.makho = makho;
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
        if (!(object instanceof Thekho)) {
            return false;
        }
        Thekho other = (Thekho) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Backend.demo.model.trung.Thekho[ ma=" + ma + " ]";
    }
    
}
