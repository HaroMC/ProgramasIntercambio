package org.cem.entities;
// Generated 12-oct-2017 0:48:22 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Programa generated by hbm2java
 */
public class Programa  implements java.io.Serializable {

     //
     private BigDecimal codigo;
     private Asignatura asignatura;
     private String nombre;
     private Date fechaInicio;
     private Date fechaTermino;
     private int valor;
     private String estado;
     private Set postulacionesAlumnoses = new HashSet(0);
     private Set postulacionesCels = new HashSet(0);

    public Programa() {
    }

	
    public Programa(BigDecimal codigo, String nombre, int valor, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.valor = valor;
        this.estado = estado;
    }
    public Programa(BigDecimal codigo, Asignatura asignatura, String nombre, Date fechaInicio, Date fechaTermino, int valor, String estado, Set postulacionesAlumnoses, Set postulacionesCels) {
       this.codigo = codigo;
       this.asignatura = asignatura;
       this.nombre = nombre;
       this.fechaInicio = fechaInicio;
       this.fechaTermino = fechaTermino;
       this.valor = valor;
       this.estado = estado;
       this.postulacionesAlumnoses = postulacionesAlumnoses;
       this.postulacionesCels = postulacionesCels;
    }
   
    public BigDecimal getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }
    public Asignatura getAsignatura() {
        return this.asignatura;
    }
    
    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaTermino() {
        return this.fechaTermino;
    }
    
    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }
    public int getValor() {
        return this.valor;
    }
    
    public void setValor(int valor) {
        this.valor = valor;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Set getPostulacionesAlumnoses() {
        return this.postulacionesAlumnoses;
    }
    
    public void setPostulacionesAlumnoses(Set postulacionesAlumnoses) {
        this.postulacionesAlumnoses = postulacionesAlumnoses;
    }
    public Set getPostulacionesCels() {
        return this.postulacionesCels;
    }
    
    public void setPostulacionesCels(Set postulacionesCels) {
        this.postulacionesCels = postulacionesCels;
    }




}


