/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cem.dao;

import org.cem.entities.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author FrancisBrianPC
 */
@Repository
@Transactional
public class UsuarioDAOImpl {

    @Autowired(required = true)
    private SessionFactory sessionFactory;
    public int AgregarUsuario(Usuario usuario) {
        Session session = sessionFactory.getCurrentSession();
        Long id = (Long) session.save(usuario);
        return Integer.valueOf(id.toString());
    }
    
}
