/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.cem.entities.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author FrancisBrianPC
 */
@Controller

public class UsuarioController {
    private Usuario us = new Usuario();
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap mm){
        return "index";
    }
    
    @RequestMapping("/agregarUsuarios.htm")
    public String agregarUsuario(){
        Usuario u = new Usuario();
    }
}
