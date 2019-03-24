package com.productlist.productlist.service;

import com.productlist.productlist.model.Product;
import com.productlist.productlist.repository.Productrepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private Productrepository productrepository;

    public ProductService(Productrepository productrepository) {
        this.productrepository = productrepository;
    }

    public List<Product> getAllProducts() {
        return productrepository.findAll();
    }

    public Product getProductById(final Long productId) {
        Optional<Product> productOptional = productrepository.findByProductId(productId);

        Product product = productOptional.orElse(new Product());
        return product;
    }

    public Product getProductByName(final String productName) {
        Optional<Product> productOptional = productrepository.findByProductName(productName);

        Product product = productOptional.orElse(new Product());

        return product;
    }

    public void saveProduct(Product product) {
        productrepository.save(product);
    }

    public  void deleteProduct(Long id) {
        productrepository.deleteById(id);
    }
}
