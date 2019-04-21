package com.indra.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indra.model.AuthLogin;

@Repository
public interface AuthUserRepository extends JpaRepository<AuthLogin, Long> {
    
	Optional<AuthLogin> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    AuthLogin findById(long id);
}