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
public class SADPacientePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Pac_NumHC")
    private long pacNumHC;
    @Basic(optional = false)
    @Column(name = "Pac_Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pacFecha;

    public SADPacientePK() {
    }

    public SADPacientePK(long pacNumHC, Date pacFecha) {
        this.pacNumHC = pacNumHC;
        this.pacFecha = pacFecha;
    }

    public long getPacNumHC() {
        return pacNumHC;
    }

    public void setPacNumHC(long pacNumHC) {
        this.pacNumHC = pacNumHC;
    }

    public Date getPacFecha() {
        return pacFecha;
    }

    public void setPacFecha(Date pacFecha) {
        this.pacFecha = pacFecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pacNumHC;
        hash += (pacFecha != null ? pacFecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SADPacientePK)) {
            return false;
        }
        SADPacientePK other = (SADPacientePK) object;
        if (this.pacNumHC != other.pacNumHC) {
            return false;
        }
        if ((this.pacFecha == null && other.pacFecha != null) || (this.pacFecha != null && !this.pacFecha.equals(other.pacFecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gt.gob.mspas.roosvelt.entity.SADPacientePK[ pacNumHC=" + pacNumHC + ", pacFecha=" + pacFecha + " ]";
    }
    
}
