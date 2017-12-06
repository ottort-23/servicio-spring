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
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ottoniel RT
 */
@Entity
@Table(name = "ERP_Municipio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ERPMunicipio.findAll", query = "SELECT e FROM ERPMunicipio e")})
public class ERPMunicipio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Mun_Registro")
    private Integer munRegistro;
    @Basic(optional = false)
    @Column(name = "Mun_Nombre")
    private String munNombre;
    @Column(name = "Mun_Descripcion")
    private String munDescripcion;
    @JoinColumn(name = "Mun_Departamento", referencedColumnName = "Dep_Registro")
    @ManyToOne(optional = true)
    private ERPDepartamento munDepartamento;

    public ERPMunicipio() {
    }

    public ERPMunicipio(Integer munRegistro) {
        this.munRegistro = munRegistro;
    }

    public ERPMunicipio(Integer munRegistro, String munNombre) {
        this.munRegistro = munRegistro;
        this.munNombre = munNombre;
    }

    public Integer getMunRegistro() {
        return munRegistro;
    }

    public void setMunRegistro(Integer munRegistro) {
        this.munRegistro = munRegistro;
    }

    public String getMunNombre() {
        return munNombre;
    }

    public void setMunNombre(String munNombre) {
        this.munNombre = munNombre;
    }

    public String getMunDescripcion() {
        return munDescripcion;
    }

    public void setMunDescripcion(String munDescripcion) {
        this.munDescripcion = munDescripcion;
    }

    public ERPDepartamento getMunDepartamento() {
        return munDepartamento;
    }

    public void setMunDepartamento(ERPDepartamento munDepartamento) {
        this.munDepartamento = munDepartamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (munRegistro != null ? munRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ERPMunicipio)) {
            return false;
        }
        ERPMunicipio other = (ERPMunicipio) object;
        if ((this.munRegistro == null && other.munRegistro != null) || (this.munRegistro != null && !this.munRegistro.equals(other.munRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gt.gob.mspas.roosvelt.entity.ERPMunicipio[ munRegistro=" + munRegistro + " ]";
    }
    
}
