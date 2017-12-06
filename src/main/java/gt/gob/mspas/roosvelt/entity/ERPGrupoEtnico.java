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
@Table(name = "ERP_GrupoEtnico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ERPGrupoEtnico.findAll", query = "SELECT e FROM ERPGrupoEtnico e")})
public class ERPGrupoEtnico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Get_Registro")
    private Integer getRegistro;
    @Basic(optional = false)
    @Column(name = "Get_Nombre")
    private String getNombre;
    @Column(name = "Get_Descripcion")
    private String getDescripcion;

    public ERPGrupoEtnico() {
    }

    public ERPGrupoEtnico(Integer getRegistro) {
        this.getRegistro = getRegistro;
    }

    public ERPGrupoEtnico(Integer getRegistro, String getNombre) {
        this.getRegistro = getRegistro;
        this.getNombre = getNombre;
    }

    public Integer getGetRegistro() {
        return getRegistro;
    }

    public void setGetRegistro(Integer getRegistro) {
        this.getRegistro = getRegistro;
    }

    public String getGetNombre() {
        return getNombre;
    }

    public void setGetNombre(String getNombre) {
        this.getNombre = getNombre;
    }

    public String getGetDescripcion() {
        return getDescripcion;
    }

    public void setGetDescripcion(String getDescripcion) {
        this.getDescripcion = getDescripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getRegistro != null ? getRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ERPGrupoEtnico)) {
            return false;
        }
        ERPGrupoEtnico other = (ERPGrupoEtnico) object;
        if ((this.getRegistro == null && other.getRegistro != null) || (this.getRegistro != null && !this.getRegistro.equals(other.getRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gt.gob.mspas.roosvelt.entity.ERPGrupoEtnico[ getRegistro=" + getRegistro + " ]";
    }
    
}
