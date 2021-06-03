/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Backend.demo.model.trung;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author trung
 */
@Entity
@Table(name = "nhacungcap", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nhacungcap.findAll", query = "SELECT n FROM Nhacungcap n"),
    @NamedQuery(name = "Nhacungcap.findByMa", query = "SELECT n FROM Nhacungcap n WHERE n.ma = :ma"),
    @NamedQuery(name = "Nhacungcap.findByTen", query = "SELECT n FROM Nhacungcap n WHERE n.ten = :ten"),
    @NamedQuery(name = "Nhacungcap.findBySodienthoai", query = "SELECT n FROM Nhacungcap n WHERE n.sodienthoai = :sodienthoai"),
    @NamedQuery(name = "Nhacungcap.findByDiachi", query = "SELECT n FROM Nhacungcap n WHERE n.diachi = :diachi"),
    @NamedQuery(name = "Nhacungcap.findByEmail", query = "SELECT n FROM Nhacungcap n WHERE n.email = :email"),
    @NamedQuery(name = "Nhacungcap.findByThue", query = "SELECT n FROM Nhacungcap n WHERE n.thue = :thue"),
    @NamedQuery(name = "Nhacungcap.findByManganhang", query = "SELECT n FROM Nhacungcap n WHERE n.manganhang = :manganhang"),
    @NamedQuery(name = "Nhacungcap.findByChuthich", query = "SELECT n FROM Nhacungcap n WHERE n.chuthich = :chuthich")})
public class Nhacungcap implements Serializable {

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
    @Column(name = "sodienthoai", length = 50)
    private String sodienthoai;
    @Size(max = 50)
    @Column(name = "diachi", length = 50)
    private String diachi;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "email", length = 50)
    private String email;
    @Column(name = "thue")
    private Integer thue;
    @Column(name = "manganhang")
    private Integer manganhang;
    @Size(max = 50)
    @Column(name = "chuthich", length = 50)
    private String chuthich;
    @OneToMany(mappedBy = "manhacungcap")
    private Collection<Phieunhapxuat> phieunhapxuatCollection;

    public Nhacungcap() {
    }

    public Nhacungcap(String ma) {
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

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
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

    public Integer getThue() {
        return thue;
    }

    public void setThue(Integer thue) {
        this.thue = thue;
    }

    public Integer getManganhang() {
        return manganhang;
    }

    public void setManganhang(Integer manganhang) {
        this.manganhang = manganhang;
    }

    public String getChuthich() {
        return chuthich;
    }

    public void setChuthich(String chuthich) {
        this.chuthich = chuthich;
    }

    @XmlTransient
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
        if (!(object instanceof Nhacungcap)) {
            return false;
        }
        Nhacungcap other = (Nhacungcap) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Backend.demo.model.trung.Nhacungcap[ ma=" + ma + " ]";
    }
    
}
