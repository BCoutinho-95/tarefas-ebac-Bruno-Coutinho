package com.exemplo.service;

import com.exemplo.entity.Usuario;
import com.exemplo.repository.UsuarioRepository;

public class UsuarioService {

    private UsuarioRepository repository = new UsuarioRepository();

    public void cadastrarUsuario(Usuario usuario) throws Exception {
        if (usuario.getEmail() == null || !usuario.getEmail().contains("@")) {
            throw new Exception("Email inválido");
        }
        if (usuario.getSenha() == null || usuario.getSenha().length() < 6) {
            throw new Exception("Senha deve ter ao menos 6 caracteres");
        }

        repository.salvar(usuario);
    }
}
