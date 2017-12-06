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
@Table(name = "ERP_TipoLicencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ERPTipoLicencia.findAll", query = "SELECT e FROM ERPTipoLicencia e")})
public class ERPTipoLicencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Tli_Registro")
    private Integer tliRegistro;
    @Basic(optional = false)
    @Column(name = "Tli_Tipo")
    private String tliTipo;
    @Column(name = "Tli_Descripcion")
    private String tliDescripcion;
    @OneToMany(mappedBy = "priTipoLicencia")
    private List<ERPIdentificacion> eRPIdentificacionList;

    public ERPTipoLicencia() {
    }

    public ERPTipoLicencia(Integer tliRegistro) {
        this.tliRegistro = tliRegistro;
    }

    public ERPTipoLicencia(Integer tliRegistro, String tliTipo) {
        this.tliRegistro = tliRegistro;
        this.tliTipo = tliTipo;
    }

    public Integer getTliRegistro() {
        return tliRegistro;
    }

    public void setTliRegistro(Integer tliRegistro) {
        this.tliRegistro = tliRegistro;
    }

    public String getTliTipo() {
        return tliTipo;
    }

    public void setTliTipo(String tliTipo) {
        this.tliTipo = tliTipo;
    }

    public String getTliDescripcion() {
        return tliDescripcion;
    }

    public void setTliDescripcion(String tliDescripcion) {
        this.tliDescripcion = tliDescripcion;
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
        hash += (tliRegistro != null ? tliRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ERPTipoLicencia)) {
            return false;
        }
        ERPTipoLicencia other = (ERPTipoLicencia) object;
        if ((this.tliRegistro == null && other.tliRegistro != null) || (this.tliRegistro != null && !this.tliRegistro.equals(other.tliRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gt.gob.mspas.roosvelt.entity.ERPTipoLicencia[ tliRegistro=" + tliRegistro + " ]";
    }
    
}
