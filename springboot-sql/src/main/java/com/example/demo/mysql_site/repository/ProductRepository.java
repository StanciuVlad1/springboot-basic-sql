package com.example.demo.mysql_site.repository;

import com.example.demo.mysql_site.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
