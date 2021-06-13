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
@Table(name = "sodu", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sodu.findAll", query = "SELECT s FROM Sodu s"),
    @NamedQuery(name = "Sodu.findByMa", query = "SELECT s FROM Sodu s WHERE s.ma = :ma"),
    @NamedQuery(name = "Sodu.findBySodu", query = "SELECT s FROM Sodu s WHERE s.sodu = :sodu")})
public class Sodu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma", nullable = false)
    private Integer ma;
    @Column(name = "sodu")
    private Integer sodu;

    public Sodu() {
    }

    public Sodu(Integer ma) {
        this.ma = ma;
    }

    public Integer getMa() {
        return ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }

    public Integer getSodu() {
        return sodu;
    }

    public void setSodu(Integer sodu) {
        this.sodu = sodu;
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
        if (!(object instanceof Sodu)) {
            return false;
        }
        Sodu other = (Sodu) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fpt.aptech.project.Client.Models.Sodu[ ma=" + ma + " ]";
    }
    
}
