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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "phieudathang", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Phieudathang.findAll", query = "SELECT p FROM Phieudathang p"),
    @NamedQuery(name = "Phieudathang.findByMa", query = "SELECT p FROM Phieudathang p WHERE p.ma = :ma"),
    @NamedQuery(name = "Phieudathang.findByNgay", query = "SELECT p FROM Phieudathang p WHERE p.ngay = :ngay"),
    @NamedQuery(name = "Phieudathang.findByKhachhang", query = "SELECT p FROM Phieudathang p WHERE p.khachhang = :khachhang"),
    @NamedQuery(name = "Phieudathang.findByDiachi", query = "SELECT p FROM Phieudathang p WHERE p.diachi = :diachi"),
    @NamedQuery(name = "Phieudathang.findBySodienthoai", query = "SELECT p FROM Phieudathang p WHERE p.sodienthoai = :sodienthoai"),
    @NamedQuery(name = "Phieudathang.findByNguoinhan", query = "SELECT p FROM Phieudathang p WHERE p.nguoinhan = :nguoinhan"),
    @NamedQuery(name = "Phieudathang.findByNguoiban", query = "SELECT p FROM Phieudathang p WHERE p.nguoiban = :nguoiban"),
    @NamedQuery(name = "Phieudathang.findByChugiai", query = "SELECT p FROM Phieudathang p WHERE p.chugiai = :chugiai"),
    @NamedQuery(name = "Phieudathang.findByTukho", query = "SELECT p FROM Phieudathang p WHERE p.tukho = :tukho")})
public class Phieudathang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma", nullable = false, length = 50)
    private String ma;
    @Column(name = "ngay", length = 50)
    private String ngay;
    @Column(name = "khachhang", length = 50)
    private String khachhang;
    @Column(name = "diachi", length = 50)
    private String diachi;
    @Column(name = "sodienthoai")
    private Integer sodienthoai;
    @Column(name = "nguoinhan", length = 50)
    private String nguoinhan;
    @Column(name = "nguoiban", length = 50)
    private String nguoiban;
    @Column(name = "chugiai", length = 50)
    private String chugiai;
    @Column(name = "tukho", length = 50)
    private String tukho;
    @OneToMany(mappedBy = "maphieudathang")
    private Collection<NoidungPhieudatBaogia> noidungPhieudatBaogiaCollection;

    public Phieudathang() {
    }

    public Phieudathang(String ma) {
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

    public String getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(String khachhang) {
        this.khachhang = khachhang;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Integer getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(Integer sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getNguoinhan() {
        return nguoinhan;
    }

    public void setNguoinhan(String nguoinhan) {
        this.nguoinhan = nguoinhan;
    }

    public String getNguoiban() {
        return nguoiban;
    }

    public void setNguoiban(String nguoiban) {
        this.nguoiban = nguoiban;
    }

    public String getChugiai() {
        return chugiai;
    }

    public void setChugiai(String chugiai) {
        this.chugiai = chugiai;
    }

    public String getTukho() {
        return tukho;
    }

    public void setTukho(String tukho) {
        this.tukho = tukho;
    }

    @XmlTransient
    public Collection<NoidungPhieudatBaogia> getNoidungPhieudatBaogiaCollection() {
        return noidungPhieudatBaogiaCollection;
    }

    public void setNoidungPhieudatBaogiaCollection(Collection<NoidungPhieudatBaogia> noidungPhieudatBaogiaCollection) {
        this.noidungPhieudatBaogiaCollection = noidungPhieudatBaogiaCollection;
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
        if (!(object instanceof Phieudathang)) {
            return false;
        }
        Phieudathang other = (Phieudathang) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fpt.aptech.project.Client.Models.Phieudathang[ ma=" + ma + " ]";
    }
    
}
