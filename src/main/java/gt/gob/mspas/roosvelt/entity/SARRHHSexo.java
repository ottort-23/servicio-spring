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
@Table(name = "SARRHH_Sexo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SARRHHSexo.findAll", query = "SELECT s FROM SARRHHSexo s")})
public class SARRHHSexo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Sx_Codigo")
    private Integer sxCodigo;
    @Column(name = "Sx_Descripcion")
    private String sxDescripcion;

    public SARRHHSexo() {
    }

    public SARRHHSexo(Integer sxCodigo) {
        this.sxCodigo = sxCodigo;
    }

    public Integer getSxCodigo() {
        return sxCodigo;
    }

    public void setSxCodigo(Integer sxCodigo) {
        this.sxCodigo = sxCodigo;
    }

    public String getSxDescripcion() {
        return sxDescripcion;
    }

    public void setSxDescripcion(String sxDescripcion) {
        this.sxDescripcion = sxDescripcion;
    }

   
    @Override
    public String toString() {
        return "gt.gob.mspas.roosvelt.entity.SARRHHSexo[ sxCodigo=" + sxCodigo + " ]";
    }
    
}
