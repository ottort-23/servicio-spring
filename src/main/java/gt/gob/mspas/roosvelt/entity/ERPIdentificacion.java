/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.gob.mspas.roosvelt.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ottoniel RT
 */
@Entity
@Table(name = "ERP_Identificacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ERPIdentificacion.findAll", query = "SELECT e FROM ERPIdentificacion e")})
public class ERPIdentificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ERPIdentificacionPK eRPIdentificacionPK;
    @Column(name = "Pri_NumDatoAuxiliar")
    private String priNumDatoAuxiliar;
    @Column(name = "Pri_Conexion")
    private Long priConexion;
    @Column(name = "Pri_Usuario")
    private String priUsuario;
    @Column(name = "Pri_FechaSistema")
    @Temporal(TemporalType.TIMESTAMP)
    private Date priFechaSistema;

    @Column(name = "Pri_Persona")
    private Integer priPersona;
//    @JoinColumn(name = "Pri_TipoIdentificacion", referencedColumnName = "Ti_Registro", insertable = false, updatable = false)
//    @ManyToOne(optional = false)
//    private ERPTipoIdentificacion eRPTipoIdentificacion;

    public ERPIdentificacion() {
    }

    public ERPIdentificacion(ERPIdentificacionPK eRPIdentificacionPK) {
        this.eRPIdentificacionPK = eRPIdentificacionPK;
    }

    public ERPIdentificacion(long priregistro, int priTipoIdentificacion) {
        this.eRPIdentificacionPK = new ERPIdentificacionPK(priregistro, priTipoIdentificacion);
    }

    public ERPIdentificacionPK getERPIdentificacionPK() {
        return eRPIdentificacionPK;
    }

    public void setERPIdentificacionPK(ERPIdentificacionPK eRPIdentificacionPK) {
        this.eRPIdentificacionPK = eRPIdentificacionPK;
    }

    public String getPriNumDatoAuxiliar() {
        return priNumDatoAuxiliar;
    }

    public void setPriNumDatoAuxiliar(String priNumDatoAuxiliar) {
        this.priNumDatoAuxiliar = priNumDatoAuxiliar;
    }

    public Integer getPriPersona() {
        return priPersona;
    }

    public void setPriPersona(Integer priPersona) {
        this.priPersona = priPersona;
    }
    

    public Long getPriConexion() {
        return priConexion;
    }

    public void setPriConexion(Long priConexion) {
        this.priConexion = priConexion;
    }

    public String getPriUsuario() {
        return priUsuario;
    }

    public void setPriUsuario(String priUsuario) {
        this.priUsuario = priUsuario;
    }

    public Date getPriFechaSistema() {
        return priFechaSistema;
    }

    public void setPriFechaSistema(Date priFechaSistema) {
        this.priFechaSistema = priFechaSistema;
    }

//    public ERPTipoIdentificacion getERPTipoIdentificacion() {
//        return eRPTipoIdentificacion;
//    }
//
//    public void setERPTipoIdentificacion(ERPTipoIdentificacion eRPTipoIdentificacion) {
//        this.eRPTipoIdentificacion = eRPTipoIdentificacion;
//    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eRPIdentificacionPK != null ? eRPIdentificacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ERPIdentificacion)) {
            return false;
        }
        ERPIdentificacion other = (ERPIdentificacion) object;
        if ((this.eRPIdentificacionPK == null && other.eRPIdentificacionPK != null) || (this.eRPIdentificacionPK != null && !this.eRPIdentificacionPK.equals(other.eRPIdentificacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gt.gob.mspas.roosvelt.entity.ERPIdentificacion[ eRPIdentificacionPK=" + eRPIdentificacionPK + " ]";
    }

}
