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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ERP_Departamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ERPDepartamento.findAll", query = "SELECT e FROM ERPDepartamento e")})
public class ERPDepartamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Dep_Registro")
    private Integer depRegistro;
    @Basic(optional = false)
    @Column(name = "Dep_Nombre")
    private String depNombre;
    @Column(name = "Dep_Descripcion")
    private String depDescripcion;
    
    public ERPDepartamento() {
    }

    public ERPDepartamento(Integer depRegistro) {
        this.depRegistro = depRegistro;
    }

    public ERPDepartamento(Integer depRegistro, String depNombre) {
        this.depRegistro = depRegistro;
        this.depNombre = depNombre;
    }

    public Integer getDepRegistro() {
        return depRegistro;
    }

    public void setDepRegistro(Integer depRegistro) {
        this.depRegistro = depRegistro;
    }

    public String getDepNombre() {
        return depNombre;
    }

    public void setDepNombre(String depNombre) {
        this.depNombre = depNombre;
    }

    public String getDepDescripcion() {
        return depDescripcion;
    }

    public void setDepDescripcion(String depDescripcion) {
        this.depDescripcion = depDescripcion;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (depRegistro != null ? depRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ERPDepartamento)) {
            return false;
        }
        ERPDepartamento other = (ERPDepartamento) object;
        if ((this.depRegistro == null && other.depRegistro != null) || (this.depRegistro != null && !this.depRegistro.equals(other.depRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gt.gob.mspas.roosvelt.entity.ERPDepartamento[ depRegistro=" + depRegistro + " ]";
    }
    
}
