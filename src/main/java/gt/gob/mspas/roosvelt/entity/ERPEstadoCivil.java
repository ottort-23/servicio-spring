/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.gob.mspas.roosvelt.entity;

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
 * @author Ottoniel RT
 */
@Entity
@Table(name = "ERP_EstadoCivil")
public class ERPEstadoCivil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EC_Registro")
    private Integer eCRegistro;
    @Basic(optional = false)
    @Column(name = "EC_Nombre")
    private String eCNombre;
    @Column(name = "EC_Descripcion")
    private String eCDescripcion;

    public ERPEstadoCivil() {
    }

    public ERPEstadoCivil(Integer eCRegistro) {
        this.eCRegistro = eCRegistro;
    }

    public ERPEstadoCivil(Integer eCRegistro, String eCNombre) {
        this.eCRegistro = eCRegistro;
        this.eCNombre = eCNombre;
    }

    public Integer getECRegistro() {
        return eCRegistro;
    }

    public void setECRegistro(Integer eCRegistro) {
        this.eCRegistro = eCRegistro;
    }

    public String getECNombre() {
        return eCNombre;
    }

    public void setECNombre(String eCNombre) {
        this.eCNombre = eCNombre;
    }

    public String getECDescripcion() {
        return eCDescripcion;
    }

    public void setECDescripcion(String eCDescripcion) {
        this.eCDescripcion = eCDescripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eCRegistro != null ? eCRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ERPEstadoCivil)) {
            return false;
        }
        ERPEstadoCivil other = (ERPEstadoCivil) object;
        if ((this.eCRegistro == null && other.eCRegistro != null) || (this.eCRegistro != null && !this.eCRegistro.equals(other.eCRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gt.gob.mspas.roosvelt.entity.ERPEstadoCivil[ eCRegistro=" + eCRegistro + " ]";
    }
    
}
