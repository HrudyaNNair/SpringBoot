package com.demo.product;

import org.hibernate.boot.model.internal.JPAXMLOverriddenAnnotationReader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

}
