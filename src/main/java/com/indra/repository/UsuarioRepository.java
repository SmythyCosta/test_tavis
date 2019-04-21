package com.indra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indra.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Usuario findById(long id);

}
