/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.gob.mspas.roosvelt.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Ottoniel RT
 */
@Embeddable
public class ERPIdentificacionPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Pri_registro")
    private long priregistro;
    @Basic(optional = false)
    @Column(name = "Pri_TipoIdentificacion")
    private int priTipoIdentificacion;

    public ERPIdentificacionPK() {
    }

    public ERPIdentificacionPK(long priregistro, int priTipoIdentificacion) {
        this.priregistro = priregistro;
        this.priTipoIdentificacion = priTipoIdentificacion;
    }

    public long getPriregistro() {
        return priregistro;
    }

    public void setPriregistro(long priregistro) {
        this.priregistro = priregistro;
    }

    public int getPriTipoIdentificacion() {
        return priTipoIdentificacion;
    }

    public void setPriTipoIdentificacion(int priTipoIdentificacion) {
        this.priTipoIdentificacion = priTipoIdentificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) priregistro;
        hash += (int) priTipoIdentificacion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ERPIdentificacionPK)) {
            return false;
        }
        ERPIdentificacionPK other = (ERPIdentificacionPK) object;
        if (this.priregistro != other.priregistro) {
            return false;
        }
        if (this.priTipoIdentificacion != other.priTipoIdentificacion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gt.gob.mspas.roosvelt.entity.ERPIdentificacionPK[ priregistro=" + priregistro + ", priTipoIdentificacion=" + priTipoIdentificacion + " ]";
    }
    
}
