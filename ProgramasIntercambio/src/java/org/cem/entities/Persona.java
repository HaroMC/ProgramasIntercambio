package org.cem.entities;
// Generated 12-oct-2017 0:48:22 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Persona generated by hbm2java
 */
public class Persona  implements java.io.Serializable {


     private int rut;
     private String nombreCompleto;
     private Date fechaNacimiento;
     private String domicilio;
     private String ciudad;
     private String pais;
     private String correo;
     private String telefono;
     private String tipo;
     private Set usuarios = new HashSet(0);
     private Docente docente;
     private Alumno alumno;
     private CentroEstudiosLocal centroEstudiosLocal;
     private FamiliaAnfitriona familiaAnfitriona;

    public Persona() {
    }

	
    public Persona(int rut, String nombreCompleto, String domicilio, String ciudad, String pais, String tipo) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.domicilio = domicilio;
        this.ciudad = ciudad;
        this.pais = pais;
        this.tipo = tipo;
    }
    public Persona(int rut, String nombreCompleto, Date fechaNacimiento, String domicilio, String ciudad, String pais, String correo, String telefono, String tipo, Set usuarios, Docente docente, Alumno alumno, CentroEstudiosLocal centroEstudiosLocal, FamiliaAnfitriona familiaAnfitriona) {
       this.rut = rut;
       this.nombreCompleto = nombreCompleto;
       this.fechaNacimiento = fechaNacimiento;
       this.domicilio = domicilio;
       this.ciudad = ciudad;
       this.pais = pais;
       this.correo = correo;
       this.telefono = telefono;
       this.tipo = tipo;
       this.usuarios = usuarios;
       this.docente = docente;
       this.alumno = alumno;
       this.centroEstudiosLocal = centroEstudiosLocal;
       this.familiaAnfitriona = familiaAnfitriona;
    }
   
    public int getRut() {
        return this.rut;
    }
    
    public void setRut(int rut) {
        this.rut = rut;
    }
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }
    
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getDomicilio() {
        return this.domicilio;
    }
    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }
    public Docente getDocente() {
        return this.docente;
    }
    
    public void setDocente(Docente docente) {
        this.docente = docente;
    }
    public Alumno getAlumno() {
        return this.alumno;
    }
    
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    public CentroEstudiosLocal getCentroEstudiosLocal() {
        return this.centroEstudiosLocal;
    }
    
    public void setCentroEstudiosLocal(CentroEstudiosLocal centroEstudiosLocal) {
        this.centroEstudiosLocal = centroEstudiosLocal;
    }
    public FamiliaAnfitriona getFamiliaAnfitriona() {
        return this.familiaAnfitriona;
    }
    
    public void setFamiliaAnfitriona(FamiliaAnfitriona familiaAnfitriona) {
        this.familiaAnfitriona = familiaAnfitriona;
    }
    
    @Override
    public String toString() {
        return "Nombre : " + nombreCompleto + "\nRut    : " + rut + "\n";
    }
}


