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
@Table(name = "dichvuhanghoa", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dichvuhanghoa.findAll", query = "SELECT d FROM Dichvuhanghoa d"),
    @NamedQuery(name = "Dichvuhanghoa.findByMa", query = "SELECT d FROM Dichvuhanghoa d WHERE d.ma = :ma"),
    @NamedQuery(name = "Dichvuhanghoa.findByTen", query = "SELECT d FROM Dichvuhanghoa d WHERE d.ten = :ten"),
    @NamedQuery(name = "Dichvuhanghoa.findByPhanloai", query = "SELECT d FROM Dichvuhanghoa d WHERE d.phanloai = :phanloai"),
    @NamedQuery(name = "Dichvuhanghoa.findByBarcode", query = "SELECT d FROM Dichvuhanghoa d WHERE d.barcode = :barcode"),
    @NamedQuery(name = "Dichvuhanghoa.findByDonvitinh", query = "SELECT d FROM Dichvuhanghoa d WHERE d.donvitinh = :donvitinh"),
    @NamedQuery(name = "Dichvuhanghoa.findByGiasi", query = "SELECT d FROM Dichvuhanghoa d WHERE d.giasi = :giasi"),
    @NamedQuery(name = "Dichvuhanghoa.findByGiale", query = "SELECT d FROM Dichvuhanghoa d WHERE d.giale = :giale"),
    @NamedQuery(name = "Dichvuhanghoa.findByTrongluong", query = "SELECT d FROM Dichvuhanghoa d WHERE d.trongluong = :trongluong")})
public class Dichvuhanghoa implements Serializable {

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
    @Column(name = "phanloai", length = 50)
    private String phanloai;
    @Size(max = 100)
    @Column(name = "barcode", length = 100)
    private String barcode;
    @Size(max = 50)
    @Column(name = "donvitinh", length = 50)
    private String donvitinh;
    @Column(name = "giasi")
    private Integer giasi;
    @Column(name = "giale")
    private Integer giale;
    @Column(name = "trongluong")
    private Integer trongluong;
    @OneToMany(mappedBy = "mahanghoa")
    private Collection<NoidungNhapxuat> noidungNhapxuatCollection;

    public Dichvuhanghoa() {
    }

    public Dichvuhanghoa(String ma) {
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

    public String getPhanloai() {
        return phanloai;
    }

    public void setPhanloai(String phanloai) {
        this.phanloai = phanloai;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getDonvitinh() {
        return donvitinh;
    }

    public void setDonvitinh(String donvitinh) {
        this.donvitinh = donvitinh;
    }

    public Integer getGiasi() {
        return giasi;
    }

    public void setGiasi(Integer giasi) {
        this.giasi = giasi;
    }

    public Integer getGiale() {
        return giale;
    }

    public void setGiale(Integer giale) {
        this.giale = giale;
    }

    public Integer getTrongluong() {
        return trongluong;
    }

    public void setTrongluong(Integer trongluong) {
        this.trongluong = trongluong;
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
        if (!(object instanceof Dichvuhanghoa)) {
            return false;
        }
        Dichvuhanghoa other = (Dichvuhanghoa) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Backend.demo.model.trung.Dichvuhanghoa[ ma=" + ma + " ]";
    }
    
}
