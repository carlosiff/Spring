package com.algaworks.gestaofesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.gestaofesta.model.Usuario;

public interface Usuarios extends JpaRepository<Usuario, Long> {

}