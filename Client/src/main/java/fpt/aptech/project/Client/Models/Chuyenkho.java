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
@Table(name = "chuyenkho", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chuyenkho.findAll", query = "SELECT c FROM Chuyenkho c"),
    @NamedQuery(name = "Chuyenkho.findByMa", query = "SELECT c FROM Chuyenkho c WHERE c.ma = :ma"),
    @NamedQuery(name = "Chuyenkho.findByNgay", query = "SELECT c FROM Chuyenkho c WHERE c.ngay = :ngay"),
    @NamedQuery(name = "Chuyenkho.findByTukho", query = "SELECT c FROM Chuyenkho c WHERE c.tukho = :tukho"),
    @NamedQuery(name = "Chuyenkho.findByToikho", query = "SELECT c FROM Chuyenkho c WHERE c.toikho = :toikho"),
    @NamedQuery(name = "Chuyenkho.findByChugiai", query = "SELECT c FROM Chuyenkho c WHERE c.chugiai = :chugiai")})
public class Chuyenkho implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma", nullable = false, length = 50)
    private String ma;
    @Column(name = "ngay", length = 50)
    private String ngay;
    @Column(name = "tukho", length = 50)
    private String tukho;
    @Column(name = "toikho", length = 50)
    private String toikho;
    @Column(name = "chugiai", length = 50)
    private String chugiai;
    @OneToMany(mappedBy = "machuyenhang")
    private Collection<NoidungChuyenhang> noidungChuyenhangCollection;

    public Chuyenkho() {
    }

    public Chuyenkho(String ma) {
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

    public String getTukho() {
        return tukho;
    }

    public void setTukho(String tukho) {
        this.tukho = tukho;
    }

    public String getToikho() {
        return toikho;
    }

    public void setToikho(String toikho) {
        this.toikho = toikho;
    }

    public String getChugiai() {
        return chugiai;
    }

    public void setChugiai(String chugiai) {
        this.chugiai = chugiai;
    }

    @XmlTransient
    public Collection<NoidungChuyenhang> getNoidungChuyenhangCollection() {
        return noidungChuyenhangCollection;
    }

    public void setNoidungChuyenhangCollection(Collection<NoidungChuyenhang> noidungChuyenhangCollection) {
        this.noidungChuyenhangCollection = noidungChuyenhangCollection;
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
        if (!(object instanceof Chuyenkho)) {
            return false;
        }
        Chuyenkho other = (Chuyenkho) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fpt.aptech.project.Client.Models.Chuyenkho[ ma=" + ma + " ]";
    }
    
}
