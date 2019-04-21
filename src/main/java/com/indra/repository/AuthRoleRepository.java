package com.indra.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indra.model.AuthRole;
import com.indra.model.AuthRoleName;

@Repository
public interface AuthRoleRepository extends JpaRepository<AuthRole, Long> {
    
	Optional<AuthRole> findByName(AuthRoleName roleName);
}