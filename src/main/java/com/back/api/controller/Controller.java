/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.api.controller;

import com.back.api.dao.UsuarioDao;
import com.back.api.models.Usuario;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author daniel
 */
@RestController
public class Controller {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {

        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Daniel");
        usuario.setApellido("Duarte");
        usuario.setEmail("danielduarte1991@gmail.com");
        usuario.setTelefeno("0412855555");
        usuario.setPassword("5222");

        return usuario;

    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public List<Usuario> getUsuarios(@PathVariable("id") Long id) {

        return usuarioDao.getUsuarios();

    }

    @RequestMapping(value = "usuariio")
    public Usuario editar() {

        Usuario usuario = new Usuario();
        usuario.setNombre("Daniel");
        usuario.setApellido("Duarte");
        usuario.setEmail("danielduarte1991@gmail.com");
        usuario.setTelefeno("0412855555");
        usuario.setPassword("5222");

        return usuario;

    }

    @RequestMapping(value = "usuarrio")
    public Usuario actualizar() {

        Usuario usuario = new Usuario();
        usuario.setNombre("Daniel");
        usuario.setApellido("Duarte");
        usuario.setEmail("danielduarte1991@gmail.com");
        usuario.setTelefeno("0412855555");
        usuario.setPassword("5222");

        return usuario;

    }

    @RequestMapping(value = "usuarriio")
    public Usuario eliminar() {

        Usuario usuario = new Usuario();
        usuario.setNombre("Daniel");
        usuario.setApellido("Duarte");
        usuario.setEmail("danielduarte1991@gmail.com");
        usuario.setTelefeno("0412855555");
        usuario.setPassword("5222");

        return usuario;

    }

    @RequestMapping(value = "usuuarrio")
    public Usuario search() {

        Usuario usuario = new Usuario();
        usuario.setNombre("Daniel");
        usuario.setApellido("Duarte");
        usuario.setEmail("danielduarte1991@gmail.com");
        usuario.setTelefeno("0412855555");
        usuario.setPassword("5222");

        return usuario;

    }

    

}
