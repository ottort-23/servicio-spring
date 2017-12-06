/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.gob.mspas.roosvelt.entity;

import java.io.Serializable;
import java.util.List;
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
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author Ottoniel RT
 */
@Entity
@Table(name = "ERP_NumeroCedula")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ERPNumeroCedula.findAll", query = "SELECT e FROM ERPNumeroCedula e")})
public class ERPNumeroCedula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Nce_Registro")
    private Long nceRegistro;
    @Basic(optional = false)
    @Column(name = "Nce_Numero")
    private String nceNumero;
    @Column(name = "Nce_Descripcion")
    private String nceDescripcion;
    @OneToMany(mappedBy = "priNumRegistro")
    private List<ERPIdentificacion> eRPIdentificacionList;

    public ERPNumeroCedula() {
    }

    public ERPNumeroCedula(Long nceRegistro) {
        this.nceRegistro = nceRegistro;
    }

    public ERPNumeroCedula(Long nceRegistro, String nceNumero) {
        this.nceRegistro = nceRegistro;
        this.nceNumero = nceNumero;
    }

    public Long getNceRegistro() {
        return nceRegistro;
    }

    public void setNceRegistro(Long nceRegistro) {
        this.nceRegistro = nceRegistro;
    }

    public String getNceNumero() {
        return nceNumero;
    }

    public void setNceNumero(String nceNumero) {
        this.nceNumero = nceNumero;
    }

    public String getNceDescripcion() {
        return nceDescripcion;
    }

    public void setNceDescripcion(String nceDescripcion) {
        this.nceDescripcion = nceDescripcion;
    }

    @XmlTransient
    @JsonIgnore
    public List<ERPIdentificacion> getERPIdentificacionList() {
        return eRPIdentificacionList;
    }

    public void setERPIdentificacionList(List<ERPIdentificacion> eRPIdentificacionList) {
        this.eRPIdentificacionList = eRPIdentificacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nceRegistro != null ? nceRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ERPNumeroCedula)) {
            return false;
        }
        ERPNumeroCedula other = (ERPNumeroCedula) object;
        if ((this.nceRegistro == null && other.nceRegistro != null) || (this.nceRegistro != null && !this.nceRegistro.equals(other.nceRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gt.gob.mspas.roosvelt.entity.ERPNumeroCedula[ nceRegistro=" + nceRegistro + " ]";
    }
    
}
