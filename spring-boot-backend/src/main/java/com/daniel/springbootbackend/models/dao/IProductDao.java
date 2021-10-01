package com.daniel.springbootbackend.models.dao;

import com.daniel.springbootbackend.models.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductDao extends CrudRepository<Product, Long> {
    
}
