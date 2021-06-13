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
@Table(name = "thunokh_chitranhacungcap", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ThunokhChitranhacungcap.findAll", query = "SELECT t FROM ThunokhChitranhacungcap t"),
    @NamedQuery(name = "ThunokhChitranhacungcap.findByMa", query = "SELECT t FROM ThunokhChitranhacungcap t WHERE t.ma = :ma"),
    @NamedQuery(name = "ThunokhChitranhacungcap.findByKhachhangNhacungcap", query = "SELECT t FROM ThunokhChitranhacungcap t WHERE t.khachhangNhacungcap = :khachhangNhacungcap"),
    @NamedQuery(name = "ThunokhChitranhacungcap.findByNguoitraKhachhang", query = "SELECT t FROM ThunokhChitranhacungcap t WHERE t.nguoitraKhachhang = :nguoitraKhachhang"),
    @NamedQuery(name = "ThunokhChitranhacungcap.findByChugiai", query = "SELECT t FROM ThunokhChitranhacungcap t WHERE t.chugiai = :chugiai"),
    @NamedQuery(name = "ThunokhChitranhacungcap.findByGia", query = "SELECT t FROM ThunokhChitranhacungcap t WHERE t.gia = :gia"),
    @NamedQuery(name = "ThunokhChitranhacungcap.findByNghiepvu", query = "SELECT t FROM ThunokhChitranhacungcap t WHERE t.nghiepvu = :nghiepvu"),
    @NamedQuery(name = "ThunokhChitranhacungcap.findByNguoithuNguoichi", query = "SELECT t FROM ThunokhChitranhacungcap t WHERE t.nguoithuNguoichi = :nguoithuNguoichi"),
    @NamedQuery(name = "ThunokhChitranhacungcap.findByKieuthanhtoan", query = "SELECT t FROM ThunokhChitranhacungcap t WHERE t.kieuthanhtoan = :kieuthanhtoan"),
    @NamedQuery(name = "ThunokhChitranhacungcap.findByNgay", query = "SELECT t FROM ThunokhChitranhacungcap t WHERE t.ngay = :ngay"),
    @NamedQuery(name = "ThunokhChitranhacungcap.findByDiachi", query = "SELECT t FROM ThunokhChitranhacungcap t WHERE t.diachi = :diachi")})
public class ThunokhChitranhacungcap implements Serializable {

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

    public ThunokhChitranhacungcap() {
    }

    public ThunokhChitranhacungcap(String ma) {
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
        if (!(object instanceof ThunokhChitranhacungcap)) {
            return false;
        }
        ThunokhChitranhacungcap other = (ThunokhChitranhacungcap) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fpt.aptech.project.Client.Models.ThunokhChitranhacungcap[ ma=" + ma + " ]";
    }
    
}
