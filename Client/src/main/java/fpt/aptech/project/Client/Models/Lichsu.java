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
@Table(name = "lichsu", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lichsu.findAll", query = "SELECT l FROM Lichsu l"),
    @NamedQuery(name = "Lichsu.findByMa", query = "SELECT l FROM Lichsu l WHERE l.ma = :ma"),
    @NamedQuery(name = "Lichsu.findByThoigian", query = "SELECT l FROM Lichsu l WHERE l.thoigian = :thoigian"),
    @NamedQuery(name = "Lichsu.findByPhieu", query = "SELECT l FROM Lichsu l WHERE l.phieu = :phieu"),
    @NamedQuery(name = "Lichsu.findByNghiepvu", query = "SELECT l FROM Lichsu l WHERE l.nghiepvu = :nghiepvu"),
    @NamedQuery(name = "Lichsu.findByDiengiai", query = "SELECT l FROM Lichsu l WHERE l.diengiai = :diengiai"),
    @NamedQuery(name = "Lichsu.findByGia", query = "SELECT l FROM Lichsu l WHERE l.gia = :gia"),
    @NamedQuery(name = "Lichsu.findByTentaikhoanAdmin", query = "SELECT l FROM Lichsu l WHERE l.tentaikhoanAdmin = :tentaikhoanAdmin")})
public class Lichsu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma", nullable = false)
    private Integer ma;
    @Column(name = "thoigian", length = 50)
    private String thoigian;
    @Column(name = "phieu", length = 50)
    private String phieu;
    @Column(name = "nghiepvu", length = 50)
    private String nghiepvu;
    @Column(name = "diengiai", length = 50)
    private String diengiai;
    @Column(name = "gia", length = 50)
    private String gia;
    @Column(name = "tentaikhoan_admin", length = 50)
    private String tentaikhoanAdmin;

    public Lichsu() {
    }

    public Lichsu(Integer ma) {
        this.ma = ma;
    }

    public Integer getMa() {
        return ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    public String getPhieu() {
        return phieu;
    }

    public void setPhieu(String phieu) {
        this.phieu = phieu;
    }

    public String getNghiepvu() {
        return nghiepvu;
    }

    public void setNghiepvu(String nghiepvu) {
        this.nghiepvu = nghiepvu;
    }

    public String getDiengiai() {
        return diengiai;
    }

    public void setDiengiai(String diengiai) {
        this.diengiai = diengiai;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getTentaikhoanAdmin() {
        return tentaikhoanAdmin;
    }

    public void setTentaikhoanAdmin(String tentaikhoanAdmin) {
        this.tentaikhoanAdmin = tentaikhoanAdmin;
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
        if (!(object instanceof Lichsu)) {
            return false;
        }
        Lichsu other = (Lichsu) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fpt.aptech.project.Client.Models.Lichsu[ ma=" + ma + " ]";
    }
    
}
