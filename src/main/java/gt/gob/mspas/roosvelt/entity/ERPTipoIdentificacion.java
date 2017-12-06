/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.gob.mspas.roosvelt.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "ERP_TipoIdentificacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ERPTipoIdentificacion.findAll", query = "SELECT e FROM ERPTipoIdentificacion e")})
public class ERPTipoIdentificacion implements Serializable {


    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Ti_Registro")
    private Integer tiRegistro;
    @Basic(optional = false)
    @Column(name = "Ti_Nombre")
    private String tiNombre;
    @Column(name = "Ti_Descripcion")
    private String tiDescripcion;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eRPTipoIdentificacion")
//    private List<ERPIdentificacion> eRPIdentificacionList;

    public ERPTipoIdentificacion() {
    }

    public ERPTipoIdentificacion(Integer tiRegistro) {
        this.tiRegistro = tiRegistro;
    }

    public ERPTipoIdentificacion(Integer tiRegistro, String tiNombre) {
        this.tiRegistro = tiRegistro;
        this.tiNombre = tiNombre;
    }

    public Integer getTiRegistro() {
        return tiRegistro;
    }

    public void setTiRegistro(Integer tiRegistro) {
        this.tiRegistro = tiRegistro;
    }

    public String getTiNombre() {
        return tiNombre;
    }

    public void setTiNombre(String tiNombre) {
        this.tiNombre = tiNombre;
    }

    public String getTiDescripcion() {
        return tiDescripcion;
    }

    public void setTiDescripcion(String tiDescripcion) {
        this.tiDescripcion = tiDescripcion;
    }

//    @XmlTransient
//    @JsonIgnore
//    public List<ERPIdentificacion> getERPIdentificacionList() {
//        return eRPIdentificacionList;
//    }
//
//    public void setERPIdentificacionList(List<ERPIdentificacion> eRPIdentificacionList) {
//        this.eRPIdentificacionList = eRPIdentificacionList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tiRegistro != null ? tiRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ERPTipoIdentificacion)) {
            return false;
        }
        ERPTipoIdentificacion other = (ERPTipoIdentificacion) object;
        if ((this.tiRegistro == null && other.tiRegistro != null) || (this.tiRegistro != null && !this.tiRegistro.equals(other.tiRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gt.gob.mspas.roosvelt.entity.ERPTipoIdentificacion[ tiRegistro=" + tiRegistro + " ]";
    }


    
}
