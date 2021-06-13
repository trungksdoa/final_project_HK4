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
@Table(name = "tainguyen_chohanghoa", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TainguyenChohanghoa.findAll", query = "SELECT t FROM TainguyenChohanghoa t"),
    @NamedQuery(name = "TainguyenChohanghoa.findByMa", query = "SELECT t FROM TainguyenChohanghoa t WHERE t.ma = :ma"),
    @NamedQuery(name = "TainguyenChohanghoa.findByTen", query = "SELECT t FROM TainguyenChohanghoa t WHERE t.ten = :ten"),
    @NamedQuery(name = "TainguyenChohanghoa.findByGia", query = "SELECT t FROM TainguyenChohanghoa t WHERE t.gia = :gia"),
    @NamedQuery(name = "TainguyenChohanghoa.findBySoluong", query = "SELECT t FROM TainguyenChohanghoa t WHERE t.soluong = :soluong"),
    @NamedQuery(name = "TainguyenChohanghoa.findByThanhgia", query = "SELECT t FROM TainguyenChohanghoa t WHERE t.thanhgia = :thanhgia")})
public class TainguyenChohanghoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma", nullable = false, length = 50)
    private String ma;
    @Column(name = "ten", length = 50)
    private String ten;
    @Column(name = "gia")
    private Integer gia;
    @Column(name = "soluong")
    private Integer soluong;
    @Column(name = "thanhgia")
    private Integer thanhgia;
    @JoinColumn(name = "mahanghoa", referencedColumnName = "ma")
    @ManyToOne
    private Dichvuhanghoa mahanghoa;

    public TainguyenChohanghoa() {
    }

    public TainguyenChohanghoa(String ma) {
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

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public Integer getThanhgia() {
        return thanhgia;
    }

    public void setThanhgia(Integer thanhgia) {
        this.thanhgia = thanhgia;
    }

    public Dichvuhanghoa getMahanghoa() {
        return mahanghoa;
    }

    public void setMahanghoa(Dichvuhanghoa mahanghoa) {
        this.mahanghoa = mahanghoa;
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
        if (!(object instanceof TainguyenChohanghoa)) {
            return false;
        }
        TainguyenChohanghoa other = (TainguyenChohanghoa) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fpt.aptech.project.Client.Models.TainguyenChohanghoa[ ma=" + ma + " ]";
    }
    
}
