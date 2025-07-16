package com.exemplo.controller;

import com.exemplo.entity.Usuario;
import com.exemplo.service.UsuarioService;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class UsuarioBean {

    private Usuario usuario = new Usuario();
    private UsuarioService service = new UsuarioService();

    public void salvar() {
        try {
            service.cadastrarUsuario(usuario);
            usuario = new Usuario();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
