package com.exemplo.usuarios.repository;

import com.exemplo.usuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
