/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.gob.mspas.roosvelt.entity;

/**
 *
 * @author Ottoniel RT
 */

import java.util.Date;


/**
 *
 * @author Ottoniel RT
 */

public class TtPersona {

  
    private Integer idPersona;

    private Integer cui;
  
    private String expediente;

    private String primerNombre;
  
    private String segundoNombre;

    private String primerApellido;

    private String segundoApellido;

    private String apellidoCasada;

    private Date fechaNacimiento;

    private Date fechaDefuncion;

    private boolean beneficiarioIgss;

    private String noAfiliacionIgss;

    private String telefono;

    private String direccion;

    private Date fechaCrea;

    private boolean estado;

    private short usuario;

    private Integer idDiscapacidad;
    

    private Integer idEscolaridad;
    

    private Integer idEstadoCivil;
    

    private Integer idEtnia;

    private Integer idGrupoEtnico;

    private Integer idMunicipio;
    

    private Integer idOrientacionSexual;

    private Integer idProfesion;

    private Integer idRedServicio;

    private Integer idSexo;
    
    private String personaConcatenada;

    
    

    
    public TtPersona() {
    }

    public String getPersonaConcatenada() {
        return personaConcatenada;
    }

    public void setPersonaConcatenada(String personaConcatenada) {
        this.personaConcatenada = personaConcatenada;
    }



    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Integer getCui() {
        return cui;
    }

    public void setCui(Integer cui) {
        this.cui = cui;
    }

    

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getApellidoCasada() {
        return apellidoCasada;
    }

    public void setApellidoCasada(String apellidoCasada) {
        this.apellidoCasada = apellidoCasada;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaDefuncion() {
        return fechaDefuncion;
    }

    public void setFechaDefuncion(Date fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }

    public boolean getBeneficiarioIgss() {
        return beneficiarioIgss;
    }

    public void setBeneficiarioIgss(boolean beneficiarioIgss) {
        this.beneficiarioIgss = beneficiarioIgss;
    }

    public String getNoAfiliacionIgss() {
        return noAfiliacionIgss;
    }

    public void setNoAfiliacionIgss(String noAfiliacionIgss) {
        this.noAfiliacionIgss = noAfiliacionIgss;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaCrea() {
        return fechaCrea;
    }

    public void setFechaCrea(Date fechaCrea) {
        this.fechaCrea = fechaCrea;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public short getUsuario() {
        return usuario;
    }

    public void setUsuario(short usuario) {
        this.usuario = usuario;
    }

    public Integer getIdDiscapacidad() {
        return idDiscapacidad;
    }

    public void setIdDiscapacidad(Integer idDiscapacidad) {
        this.idDiscapacidad = idDiscapacidad;
    }

    public Integer getIdEscolaridad() {
        return idEscolaridad;
    }

    public void setIdEscolaridad(Integer idEscolaridad) {
        this.idEscolaridad = idEscolaridad;
    }

    public Integer getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(Integer idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public Integer getIdEtnia() {
        return idEtnia;
    }

    public void setIdEtnia(Integer idEtnia) {
        this.idEtnia = idEtnia;
    }

    public Integer getIdGrupoEtnico() {
        return idGrupoEtnico;
    }

    public void setIdGrupoEtnico(Integer idGrupoEtnico) {
        this.idGrupoEtnico = idGrupoEtnico;
    }

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Integer getIdOrientacionSexual() {
        return idOrientacionSexual;
    }

    public void setIdOrientacionSexual(Integer idOrientacionSexual) {
        this.idOrientacionSexual = idOrientacionSexual;
    }

    public Integer getIdProfesion() {
        return idProfesion;
    }

    public void setIdProfesion(Integer idProfesion) {
        this.idProfesion = idProfesion;
    }

    public Integer getIdRedServicio() {
        return idRedServicio;
    }

    public void setIdRedServicio(Integer idRedServicio) {
        this.idRedServicio = idRedServicio;
    }

    public Integer getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    @Override
    public String toString() {
        return "gt.gob.mspas.hospitales.entity.TtPersona[ idPersona=" + idPersona + " ]";
    }
    
}
