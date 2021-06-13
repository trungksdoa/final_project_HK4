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
@Table(name = "nhomhanghoa", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nhomhanghoa.findAll", query = "SELECT n FROM Nhomhanghoa n"),
    @NamedQuery(name = "Nhomhanghoa.findByMa", query = "SELECT n FROM Nhomhanghoa n WHERE n.ma = :ma"),
    @NamedQuery(name = "Nhomhanghoa.findByTen", query = "SELECT n FROM Nhomhanghoa n WHERE n.ten = :ten")})
public class Nhomhanghoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma", nullable = false, length = 50)
    private String ma;
    @Column(name = "ten", length = 50)
    private String ten;
    @OneToMany(mappedBy = "manhomhang")
    private Collection<NoidungNhomhang> noidungNhomhangCollection;

    public Nhomhanghoa() {
    }

    public Nhomhanghoa(String ma) {
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

    @XmlTransient
    public Collection<NoidungNhomhang> getNoidungNhomhangCollection() {
        return noidungNhomhangCollection;
    }

    public void setNoidungNhomhangCollection(Collection<NoidungNhomhang> noidungNhomhangCollection) {
        this.noidungNhomhangCollection = noidungNhomhangCollection;
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
        if (!(object instanceof Nhomhanghoa)) {
            return false;
        }
        Nhomhanghoa other = (Nhomhanghoa) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fpt.aptech.project.Client.Models.Nhomhanghoa[ ma=" + ma + " ]";
    }
    
}
