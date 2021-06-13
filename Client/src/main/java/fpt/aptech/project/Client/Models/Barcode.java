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
 * @author trung
 */
@Entity
@Table(name = "Barcode", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Barcode.findAll", query = "SELECT b FROM Barcode b"),
    @NamedQuery(name = "Barcode.findById", query = "SELECT b FROM Barcode b WHERE b.id = :id"),
    @NamedQuery(name = "Barcode.findByMavach", query = "SELECT b FROM Barcode b WHERE b.mavach = :mavach"),
    @NamedQuery(name = "Barcode.findByMasanpham", query = "SELECT b FROM Barcode b WHERE b.masanpham = :masanpham"),
    @NamedQuery(name = "Barcode.findByNgaytao", query = "SELECT b FROM Barcode b WHERE b.ngaytao = :ngaytao")})
public class Barcode implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "mavach", length = 100)
    private String mavach;
    @Column(name = "masanpham", length = 50)
    private String masanpham;
    @Column(name = "ngaytao", length = 50)
    private String ngaytao;

    public Barcode() {
    }

    public Barcode(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMavach() {
        return mavach;
    }

    public void setMavach(String mavach) {
        this.mavach = mavach;
    }

    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Barcode)) {
            return false;
        }
        Barcode other = (Barcode) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fpt.aptech.project.Client.Models.Barcode[ id=" + id + " ]";
    }
    
}
