/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Backend.demo.model.trung;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "noidung_nhapxuat", catalog = "final_project", schema = "dbo")
@XmlRootElement()
@NamedQueries({
    @NamedQuery(name = "NoidungNhapxuat.findAll", query = "SELECT n FROM NoidungNhapxuat n"),
    @NamedQuery(name = "NoidungNhapxuat.findByMa", query = "SELECT n FROM NoidungNhapxuat n WHERE n.ma = :ma"),
    @NamedQuery(name = "NoidungNhapxuat.findByTen", query = "SELECT n FROM NoidungNhapxuat n WHERE n.ten = :ten"),
    @NamedQuery(name = "NoidungNhapxuat.findByDonvitinh", query = "SELECT n FROM NoidungNhapxuat n WHERE n.donvitinh = :donvitinh"),
    @NamedQuery(name = "NoidungNhapxuat.findBySoluong", query = "SELECT n FROM NoidungNhapxuat n WHERE n.soluong = :soluong"),
    @NamedQuery(name = "NoidungNhapxuat.findByGia", query = "SELECT n FROM NoidungNhapxuat n WHERE n.gia = :gia"),
    @NamedQuery(name = "NoidungNhapxuat.findByChietkhau", query = "SELECT n FROM NoidungNhapxuat n WHERE n.chietkhau = :chietkhau"),
    @NamedQuery(name = "NoidungNhapxuat.findByThanhgia", query = "SELECT n FROM NoidungNhapxuat n WHERE n.thanhgia = :thanhgia")})
public class NoidungNhapxuat implements Serializable {

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
    @Column(name = "soluong")
    private Integer soluong;
    @Column(name = "gia")
    private Integer gia;
    @Column(name = "chietkhau")
    private Integer chietkhau;
    @Column(name = "thanhgia")
    private Integer thanhgia;
    @JoinColumn(name = "mahanghoa", referencedColumnName = "ma")
    @ManyToOne
    private Dichvuhanghoa mahanghoa;
    @JoinColumn(name = "maphieunhapxuat", referencedColumnName = "ma")
    @ManyToOne
    @JsonIgnore
    private Phieunhapxuat maphieunhapxuat;

    public NoidungNhapxuat() {
    }

    public NoidungNhapxuat(String ma) {
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

    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public Integer getChietkhau() {
        return chietkhau;
    }

    public void setChietkhau(Integer chietkhau) {
        this.chietkhau = chietkhau;
    }

    public Integer getThanhgia() {
        return thanhgia;
    }

    public void setThanhgia(Integer thanhgia) {
        this.thanhgia = thanhgia;
    }

    public Dichvuhanghoa getMahanghoa() {
        return mahanghoa;
    }

    public void setMahanghoa(Dichvuhanghoa mahanghoa) {
        this.mahanghoa = mahanghoa;
    }

    public Phieunhapxuat getMaphieunhapxuat() {
        return maphieunhapxuat;
    }

    public void setMaphieunhapxuat(Phieunhapxuat maphieunhapxuat) {
        this.maphieunhapxuat = maphieunhapxuat;
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
        if (!(object instanceof NoidungNhapxuat)) {
            return false;
        }
        NoidungNhapxuat other = (NoidungNhapxuat) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Backend.demo.model.trung.NoidungNhapxuat[ ma=" + ma + " ]";
    }

}
