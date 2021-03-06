package org.cem.entities;
// Generated 12-oct-2017 0:48:22 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Calificacion generated by hbm2java
 */
public class Calificacion  implements java.io.Serializable {


     private BigDecimal codigo;
     private Alumno alumno;
     private Asignatura asignatura;
     private Date fechaCalificacion;
     private BigDecimal nota;

    public Calificacion() {
    }

    public Calificacion(BigDecimal codigo, Alumno alumno, Asignatura asignatura, Date fechaCalificacion, BigDecimal nota) {
       this.codigo = codigo;
       this.alumno = alumno;
       this.asignatura = asignatura;
       this.fechaCalificacion = fechaCalificacion;
       this.nota = nota;
    }
   
    public BigDecimal getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }
    public Alumno getAlumno() {
        return this.alumno;
    }
    
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    public Asignatura getAsignatura() {
        return this.asignatura;
    }
    
    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
    public Date getFechaCalificacion() {
        return this.fechaCalificacion;
    }
    
    public void setFechaCalificacion(Date fechaCalificacion) {
        this.fechaCalificacion = fechaCalificacion;
    }
    public BigDecimal getNota() {
        return this.nota;
    }
    
    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }




}


