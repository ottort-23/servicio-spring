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
@Table(name = "ERP_Profesion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ERPProfesion.findAll", query = "SELECT e FROM ERPProfesion e")})
public class ERPProfesion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Pro_Registro")
    private Integer proRegistro;
    @Basic(optional = false)
    @Column(name = "Pro_Nombre")
    private String proNombre;
    @Column(name = "Pro_Descripcion")
    private String proDescripcion;

    public ERPProfesion() {
    }

    public ERPProfesion(Integer proRegistro) {
        this.proRegistro = proRegistro;
    }

    public ERPProfesion(Integer proRegistro, String proNombre) {
        this.proRegistro = proRegistro;
        this.proNombre = proNombre;
    }

    public Integer getProRegistro() {
        return proRegistro;
    }

    public void setProRegistro(Integer proRegistro) {
        this.proRegistro = proRegistro;
    }

    public String getProNombre() {
        return proNombre;
    }

    public void setProNombre(String proNombre) {
        this.proNombre = proNombre;
    }

    public String getProDescripcion() {
        return proDescripcion;
    }

    public void setProDescripcion(String proDescripcion) {
        this.proDescripcion = proDescripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proRegistro != null ? proRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ERPProfesion)) {
            return false;
        }
        ERPProfesion other = (ERPProfesion) object;
        if ((this.proRegistro == null && other.proRegistro != null) || (this.proRegistro != null && !this.proRegistro.equals(other.proRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gt.gob.mspas.roosvelt.entity.ERPProfesion[ proRegistro=" + proRegistro + " ]";
    }
    
}
