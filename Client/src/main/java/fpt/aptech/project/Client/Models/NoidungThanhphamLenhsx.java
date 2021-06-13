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
 * @author PC
 */
@Entity
@Table(name = "noidung_thanhpham_lenhsx", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NoidungThanhphamLenhsx.findAll", query = "SELECT n FROM NoidungThanhphamLenhsx n"),
    @NamedQuery(name = "NoidungThanhphamLenhsx.findByMa", query = "SELECT n FROM NoidungThanhphamLenhsx n WHERE n.ma = :ma"),
    @NamedQuery(name = "NoidungThanhphamLenhsx.findByTen", query = "SELECT n FROM NoidungThanhphamLenhsx n WHERE n.ten = :ten"),
    @NamedQuery(name = "NoidungThanhphamLenhsx.findBySoluong", query = "SELECT n FROM NoidungThanhphamLenhsx n WHERE n.soluong = :soluong"),
    @NamedQuery(name = "NoidungThanhphamLenhsx.findByGia", query = "SELECT n FROM NoidungThanhphamLenhsx n WHERE n.gia = :gia"),
    @NamedQuery(name = "NoidungThanhphamLenhsx.findByDonvitinh", query = "SELECT n FROM NoidungThanhphamLenhsx n WHERE n.donvitinh = :donvitinh")})
public class NoidungThanhphamLenhsx implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma", nullable = false, length = 50)
    private String ma;
    @Column(name = "ten", length = 50)
    private String ten;
    @Column(name = "soluong")
    private Integer soluong;
    @Column(name = "gia")
    private Integer gia;
    @Column(name = "donvitinh", length = 50)
    private String donvitinh;
    @JoinColumn(name = "malenhsanxuat", referencedColumnName = "ma")
    @ManyToOne
    private Lenhsanxuat malenhsanxuat;
    @OneToMany(mappedBy = "malenhsanxuat")
    private Collection<TainguyenTheolenhsx> tainguyenTheolenhsxCollection;

    public NoidungThanhphamLenhsx() {
    }

    public NoidungThanhphamLenhsx(String ma) {
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

    public String getDonvitinh() {
        return donvitinh;
    }

    public void setDonvitinh(String donvitinh) {
        this.donvitinh = donvitinh;
    }

    public Lenhsanxuat getMalenhsanxuat() {
        return malenhsanxuat;
    }

    public void setMalenhsanxuat(Lenhsanxuat malenhsanxuat) {
        this.malenhsanxuat = malenhsanxuat;
    }

    @XmlTransient
    public Collection<TainguyenTheolenhsx> getTainguyenTheolenhsxCollection() {
        return tainguyenTheolenhsxCollection;
    }

    public void setTainguyenTheolenhsxCollection(Collection<TainguyenTheolenhsx> tainguyenTheolenhsxCollection) {
        this.tainguyenTheolenhsxCollection = tainguyenTheolenhsxCollection;
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
        if (!(object instanceof NoidungThanhphamLenhsx)) {
            return false;
        }
        NoidungThanhphamLenhsx other = (NoidungThanhphamLenhsx) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fpt.aptech.project.Client.Models.NoidungThanhphamLenhsx[ ma=" + ma + " ]";
    }
    
}
