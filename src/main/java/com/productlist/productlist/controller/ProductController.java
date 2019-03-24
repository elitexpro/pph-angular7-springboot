package com.productlist.productlist.controller;

import com.productlist.productlist.model.Product;
import com.productlist.productlist.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/listall")
    public ResponseEntity<?> getAllProducts() {
        List<Product> productList = productService.getAllProducts();
        log.info("====fetchging all the products====");
        return ResponseEntity.ok(productList);
    }

    @GetMapping("/product/id/{id}")
    public ResponseEntity getProductById(@PathVariable("id") Long id) {
        Product product = productService.getProductById(id);
        log.info("===searching for a product with id {}", id);
        return ResponseEntity.ok(product);
    }

    @GetMapping("/product/name/{name}")
    public ResponseEntity getProductByName(@PathVariable("name") String name) {
        Product product = productService.getProductByName(name);
        log.info("====searching for the product with name {}", name);
        return ResponseEntity.ok(product);
    }
}
