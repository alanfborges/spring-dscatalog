package com.alandev.dscatalog.repositories;

import com.alandev.dscatalog.entities.Role;
import com.alandev.dscatalog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
