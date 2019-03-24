package com.productlist.productlist;

import com.productlist.productlist.model.Product;
import com.productlist.productlist.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class ProductListApplication implements CommandLineRunner {
    @Autowired
    ProductService productService;

    public static void main(String[] args) {
        SpringApplication.run(ProductListApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        log.info("=======welcome to the backend application ======");
        return "Hello world";
    }
    @Override
    public void run(String... args) throws Exception {
        Product product = new Product();
        product.setProductId(1L);
        product.setProductName("Leaf Rake");
        product.setProductCode("GDN-0011");
        product.setReleaseDate("March 19, 2016");
        product.setDescription("Leaf rake with 48-inch wooden handle.");
        product.setPrice(19.95);
        product.setStarRating(4);
        product.setImageUrl("https://openclipart.org/image/300px/svg_to_png/26215/Anonymous_Leaf_Rake.png");
        productService.saveProduct(product);

        product.setProductId(2L);
        product.setProductName("Garden Cart");
        product.setProductCode("GDN-0023");
        product.setReleaseDate("March 18, 2016");
        product.setDescription("15 gallon capacity rolling garden cart");
        product.setPrice(32.99);
        product.setStarRating(4);
        product.setImageUrl("https://openclipart.org/image/300px/svg_to_png/58471/garden_cart.png");
        productService.saveProduct(product);

        product.setProductId(2L);
        product.setProductName("Garden Cart");
        product.setProductCode("GDN-0023");
        product.setReleaseDate("March 18, 2016");
        product.setDescription("15 gallon capacity rolling garden cart");
        product.setPrice(32.99);
        product.setStarRating(4);
        product.setImageUrl("https://openclipart.org/image/300px/svg_to_png/58471/garden_cart.png");
        productService.saveProduct(product);

        product.setProductId(5L);
        product.setProductName("Hammer");
        product.setProductCode("TBX-0048");
        product.setReleaseDate("May 21, 2016");
        product.setDescription("Curved claw steel hammer");
        product.setPrice(8.9);
        product.setStarRating(4);
        product.setImageUrl("https://openclipart.org/image/300px/svg_to_png/73/rejon_Hammer.png");
        productService.saveProduct(product);

        product.setProductId(8L);
        product.setProductName("Saw");
        product.setProductCode("TBX-0022");
        product.setReleaseDate("May 15, 2016");
        product.setDescription("15-inch steel blade hand saw");
        product.setPrice(11.55);
        product.setStarRating(3);
        product.setImageUrl("https://openclipart.org/image/300px/svg_to_png/27070/egore911_saw.png");
        productService.saveProduct(product);

        product.setProductId(10L);
        product.setProductName("Video Game Controller");
        product.setProductCode("TBX-0022");
        product.setReleaseDate("October 15, 2015");
        product.setDescription("Standard two-button video game controller");
        product.setPrice(35.95);
        product.setStarRating(4);
        product.setImageUrl("https://openclipart.org/image/300px/svg_to_png/120337/xbox-controller_01.png");
        productService.saveProduct(product);
        log.info("=====saving the prodcut=====");
    }
}
