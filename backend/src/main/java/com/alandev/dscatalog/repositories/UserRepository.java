package com.alandev.dscatalog.repositories;

import com.alandev.dscatalog.entities.Product;
import com.alandev.dscatalog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
