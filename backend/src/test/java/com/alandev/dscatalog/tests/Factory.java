package com.alandev.dscatalog.tests;

import com.alandev.dscatalog.dto.ProductDTO;
import com.alandev.dscatalog.entities.Category;
import com.alandev.dscatalog.entities.Product;

import java.time.Instant;

public class Factory {

    public static Product creatProduct() {
        Product product = new Product(1L, "Phone", "Good Phone", 800.0,
                "http://img.com/img.png", Instant.parse("2020-01-02T13:00:00Z"));
        product.getCategories().add(new Category(2L, "Electronics"));
        return product;
    }

    public static ProductDTO createProductDto() {
        Product product = creatProduct();
        return new ProductDTO(product, product.getCategories());
    }
}
