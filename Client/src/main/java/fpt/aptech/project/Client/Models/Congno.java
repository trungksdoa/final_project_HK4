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
 * @author trung
 */
@Entity
@Table(name = "Congno", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Congno.findAll", query = "SELECT c FROM Congno c"),
    @NamedQuery(name = "Congno.findByMa", query = "SELECT c FROM Congno c WHERE c.ma = :ma"),
    @NamedQuery(name = "Congno.findByKhachhangNhacungcap", query = "SELECT c FROM Congno c WHERE c.khachhangNhacungcap = :khachhangNhacungcap"),
    @NamedQuery(name = "Congno.findByNguoitraKhachhang", query = "SELECT c FROM Congno c WHERE c.nguoitraKhachhang = :nguoitraKhachhang"),
    @NamedQuery(name = "Congno.findByChugiai", query = "SELECT c FROM Congno c WHERE c.chugiai = :chugiai"),
    @NamedQuery(name = "Congno.findByGia", query = "SELECT c FROM Congno c WHERE c.gia = :gia"),
    @NamedQuery(name = "Congno.findByNghiepvu", query = "SELECT c FROM Congno c WHERE c.nghiepvu = :nghiepvu"),
    @NamedQuery(name = "Congno.findByNguoithuNguoichi", query = "SELECT c FROM Congno c WHERE c.nguoithuNguoichi = :nguoithuNguoichi"),
    @NamedQuery(name = "Congno.findByKieuthanhtoan", query = "SELECT c FROM Congno c WHERE c.kieuthanhtoan = :kieuthanhtoan"),
    @NamedQuery(name = "Congno.findByNgay", query = "SELECT c FROM Congno c WHERE c.ngay = :ngay"),
    @NamedQuery(name = "Congno.findByDiachi", query = "SELECT c FROM Congno c WHERE c.diachi = :diachi")})
public class Congno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma", nullable = false, length = 50)
    private String ma;
    @Column(name = "khachhang_nhacungcap", length = 50)
    private String khachhangNhacungcap;
    @Column(name = "nguoitra_khachhang", length = 50)
    private String nguoitraKhachhang;
    @Column(name = "chugiai", length = 50)
    private String chugiai;
    @Column(name = "gia")
    private Integer gia;
    @Column(name = "nghiepvu", length = 50)
    private String nghiepvu;
    @Column(name = "nguoithu_nguoichi", length = 50)
    private String nguoithuNguoichi;
    @Column(name = "kieuthanhtoan", length = 50)
    private String kieuthanhtoan;
    @Column(name = "ngay", length = 50)
    private String ngay;
    @Column(name = "diachi", length = 50)
    private String diachi;

    public Congno() {
    }

    public Congno(String ma) {
        this.ma = ma;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getKhachhangNhacungcap() {
        return khachhangNhacungcap;
    }

    public void setKhachhangNhacungcap(String khachhangNhacungcap) {
        this.khachhangNhacungcap = khachhangNhacungcap;
    }

    public String getNguoitraKhachhang() {
        return nguoitraKhachhang;
    }

    public void setNguoitraKhachhang(String nguoitraKhachhang) {
        this.nguoitraKhachhang = nguoitraKhachhang;
    }

    public String getChugiai() {
        return chugiai;
    }

    public void setChugiai(String chugiai) {
        this.chugiai = chugiai;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
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

    public String getKieuthanhtoan() {
        return kieuthanhtoan;
    }

    public void setKieuthanhtoan(String kieuthanhtoan) {
        this.kieuthanhtoan = kieuthanhtoan;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
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
        if (!(object instanceof Congno)) {
            return false;
        }
        Congno other = (Congno) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fpt.aptech.project.Client.Models.Congno[ ma=" + ma + " ]";
    }
    
}
