package com.example.demoz.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoz.Models.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {
    
}
