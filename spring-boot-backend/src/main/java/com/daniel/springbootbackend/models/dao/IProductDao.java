package com.daniel.springbootbackend.models.dao;

import com.daniel.springbootbackend.models.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductDao extends JpaRepository<Product, Long> {
    
}
