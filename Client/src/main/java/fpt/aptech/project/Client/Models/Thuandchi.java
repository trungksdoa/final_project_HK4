/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.aptech.project.Client.Models;

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
 * @author PC
 */
@Entity
@Table(name = "Thu_and_chi", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Thuandchi.findAll", query = "SELECT t FROM Thuandchi t"),
    @NamedQuery(name = "Thuandchi.findByMa", query = "SELECT t FROM Thuandchi t WHERE t.ma = :ma"),
    @NamedQuery(name = "Thuandchi.findByNgay", query = "SELECT t FROM Thuandchi t WHERE t.ngay = :ngay"),
    @NamedQuery(name = "Thuandchi.findByKhachhangNhacungcap", query = "SELECT t FROM Thuandchi t WHERE t.khachhangNhacungcap = :khachhangNhacungcap"),
    @NamedQuery(name = "Thuandchi.findByGia", query = "SELECT t FROM Thuandchi t WHERE t.gia = :gia"),
    @NamedQuery(name = "Thuandchi.findByKieuphieu", query = "SELECT t FROM Thuandchi t WHERE t.kieuphieu = :kieuphieu"),
    @NamedQuery(name = "Thuandchi.findByNghiepvu", query = "SELECT t FROM Thuandchi t WHERE t.nghiepvu = :nghiepvu"),
    @NamedQuery(name = "Thuandchi.findByNguoithuNguoichi", query = "SELECT t FROM Thuandchi t WHERE t.nguoithuNguoichi = :nguoithuNguoichi"),
    @NamedQuery(name = "Thuandchi.findByDiachi", query = "SELECT t FROM Thuandchi t WHERE t.diachi = :diachi")})
public class Thuandchi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma", nullable = false, length = 50)
    private String ma;
    @Column(name = "ngay", length = 50)
    private String ngay;
    @Column(name = "khachhang_nhacungcap", length = 50)
    private String khachhangNhacungcap;
    @Column(name = "gia")
    private Integer gia;
    @Column(name = "kieuphieu", length = 50)
    private String kieuphieu;
    @Column(name = "nghiepvu", length = 50)
    private String nghiepvu;
    @Column(name = "nguoithu_nguoichi", length = 50)
    private String nguoithuNguoichi;
    @Column(name = "diachi", length = 50)
    private String diachi;

    public Thuandchi() {
    }

    public Thuandchi(String ma) {
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

    public String getKhachhangNhacungcap() {
        return khachhangNhacungcap;
    }

    public void setKhachhangNhacungcap(String khachhangNhacungcap) {
        this.khachhangNhacungcap = khachhangNhacungcap;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public String getKieuphieu() {
        return kieuphieu;
    }

    public void setKieuphieu(String kieuphieu) {
        this.kieuphieu = kieuphieu;
    }

    public String getNghiepvu() {
        return nghiepvu;
    }

    public void setNghiepvu(String nghiepvu) {
        this.nghiepvu = nghiepvu;
    }

    public String getNguoithuNguoichi() {
        return nguoithuNguoichi;
    }

    public void setNguoithuNguoichi(String nguoithuNguoichi) {
        this.nguoithuNguoichi = nguoithuNguoichi;
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
        if (!(object instanceof Thuandchi)) {
            return false;
        }
        Thuandchi other = (Thuandchi) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fpt.aptech.project.Client.Models.Thuandchi[ ma=" + ma + " ]";
    }
    
}
