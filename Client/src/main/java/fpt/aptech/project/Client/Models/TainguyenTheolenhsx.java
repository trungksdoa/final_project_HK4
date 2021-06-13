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
 * @author PC
 */
@Entity
@Table(name = "tainguyen_theolenhsx", catalog = "final_project", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TainguyenTheolenhsx.findAll", query = "SELECT t FROM TainguyenTheolenhsx t"),
    @NamedQuery(name = "TainguyenTheolenhsx.findByMa", query = "SELECT t FROM TainguyenTheolenhsx t WHERE t.ma = :ma"),
    @NamedQuery(name = "TainguyenTheolenhsx.findByTen", query = "SELECT t FROM TainguyenTheolenhsx t WHERE t.ten = :ten"),
    @NamedQuery(name = "TainguyenTheolenhsx.findByDonvitinh", query = "SELECT t FROM TainguyenTheolenhsx t WHERE t.donvitinh = :donvitinh"),
    @NamedQuery(name = "TainguyenTheolenhsx.findBySoluongTren1tp", query = "SELECT t FROM TainguyenTheolenhsx t WHERE t.soluongTren1tp = :soluongTren1tp"),
    @NamedQuery(name = "TainguyenTheolenhsx.findBySoluong", query = "SELECT t FROM TainguyenTheolenhsx t WHERE t.soluong = :soluong"),
    @NamedQuery(name = "TainguyenTheolenhsx.findByGia", query = "SELECT t FROM TainguyenTheolenhsx t WHERE t.gia = :gia")})
public class TainguyenTheolenhsx implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ma", nullable = false, length = 50)
    private String ma;
    @Column(name = "ten", length = 50)
    private String ten;
    @Column(name = "donvitinh", length = 50)
    private String donvitinh;
    @Column(name = "soluong_tren1tp")
    private Integer soluongTren1tp;
    @Column(name = "soluong")
    private Integer soluong;
    @Column(name = "gia")
    private Integer gia;
    @JoinColumn(name = "malenhsanxuat", referencedColumnName = "ma")
    @ManyToOne
    private NoidungThanhphamLenhsx malenhsanxuat;

    public TainguyenTheolenhsx() {
    }

    public TainguyenTheolenhsx(String ma) {
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

    public String getDonvitinh() {
        return donvitinh;
    }

    public void setDonvitinh(String donvitinh) {
        this.donvitinh = donvitinh;
    }

    public Integer getSoluongTren1tp() {
        return soluongTren1tp;
    }

    public void setSoluongTren1tp(Integer soluongTren1tp) {
        this.soluongTren1tp = soluongTren1tp;
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

    public NoidungThanhphamLenhsx getMalenhsanxuat() {
        return malenhsanxuat;
    }

    public void setMalenhsanxuat(NoidungThanhphamLenhsx malenhsanxuat) {
        this.malenhsanxuat = malenhsanxuat;
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
        if (!(object instanceof TainguyenTheolenhsx)) {
            return false;
        }
        TainguyenTheolenhsx other = (TainguyenTheolenhsx) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fpt.aptech.project.Client.Models.TainguyenTheolenhsx[ ma=" + ma + " ]";
    }
    
}
