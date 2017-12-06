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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.Formula;

/**
 *
 * @author Ottoniel RT
 */
@Entity
@Table(name = "SAD_Paciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SADPaciente.findAll", query = "SELECT s FROM SADPaciente s")})
public class SADPaciente implements Serializable {

//    private static final long serialVersionUID = 1L;
//    @EmbeddedId
//    protected SADPacientePK sADPacientePK;
    @Id
    @Basic(optional = true)
    @Column(name = "Pac_NumHC")
    protected Integer sADPacientePK;

    @Basic(optional = false)
    @Column(name = "Pac_Estado")
    private int pacEstado;

    @JoinColumn(name = "Pac_persona", referencedColumnName = "Per_Persona")
    @ManyToOne(optional = false)
    private ERPPersona pacPersona;

    @Basic(optional = false)
    @Column(name = "Pac_PerFecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pacPerFecha;
    @Column(name = "Pac_FechaDefuncion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pacFechaDefuncion;
    @Column(name = "Pac_DireccionTemp")
    private String pacDireccionTemp;
    @Basic(optional = false)
    @Column(name = "Pac_TotalIngreso")
    private long pacTotalIngreso;
    @Column(name = "Pac_NumHCAntiguo")
    private Long pacNumHCAntiguo;
    @Basic(optional = false)
    @Column(name = "Pac_FechaDocum")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pacFechaDocum;
    @Basic(optional = false)
    @Column(name = "Pac_Conexion")
    private long pacConexion;
    @Column(name = "Pac_Usuario")
    private String pacUsuario;
    @Column(name = "Pac_Observaciones")
    private String pacObservaciones;
    @Column(name = "Pac_AnnioConexion")
    private Long pacAnnioConexion;
    @Column(name = "Pac_UsuarioAutorizo")
    private String pacUsuarioAutorizo;
    @Column(name = "Pac_UsuarioMotivo")
    private String pacUsuarioMotivo;

    @Formula(value = "Pac_NumHCAntiguo")
    private String expedienteConcatenado;

    public SADPaciente() {
    }

//    public SADPaciente(SADPacientePK sADPacientePK) {
//        this.sADPacientePK = sADPacientePK;
//    }
//
//    public SADPaciente(SADPacientePK sADPacientePK, int pacEstado, long pacPersona, Date pacPerFecha, long pacTotalIngreso, Date pacFechaDocum, long pacConexion) {
//        this.sADPacientePK = sADPacientePK;
//        this.pacEstado = pacEstado;
//        //this.pacPersona = pacPersona;
//        this.pacPerFecha = pacPerFecha;
//        this.pacTotalIngreso = pacTotalIngreso;
//        this.pacFechaDocum = pacFechaDocum;
//        this.pacConexion = pacConexion;
//    }
//
//    public SADPaciente(long pacNumHC, Date pacFecha) {
//        this.sADPacientePK = new SADPacientePK(pacNumHC, pacFecha);
//    }
//
//    public SADPacientePK getSADPacientePK() {
//        return sADPacientePK;
//    }
//
//    public void setSADPacientePK(SADPacientePK sADPacientePK) {
//        this.sADPacientePK = sADPacientePK;
//    }

    public Integer getsADPacientePK() {
        return sADPacientePK;
    }

    public void setsADPacientePK(Integer sADPacientePK) {
        this.sADPacientePK = sADPacientePK;
    }
    
    

    public int getPacEstado() {
        return pacEstado;
    }

    public void setPacEstado(int pacEstado) {
        this.pacEstado = pacEstado;
    }

    public Date getPacPerFecha() {
        return pacPerFecha;
    }

    public void setPacPerFecha(Date pacPerFecha) {
        this.pacPerFecha = pacPerFecha;
    }

    public Date getPacFechaDefuncion() {
        return pacFechaDefuncion;
    }

    public void setPacFechaDefuncion(Date pacFechaDefuncion) {
        this.pacFechaDefuncion = pacFechaDefuncion;
    }

    public String getPacDireccionTemp() {
        return pacDireccionTemp;
    }

    public void setPacDireccionTemp(String pacDireccionTemp) {
        this.pacDireccionTemp = pacDireccionTemp;
    }

    public long getPacTotalIngreso() {
        return pacTotalIngreso;
    }

    public void setPacTotalIngreso(long pacTotalIngreso) {
        this.pacTotalIngreso = pacTotalIngreso;
    }

    public Long getPacNumHCAntiguo() {
        return pacNumHCAntiguo;
    }

    public void setPacNumHCAntiguo(Long pacNumHCAntiguo) {
        this.pacNumHCAntiguo = pacNumHCAntiguo;
    }

    public Date getPacFechaDocum() {
        return pacFechaDocum;
    }

    public void setPacFechaDocum(Date pacFechaDocum) {
        this.pacFechaDocum = pacFechaDocum;
    }

    public long getPacConexion() {
        return pacConexion;
    }

    public void setPacConexion(long pacConexion) {
        this.pacConexion = pacConexion;
    }

    public String getPacUsuario() {
        return pacUsuario;
    }

    public void setPacUsuario(String pacUsuario) {
        this.pacUsuario = pacUsuario;
    }

    public String getPacObservaciones() {
        return pacObservaciones;
    }

    public void setPacObservaciones(String pacObservaciones) {
        this.pacObservaciones = pacObservaciones;
    }

    public Long getPacAnnioConexion() {
        return pacAnnioConexion;
    }

    public void setPacAnnioConexion(Long pacAnnioConexion) {
        this.pacAnnioConexion = pacAnnioConexion;
    }

    public String getPacUsuarioAutorizo() {
        return pacUsuarioAutorizo;
    }

    public void setPacUsuarioAutorizo(String pacUsuarioAutorizo) {
        this.pacUsuarioAutorizo = pacUsuarioAutorizo;
    }

    public String getPacUsuarioMotivo() {
        return pacUsuarioMotivo;
    }

    public void setPacUsuarioMotivo(String pacUsuarioMotivo) {
        this.pacUsuarioMotivo = pacUsuarioMotivo;
    }

    public ERPPersona getPacPersona() {
        return pacPersona;
    }

    public void setPacPersona(ERPPersona pacPersona) {
        this.pacPersona = pacPersona;
    }

    public String getExpedienteConcatenado() {
        return expedienteConcatenado;
    }

    public void setExpedienteConcatenado(String expedienteConcatenado) {
        this.expedienteConcatenado = expedienteConcatenado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sADPacientePK != null ? sADPacientePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SADPaciente)) {
            return false;
        }
        SADPaciente other = (SADPaciente) object;
        if ((this.sADPacientePK == null && other.sADPacientePK != null) || (this.sADPacientePK != null && !this.sADPacientePK.equals(other.sADPacientePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gt.gob.mspas.roosvelt.entity.SADPaciente[ sADPacientePK=" + sADPacientePK + " ]";
    }

}
