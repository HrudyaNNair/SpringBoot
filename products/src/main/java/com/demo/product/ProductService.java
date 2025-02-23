package com.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
    public List<Product> getProduct() {
        return repo.findAll();
    }

    public Product getProductById(Integer productId) {
        return repo.findById(productId).orElse(new Product());
    }

    public void addProduct(Product product) {
        repo.save(product);
    }
    public  void updateProduct(Product product){
        repo.save(product);
    }
    public void deleteProduct(int productId){
        repo.deleteById(productId);
    }
}
