/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.gob.mspas.roosvelt.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Ottoniel RT
 */
@Embeddable
public class ERPPersonaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Per_Persona")
    private long perPersona;
    @Basic(optional = false)
    @Column(name = "Per_Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date perFecha;

    public ERPPersonaPK() {
    }

    public ERPPersonaPK(long perPersona, Date perFecha) {
        this.perPersona = perPersona;
        this.perFecha = perFecha;
    }

    public long getPerPersona() {
        return perPersona;
    }

    public void setPerPersona(long perPersona) {
        this.perPersona = perPersona;
    }

    public Date getPerFecha() {
        return perFecha;
    }

    public void setPerFecha(Date perFecha) {
        this.perFecha = perFecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) perPersona;
        hash += (perFecha != null ? perFecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ERPPersonaPK)) {
            return false;
        }
        ERPPersonaPK other = (ERPPersonaPK) object;
        if (this.perPersona != other.perPersona) {
            return false;
        }
        if ((this.perFecha == null && other.perFecha != null) || (this.perFecha != null && !this.perFecha.equals(other.perFecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gt.gob.mspas.roosvelt.entity.ERPPersonaPK[ perPersona=" + perPersona + ", perFecha=" + perFecha + " ]";
    }
    
}
