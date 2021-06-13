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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author trung
 */
@Entity
@Table(name = "noidung_nhomhang", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NoidungNhomhang.findAll", query = "SELECT n FROM NoidungNhomhang n"),
    @NamedQuery(name = "NoidungNhomhang.findByMa", query = "SELECT n FROM NoidungNhomhang n WHERE n.ma = :ma")})
public class NoidungNhomhang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ma", nullable = false)
    private Integer ma;
    @JoinColumn(name = "mahanghoa", referencedColumnName = "ma")
    @ManyToOne
    private Dichvuhanghoa mahanghoa;
    @JoinColumn(name = "manhomhang", referencedColumnName = "ma")
    @ManyToOne
    private Nhomhanghoa manhomhang;

    public NoidungNhomhang() {
    }

    public NoidungNhomhang(Integer ma) {
        this.ma = ma;
    }

    public Integer getMa() {
        return ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }

    public Dichvuhanghoa getMahanghoa() {
        return mahanghoa;
    }

    public void setMahanghoa(Dichvuhanghoa mahanghoa) {
        this.mahanghoa = mahanghoa;
    }

    public Nhomhanghoa getManhomhang() {
        return manhomhang;
    }

    public void setManhomhang(Nhomhanghoa manhomhang) {
        this.manhomhang = manhomhang;
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
        if (!(object instanceof NoidungNhomhang)) {
            return false;
        }
        NoidungNhomhang other = (NoidungNhomhang) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fpt.aptech.project.Client.Models.NoidungNhomhang[ ma=" + ma + " ]";
    }
    
}
