package com.daniel.springbootbackend.models.entity.services;

import java.util.List;
import com.daniel.springbootbackend.models.entity.Product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductServices {

    public List<Product> findAll();

    public Page<Product> findAll(Pageable pageable);

    public Product findById(Long id);

}
