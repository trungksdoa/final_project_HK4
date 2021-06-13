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
@Table(name = "thongtinkho", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Thongtinkho.findAll", query = "SELECT t FROM Thongtinkho t"),
    @NamedQuery(name = "Thongtinkho.findByMa", query = "SELECT t FROM Thongtinkho t WHERE t.ma = :ma"),
    @NamedQuery(name = "Thongtinkho.findByDiachi", query = "SELECT t FROM Thongtinkho t WHERE t.diachi = :diachi")})
public class Thongtinkho implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma", nullable = false, length = 50)
    private String ma;
    @Column(name = "diachi", length = 50)
    private String diachi;
    @OneToMany(mappedBy = "makho")
    private Collection<Thekho> thekhoCollection;

    public Thongtinkho() {
    }

    public Thongtinkho(String ma) {
        this.ma = ma;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @XmlTransient
    public Collection<Thekho> getThekhoCollection() {
        return thekhoCollection;
    }

    public void setThekhoCollection(Collection<Thekho> thekhoCollection) {
        this.thekhoCollection = thekhoCollection;
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
        if (!(object instanceof Thongtinkho)) {
            return false;
        }
        Thongtinkho other = (Thongtinkho) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fpt.aptech.project.Client.Models.Thongtinkho[ ma=" + ma + " ]";
    }
    
}
