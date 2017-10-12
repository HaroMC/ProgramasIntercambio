/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cem.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.cem.entities.Usuario;
import org.springframework.stereotype.Service;

/**
 *
 * @author FrancisBrianPC
 */
@Service
public class UsuarioDAO {
    
    private EntityManager em;
    
    //Crear Entity
    public void create(Usuario dto){   
        em.persist(dto);
    }
    public List<Usuario> readAll() throws SecurityException{ 
        String sql="Select * from Usuario";
        
        Query q=em.createQuery(sql);          
        return q.getResultList();
    }
}
