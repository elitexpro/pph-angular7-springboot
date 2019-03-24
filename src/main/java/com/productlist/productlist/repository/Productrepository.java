package com.productlist.productlist.repository;

import com.productlist.productlist.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource
public interface Productrepository extends JpaRepository<Product, Long> {
    Optional<Product> findByProductId(long productId);

    Optional<Product> findByProductName(String productName);
}
