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
@Table(name = "ERP_Pais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ERPPais.findAll", query = "SELECT e FROM ERPPais e")})
public class ERPPais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Pai_Registro")
    private Integer paiRegistro;
    @Basic(optional = false)
    @Column(name = "Pai_Nombre")
    private String paiNombre;
    @Column(name = "Pai_Descripcion")
    private String paiDescripcion;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "depPais")
//    private List<ERPDepartamento> eRPDepartamentoList;

    public ERPPais() {
    }

    public ERPPais(Integer paiRegistro) {
        this.paiRegistro = paiRegistro;
    }

    public ERPPais(Integer paiRegistro, String paiNombre) {
        this.paiRegistro = paiRegistro;
        this.paiNombre = paiNombre;
    }

    public Integer getPaiRegistro() {
        return paiRegistro;
    }

    public void setPaiRegistro(Integer paiRegistro) {
        this.paiRegistro = paiRegistro;
    }

    public String getPaiNombre() {
        return paiNombre;
    }

    public void setPaiNombre(String paiNombre) {
        this.paiNombre = paiNombre;
    }

    public String getPaiDescripcion() {
        return paiDescripcion;
    }

    public void setPaiDescripcion(String paiDescripcion) {
        this.paiDescripcion = paiDescripcion;
    }

//    @XmlTransient
//    @JsonIgnore
//    public List<ERPDepartamento> getERPDepartamentoList() {
//        return eRPDepartamentoList;
//    }
//
//    public void setERPDepartamentoList(List<ERPDepartamento> eRPDepartamentoList) {
//        this.eRPDepartamentoList = eRPDepartamentoList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paiRegistro != null ? paiRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ERPPais)) {
            return false;
        }
        ERPPais other = (ERPPais) object;
        if ((this.paiRegistro == null && other.paiRegistro != null) || (this.paiRegistro != null && !this.paiRegistro.equals(other.paiRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gt.gob.mspas.roosvelt.entity.ERPPais[ paiRegistro=" + paiRegistro + " ]";
    }
    
}
