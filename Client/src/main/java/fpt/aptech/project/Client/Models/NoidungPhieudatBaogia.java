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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "noidung_phieudat_baogia", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NoidungPhieudatBaogia.findAll", query = "SELECT n FROM NoidungPhieudatBaogia n"),
    @NamedQuery(name = "NoidungPhieudatBaogia.findByMa", query = "SELECT n FROM NoidungPhieudatBaogia n WHERE n.ma = :ma"),
    @NamedQuery(name = "NoidungPhieudatBaogia.findByTen", query = "SELECT n FROM NoidungPhieudatBaogia n WHERE n.ten = :ten"),
    @NamedQuery(name = "NoidungPhieudatBaogia.findByDonvitinh", query = "SELECT n FROM NoidungPhieudatBaogia n WHERE n.donvitinh = :donvitinh"),
    @NamedQuery(name = "NoidungPhieudatBaogia.findBySoluong", query = "SELECT n FROM NoidungPhieudatBaogia n WHERE n.soluong = :soluong"),
    @NamedQuery(name = "NoidungPhieudatBaogia.findByGia", query = "SELECT n FROM NoidungPhieudatBaogia n WHERE n.gia = :gia"),
    @NamedQuery(name = "NoidungPhieudatBaogia.findByChietkhau", query = "SELECT n FROM NoidungPhieudatBaogia n WHERE n.chietkhau = :chietkhau"),
    @NamedQuery(name = "NoidungPhieudatBaogia.findByThanhgia", query = "SELECT n FROM NoidungPhieudatBaogia n WHERE n.thanhgia = :thanhgia")})
public class NoidungPhieudatBaogia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma", nullable = false, length = 50)
    private String ma;
    @Column(name = "ten", length = 50)
    private String ten;
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
    @JoinColumn(name = "maphieubaogia", referencedColumnName = "ma")
    @ManyToOne
    private Phieubaogia maphieubaogia;
    @JoinColumn(name = "maphieudathang", referencedColumnName = "ma")
    @ManyToOne
    private Phieudathang maphieudathang;

    public NoidungPhieudatBaogia() {
    }

    public NoidungPhieudatBaogia(String ma) {
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

    public Phieubaogia getMaphieubaogia() {
        return maphieubaogia;
    }

    public void setMaphieubaogia(Phieubaogia maphieubaogia) {
        this.maphieubaogia = maphieubaogia;
    }

    public Phieudathang getMaphieudathang() {
        return maphieudathang;
    }

    public void setMaphieudathang(Phieudathang maphieudathang) {
        this.maphieudathang = maphieudathang;
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
        if (!(object instanceof NoidungPhieudatBaogia)) {
            return false;
        }
        NoidungPhieudatBaogia other = (NoidungPhieudatBaogia) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fpt.aptech.project.Client.Models.NoidungPhieudatBaogia[ ma=" + ma + " ]";
    }
    
}
