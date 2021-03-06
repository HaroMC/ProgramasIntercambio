package org.cem.entities;
// Generated 12-oct-2017 0:48:22 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Perfil generated by hbm2java
 */
public class Perfil  implements java.io.Serializable {


     private BigDecimal codigo;
     private String nombre;
     private String estado;
     private Set usuarios = new HashSet(0);

    public Perfil() {
    }

	
    public Perfil(BigDecimal codigo, String nombre, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estado = estado;
    }
    public Perfil(BigDecimal codigo, String nombre, String estado, Set usuarios) {
       this.codigo = codigo;
       this.nombre = nombre;
       this.estado = estado;
       this.usuarios = usuarios;
    }
   
    public BigDecimal getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}


