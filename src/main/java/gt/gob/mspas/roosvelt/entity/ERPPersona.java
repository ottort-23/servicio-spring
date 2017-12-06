/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.gob.mspas.roosvelt.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.Formula;

/**
 *
 * @author Ottoniel RT
 */
@Entity
@Table(name = "ERP_Persona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ERPPersona.findAll", query = "SELECT e FROM ERPPersona e")})
public class ERPPersona implements Serializable {

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eRPPersona")
//    private List<ERPIdentificacion> eRPIdentificacionList;
    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "Per_Persona")
    private Integer perPersona;

    @Basic(optional = false)
    @Column(name = "Per_Estado")
    private int perEstado;
    @Basic(optional = false)
    @Column(name = "Per_PrimerNombre")
    private String perPrimerNombre;
    @Column(name = "Per_SegundoNombre")
    private String perSegundoNombre;
    @Column(name = "Per_TercerNombre")
    private String perTercerNombre;
    @Basic(optional = false)
    @Column(name = "Per_PrimerApellido")
    private String perPrimerApellido;
    @Column(name = "Per_SegundoApellido")
    private String perSegundoApellido;
    @Column(name = "Per_ApellidoCasada")
    private String perApellidoCasada;
    @Column(name = "Per_FechaNacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date perFechaNacimiento;
    @Column(name = "Per_GrupoSanguineo")
    private Integer perGrupoSanguineo;
    @Column(name = "Per_Rh")
    private Character perRh;
    @Column(name = "Per_Du")
    private Character perDu;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Per_Peso")
    private BigDecimal perPeso;

    @JoinColumn(name = "Per_EstadoCivil", referencedColumnName = "EC_Registro")
    @ManyToOne(optional = true)
    private ERPEstadoCivil perEstadoCivil;

    @JoinColumn(name = "Per_Genero", referencedColumnName = "Sx_Codigo")
    @ManyToOne(optional = false)
    private SARRHHSexo perGenero;

    @Column(name = "Per_Domicilio")
    private String perDomicilio;

    @JoinColumn(name = "Per_Lugar", referencedColumnName = "Mun_Registro")
    @ManyToOne(optional = true)
    private ERPMunicipio perLugar;

    @Column(name = "Per_TelefonoCasa")
    private String perTelefonoCasa;
    @Column(name = "Per_TelefonoCelular")
    private String perTelefonoCelular;
    @Column(name = "Per_DireccionTrabajo")
    private String perDireccionTrabajo;
    @Column(name = "Per_TelefonoTrabajo")
    private String perTelefonoTrabajo;
    @Column(name = "Per_Email")
    private String perEmail;

    @Column(name = "Per_Profesion")
    private String perProfesion;

    @Column(name = "Per_Religion")
    private Integer perReligion;

    @JoinColumn(name = "Per_GrupoEtnico", referencedColumnName = "Get_Registro")
    @ManyToOne(optional = true)
    private ERPGrupoEtnico perGrupoEtnico;

    @Column(name = "Per_Nacionalidad")
    private Integer perNacionalidad;
    @Column(name = "Per_Procedencia")
    private String perProcedencia;
    @Column(name = "Per_AfiliacionIggs")
    private String perAfiliacionIggs;
    @Column(name = "Per_Conexion")
    private Long perConexion;
    @Column(name = "Per_Usuario")
    private String perUsuario;
    @Column(name = "Per_AnnioConexion")
    private Long perAnnioConexion;
    @Column(name = "Per_UsuarioAutorizo")
    private String perUsuarioAutorizo;
    @Column(name = "Per_UsuarioMotivo")
    private String perUsuarioMotivo;
    @Column(name = "Per_FechaSistema")
    @Temporal(TemporalType.TIMESTAMP)
    private Date perFechaSistema;

    @Formula(value = "Per_PrimerNombre + ' ' + CASE WHEN Per_SegundoNombre is null THEN '' ELSE Per_SegundoNombre END "
            + "+ ' ' +  Per_PrimerApellido + ' ' + CASE WHEN Per_SegundoApellido is null THEN '' ELSE Per_SegundoApellido END")
    private String personaConcatenado;

//    @Formula("(SELECT  d FROM ERPPersona d JOIN ERPIdentificacion ide ON d.perPersona = ide.priPersona)")
//    private List<ERPPersona> eRPIdentificacionList;

    public ERPPersona() {
    }

    public ERPPersona(ERPPersonaPK eRPPersonaPK, int perEstado, String perPrimerNombre, String perPrimerApellido) {
        //this.eRPPersonaPK = eRPPersonaPK;
        this.perEstado = perEstado;
        this.perPrimerNombre = perPrimerNombre;
        this.perPrimerApellido = perPrimerApellido;
    }

//    public List<ERPPersona> geteRPIdentificacionList() {
//        return eRPIdentificacionList;
//    }
//
//    public void seteRPIdentificacionList(List<ERPPersona> eRPIdentificacionList) {
//        this.eRPIdentificacionList = eRPIdentificacionList;
//    }

    public int getPerEstado() {
        return perEstado;
    }

    public void setPerEstado(int perEstado) {
        this.perEstado = perEstado;
    }

    public String getPerPrimerNombre() {
        return perPrimerNombre;
    }

    public void setPerPrimerNombre(String perPrimerNombre) {
        this.perPrimerNombre = perPrimerNombre;
    }

    public String getPerSegundoNombre() {
        return perSegundoNombre;
    }

    public void setPerSegundoNombre(String perSegundoNombre) {
        this.perSegundoNombre = perSegundoNombre;
    }

    public String getPerTercerNombre() {
        return perTercerNombre;
    }

    public void setPerTercerNombre(String perTercerNombre) {
        this.perTercerNombre = perTercerNombre;
    }

    public String getPerPrimerApellido() {
        return perPrimerApellido;
    }

    public void setPerPrimerApellido(String perPrimerApellido) {
        this.perPrimerApellido = perPrimerApellido;
    }

    public String getPerSegundoApellido() {
        return perSegundoApellido;
    }

    public void setPerSegundoApellido(String perSegundoApellido) {
        this.perSegundoApellido = perSegundoApellido;
    }

    public String getPerApellidoCasada() {
        return perApellidoCasada;
    }

    public void setPerApellidoCasada(String perApellidoCasada) {
        this.perApellidoCasada = perApellidoCasada;
    }

    public Date getPerFechaNacimiento() {
        return perFechaNacimiento;
    }

    public void setPerFechaNacimiento(Date perFechaNacimiento) {
        this.perFechaNacimiento = perFechaNacimiento;
    }

    public Integer getPerGrupoSanguineo() {
        return perGrupoSanguineo;
    }

    public void setPerGrupoSanguineo(Integer perGrupoSanguineo) {
        this.perGrupoSanguineo = perGrupoSanguineo;
    }

    public Character getPerRh() {
        return perRh;
    }

    public void setPerRh(Character perRh) {
        this.perRh = perRh;
    }

    public Character getPerDu() {
        return perDu;
    }

    public void setPerDu(Character perDu) {
        this.perDu = perDu;
    }

    public BigDecimal getPerPeso() {
        return perPeso;
    }

    public void setPerPeso(BigDecimal perPeso) {
        this.perPeso = perPeso;
    }

    public ERPEstadoCivil getPerEstadoCivil() {
        return perEstadoCivil;
    }

    public void setPerEstadoCivil(ERPEstadoCivil perEstadoCivil) {
        this.perEstadoCivil = perEstadoCivil;
    }

    public SARRHHSexo getPerGenero() {
        return perGenero;
    }

    public void setPerGenero(SARRHHSexo perGenero) {
        this.perGenero = perGenero;
    }

    public String getPerDomicilio() {
        return perDomicilio;
    }

    public void setPerDomicilio(String perDomicilio) {
        this.perDomicilio = perDomicilio;
    }

    public ERPMunicipio getPerLugar() {
        return perLugar;
    }

    public void setPerLugar(ERPMunicipio perLugar) {
        this.perLugar = perLugar;
    }

    public String getPerTelefonoCasa() {
        return perTelefonoCasa;
    }

    public void setPerTelefonoCasa(String perTelefonoCasa) {
        this.perTelefonoCasa = perTelefonoCasa;
    }

    public String getPerTelefonoCelular() {
        return perTelefonoCelular;
    }

    public void setPerTelefonoCelular(String perTelefonoCelular) {
        this.perTelefonoCelular = perTelefonoCelular;
    }

    public String getPerDireccionTrabajo() {
        return perDireccionTrabajo;
    }

    public void setPerDireccionTrabajo(String perDireccionTrabajo) {
        this.perDireccionTrabajo = perDireccionTrabajo;
    }

    public String getPerTelefonoTrabajo() {
        return perTelefonoTrabajo;
    }

    public void setPerTelefonoTrabajo(String perTelefonoTrabajo) {
        this.perTelefonoTrabajo = perTelefonoTrabajo;
    }

    public String getPerEmail() {
        return perEmail;
    }

    public void setPerEmail(String perEmail) {
        this.perEmail = perEmail;
    }

    public String getPerProfesion() {
        return perProfesion;
    }

    public void setPerProfesion(String perProfesion) {
        this.perProfesion = perProfesion;
    }

    public Integer getPerReligion() {
        return perReligion;
    }

    public void setPerReligion(Integer perReligion) {
        this.perReligion = perReligion;
    }

    public ERPGrupoEtnico getPerGrupoEtnico() {
        return perGrupoEtnico;
    }

    public void setPerGrupoEtnico(ERPGrupoEtnico perGrupoEtnico) {
        this.perGrupoEtnico = perGrupoEtnico;
    }

    public Integer getPerNacionalidad() {
        return perNacionalidad;
    }

    public void setPerNacionalidad(Integer perNacionalidad) {
        this.perNacionalidad = perNacionalidad;
    }

    public String getPerProcedencia() {
        return perProcedencia;
    }

    public void setPerProcedencia(String perProcedencia) {
        this.perProcedencia = perProcedencia;
    }

    public String getPerAfiliacionIggs() {
        return perAfiliacionIggs;
    }

    public void setPerAfiliacionIggs(String perAfiliacionIggs) {
        this.perAfiliacionIggs = perAfiliacionIggs;
    }

    public Long getPerConexion() {
        return perConexion;
    }

    public void setPerConexion(Long perConexion) {
        this.perConexion = perConexion;
    }

    public String getPerUsuario() {
        return perUsuario;
    }

    public void setPerUsuario(String perUsuario) {
        this.perUsuario = perUsuario;
    }

    public Long getPerAnnioConexion() {
        return perAnnioConexion;
    }

    public void setPerAnnioConexion(Long perAnnioConexion) {
        this.perAnnioConexion = perAnnioConexion;
    }

    public String getPerUsuarioAutorizo() {
        return perUsuarioAutorizo;
    }

    public void setPerUsuarioAutorizo(String perUsuarioAutorizo) {
        this.perUsuarioAutorizo = perUsuarioAutorizo;
    }

    public String getPerUsuarioMotivo() {
        return perUsuarioMotivo;
    }

    public void setPerUsuarioMotivo(String perUsuarioMotivo) {
        this.perUsuarioMotivo = perUsuarioMotivo;
    }

    public Date getPerFechaSistema() {
        return perFechaSistema;
    }

    public void setPerFechaSistema(Date perFechaSistema) {
        this.perFechaSistema = perFechaSistema;
    }

    public Integer getPerPersona() {
        return perPersona;
    }

    public void setPerPersona(Integer perPersona) {
        this.perPersona = perPersona;
    }

    public String getPersonaConcatenado() {
        return personaConcatenado;
    }

    public void setPersonaConcatenado(String personaConcatenado) {
        this.personaConcatenado = personaConcatenado;
    }

    @Override
    public String toString() {
        return "gt.gob.mspas.roosvelt.entity.ERPPersona[ eRPPersonaPK=" + perPersona + " ]";
    }

//    @XmlTransient
//    @JsonIgnore
//    public List<ERPIdentificacion> getERPIdentificacionList() {
//        return eRPIdentificacionList;
//    }
//
//    public void setERPIdentificacionList(List<ERPIdentificacion> eRPIdentificacionList) {
//        this.eRPIdentificacionList = eRPIdentificacionList;
//    }
}
