package com.alandev.dscatalog.repositories;

import com.alandev.dscatalog.entities.Category;
import com.alandev.dscatalog.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
