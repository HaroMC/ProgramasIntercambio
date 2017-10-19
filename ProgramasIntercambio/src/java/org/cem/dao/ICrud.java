package org.cem.dao;

import java.math.BigDecimal;
import java.util.List;

public interface ICrud {
    
    public boolean agregar(Object objParam);
    
    public boolean modificar(Object objParam, int id);
    
    public boolean eliminar(int id);
    
    public List<Object> obtenerListado();
    
    public Object buscarPorID(int id);
    
    public BigDecimal buscarUltimoID();
}
