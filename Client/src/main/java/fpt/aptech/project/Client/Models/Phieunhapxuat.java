/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.aptech.project.Client.Models;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author trung
 */
@Entity
@Table(name = "phieunhapxuat", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Phieunhapxuat.findAll", query = "SELECT p FROM Phieunhapxuat p"),
    @NamedQuery(name = "Phieunhapxuat.findByMa", query = "SELECT p FROM Phieunhapxuat p WHERE p.ma = :ma"),
    @NamedQuery(name = "Phieunhapxuat.findByNgay", query = "SELECT p FROM Phieunhapxuat p WHERE p.ngay = :ngay"),
    @NamedQuery(name = "Phieunhapxuat.findByDiachi", query = "SELECT p FROM Phieunhapxuat p WHERE p.diachi = :diachi"),
    @NamedQuery(name = "Phieunhapxuat.findByKieuNhapHayXuat", query = "SELECT p FROM Phieunhapxuat p WHERE p.kieuNhapHayXuat = :kieuNhapHayXuat"),
    @NamedQuery(name = "Phieunhapxuat.findByNguoinhap", query = "SELECT p FROM Phieunhapxuat p WHERE p.nguoinhap = :nguoinhap"),
    @NamedQuery(name = "Phieunhapxuat.findByKieuthanhtoan", query = "SELECT p FROM Phieunhapxuat p WHERE p.kieuthanhtoan = :kieuthanhtoan"),
    @NamedQuery(name = "Phieunhapxuat.findByKho", query = "SELECT p FROM Phieunhapxuat p WHERE p.kho = :kho"),
    @NamedQuery(name = "Phieunhapxuat.findByOwed", query = "SELECT p FROM Phieunhapxuat p WHERE p.owed = :owed"),
    @NamedQuery(name = "Phieunhapxuat.findByDathanhtoanbaonhieutien", query = "SELECT p FROM Phieunhapxuat p WHERE p.dathanhtoanbaonhieutien = :dathanhtoanbaonhieutien"),
    @NamedQuery(name = "Phieunhapxuat.findByNguoigiao", query = "SELECT p FROM Phieunhapxuat p WHERE p.nguoigiao = :nguoigiao"),
    @NamedQuery(name = "Phieunhapxuat.findByTinhtrangphieu", query = "SELECT p FROM Phieunhapxuat p WHERE p.tinhtrangphieu = :tinhtrangphieu"),
    @NamedQuery(name = "Phieunhapxuat.findByChugiai", query = "SELECT p FROM Phieunhapxuat p WHERE p.chugiai = :chugiai")})
public class Phieunhapxuat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma", nullable = false, length = 50)
    private String ma;
    @Column(name = "ngay", length = 50)
    private String ngay;
    @Column(name = "diachi", length = 50)
    private String diachi;
    @Column(name = "kieu_nhap_hay_xuat", length = 50)
    private String kieuNhapHayXuat;
    @Column(name = "nguoinhap", length = 50)
    private String nguoinhap;
    @Column(name = "kieuthanhtoan", length = 50)
    private String kieuthanhtoan;
    @Column(name = "kho", length = 50)
    private String kho;
    @Column(name = "owed")
    private Integer owed;
    @Column(name = "dathanhtoanbaonhieutien")
    private Integer dathanhtoanbaonhieutien;
    @Column(name = "nguoigiao", length = 50)
    private String nguoigiao;
    @Column(name = "tinhtrangphieu", length = 50)
    private String tinhtrangphieu;
    @Column(name = "chugiai", length = 50)
    private String chugiai;
    @JoinColumn(name = "makhachhang", referencedColumnName = "ma")
    @ManyToOne
    private Khachhang makhachhang;
    @JoinColumn(name = "manhacungcap", referencedColumnName = "ma")
    @ManyToOne
    private Nhacungcap manhacungcap;
    @OneToMany(mappedBy = "maphieunhapxuat")
    private Collection<NoidungNhapxuat> noidungNhapxuatCollection;

    public Phieunhapxuat() {
    }

    public Phieunhapxuat(String ma) {
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getKieuNhapHayXuat() {
        return kieuNhapHayXuat;
    }

    public void setKieuNhapHayXuat(String kieuNhapHayXuat) {
        this.kieuNhapHayXuat = kieuNhapHayXuat;
    }

    public String getNguoinhap() {
        return nguoinhap;
    }

    public void setNguoinhap(String nguoinhap) {
        this.nguoinhap = nguoinhap;
    }

    public String getKieuthanhtoan() {
        return kieuthanhtoan;
    }

    public void setKieuthanhtoan(String kieuthanhtoan) {
        this.kieuthanhtoan = kieuthanhtoan;
    }

    public String getKho() {
        return kho;
    }

    public void setKho(String kho) {
        this.kho = kho;
    }

    public Integer getOwed() {
        return owed;
    }

    public void setOwed(Integer owed) {
        this.owed = owed;
    }

    public Integer getDathanhtoanbaonhieutien() {
        return dathanhtoanbaonhieutien;
    }

    public void setDathanhtoanbaonhieutien(Integer dathanhtoanbaonhieutien) {
        this.dathanhtoanbaonhieutien = dathanhtoanbaonhieutien;
    }

    public String getNguoigiao() {
        return nguoigiao;
    }

    public void setNguoigiao(String nguoigiao) {
        this.nguoigiao = nguoigiao;
    }

    public String getTinhtrangphieu() {
        return tinhtrangphieu;
    }

    public void setTinhtrangphieu(String tinhtrangphieu) {
        this.tinhtrangphieu = tinhtrangphieu;
    }

    public String getChugiai() {
        return chugiai;
    }

    public void setChugiai(String chugiai) {
        this.chugiai = chugiai;
    }

    public Khachhang getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(Khachhang makhachhang) {
        this.makhachhang = makhachhang;
    }

    public Nhacungcap getManhacungcap() {
        return manhacungcap;
    }

    public void setManhacungcap(Nhacungcap manhacungcap) {
        this.manhacungcap = manhacungcap;
    }

    @XmlTransient
    public Collection<NoidungNhapxuat> getNoidungNhapxuatCollection() {
        return noidungNhapxuatCollection;
    }

    public void setNoidungNhapxuatCollection(Collection<NoidungNhapxuat> noidungNhapxuatCollection) {
        this.noidungNhapxuatCollection = noidungNhapxuatCollection;
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
        if (!(object instanceof Phieunhapxuat)) {
            return false;
        }
        Phieunhapxuat other = (Phieunhapxuat) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fpt.aptech.project.Client.Models.Phieunhapxuat[ ma=" + ma + " ]";
    }
    
}
