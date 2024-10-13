package com.feddebh.fitbot.repository;

import com.feddebh.fitbot.models.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
