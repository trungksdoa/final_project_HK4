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
 * @author trung
 */
@Entity
@Table(name = "lenhsanxuat", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lenhsanxuat.findAll", query = "SELECT l FROM Lenhsanxuat l"),
    @NamedQuery(name = "Lenhsanxuat.findByMa", query = "SELECT l FROM Lenhsanxuat l WHERE l.ma = :ma"),
    @NamedQuery(name = "Lenhsanxuat.findByNgay", query = "SELECT l FROM Lenhsanxuat l WHERE l.ngay = :ngay"),
    @NamedQuery(name = "Lenhsanxuat.findByChugiai", query = "SELECT l FROM Lenhsanxuat l WHERE l.chugiai = :chugiai"),
    @NamedQuery(name = "Lenhsanxuat.findByTinhtrang", query = "SELECT l FROM Lenhsanxuat l WHERE l.tinhtrang = :tinhtrang")})
public class Lenhsanxuat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma", nullable = false, length = 50)
    private String ma;
    @Column(name = "ngay", length = 50)
    private String ngay;
    @Column(name = "chugiai", length = 50)
    private String chugiai;
    @Column(name = "tinhtrang", length = 50)
    private String tinhtrang;
    @OneToMany(mappedBy = "malenhsanxuat")
    private Collection<NoidungThanhphamLenhsx> noidungThanhphamLenhsxCollection;

    public Lenhsanxuat() {
    }

    public Lenhsanxuat(String ma) {
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

    public String getChugiai() {
        return chugiai;
    }

    public void setChugiai(String chugiai) {
        this.chugiai = chugiai;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    @XmlTransient
    public Collection<NoidungThanhphamLenhsx> getNoidungThanhphamLenhsxCollection() {
        return noidungThanhphamLenhsxCollection;
    }

    public void setNoidungThanhphamLenhsxCollection(Collection<NoidungThanhphamLenhsx> noidungThanhphamLenhsxCollection) {
        this.noidungThanhphamLenhsxCollection = noidungThanhphamLenhsxCollection;
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
        if (!(object instanceof Lenhsanxuat)) {
            return false;
        }
        Lenhsanxuat other = (Lenhsanxuat) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fpt.aptech.project.Client.Models.Lenhsanxuat[ ma=" + ma + " ]";
    }
    
}
