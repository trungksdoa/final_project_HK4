/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author trung
 */
@Entity
@Table(name = "khachhang", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Khachhang.findAll", query = "SELECT k FROM Khachhang k"),
    @NamedQuery(name = "Khachhang.findByMa", query = "SELECT k FROM Khachhang k WHERE k.ma = :ma"),
    @NamedQuery(name = "Khachhang.findByTen", query = "SELECT k FROM Khachhang k WHERE k.ten = :ten"),
    @NamedQuery(name = "Khachhang.findBySodienthoai", query = "SELECT k FROM Khachhang k WHERE k.sodienthoai = :sodienthoai"),
    @NamedQuery(name = "Khachhang.findByDiachi", query = "SELECT k FROM Khachhang k WHERE k.diachi = :diachi"),
    @NamedQuery(name = "Khachhang.findByEmail", query = "SELECT k FROM Khachhang k WHERE k.email = :email"),
    @NamedQuery(name = "Khachhang.findByMathue", query = "SELECT k FROM Khachhang k WHERE k.mathue = :mathue"),
    @NamedQuery(name = "Khachhang.findByManganhang", query = "SELECT k FROM Khachhang k WHERE k.manganhang = :manganhang"),
    @NamedQuery(name = "Khachhang.findByChuthich", query = "SELECT k FROM Khachhang k WHERE k.chuthich = :chuthich"),
    @NamedQuery(name = "Khachhang.findByNgaysinhnhat", query = "SELECT k FROM Khachhang k WHERE k.ngaysinhnhat = :ngaysinhnhat"),
    @NamedQuery(name = "Khachhang.findByGioitinh", query = "SELECT k FROM Khachhang k WHERE k.gioitinh = :gioitinh"),
    @NamedQuery(name = "Khachhang.findByDiemthuong", query = "SELECT k FROM Khachhang k WHERE k.diemthuong = :diemthuong")})
public class Khachhang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma", nullable = false, length = 50)
    private String ma;
    @Basic(optional = false)
    @Column(name = "ten", nullable = false, length = 50)
    private String ten;
    @Column(name = "sodienthoai")
    private Integer sodienthoai;
    @Column(name = "diachi", length = 50)
    private String diachi;
    @Column(name = "email", length = 50)
    private String email;
    @Column(name = "mathue", length = 10)
    private String mathue;
    @Column(name = "manganhang", length = 50)
    private String manganhang;
    @Column(name = "chuthich", length = 50)
    private String chuthich;
    @Column(name = "ngaysinhnhat", length = 50)
    private String ngaysinhnhat;
    @Column(name = "gioitinh")
    private Boolean gioitinh;
    @Column(name = "diemthuong")
    private Integer diemthuong;
    @OneToMany(mappedBy = "makhachhang")
    private Collection<Phieunhapxuat> phieunhapxuatCollection;

    public Khachhang() {
    }

    public Khachhang(String ma) {
        this.ma = ma;
    }

    public Khachhang(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
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

    public Integer getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(Integer sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMathue() {
        return mathue;
    }

    public void setMathue(String mathue) {
        this.mathue = mathue;
    }

    public String getManganhang() {
        return manganhang;
    }

    public void setManganhang(String manganhang) {
        this.manganhang = manganhang;
    }

    public String getChuthich() {
        return chuthich;
    }

    public void setChuthich(String chuthich) {
        this.chuthich = chuthich;
    }

    public String getNgaysinhnhat() {
        return ngaysinhnhat;
    }

    public void setNgaysinhnhat(String ngaysinhnhat) {
        this.ngaysinhnhat = ngaysinhnhat;
    }

    public Boolean getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(Boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Integer getDiemthuong() {
        return diemthuong;
    }

    public void setDiemthuong(Integer diemthuong) {
        this.diemthuong = diemthuong;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<Phieunhapxuat> getPhieunhapxuatCollection() {
        return phieunhapxuatCollection;
    }

    public void setPhieunhapxuatCollection(Collection<Phieunhapxuat> phieunhapxuatCollection) {
        this.phieunhapxuatCollection = phieunhapxuatCollection;
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
        if (!(object instanceof Khachhang)) {
            return false;
        }
        Khachhang other = (Khachhang) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.demo.Model.Khachhang[ ma=" + ma + " ]";
    }
    
}
