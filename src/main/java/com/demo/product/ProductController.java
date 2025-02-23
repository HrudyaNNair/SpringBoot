package com.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/products")
    public List<Product> getProduct(){
        return service.getProduct();
    }
    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable int productId){
        return service.getProductById(productId);
    }
    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }
    @DeleteMapping("/products/{productId}")
    public void deleteProduct(@PathVariable int productId){
        service.deleteProduct(productId);
    }

}
