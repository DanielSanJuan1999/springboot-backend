package com.daniel.springbootbackend.models.entity.services;

import java.util.List;
import com.daniel.springbootbackend.models.entity.Product;

public interface IProductServices {

    public List<Product> findAll();

    public Product findById(Long id);

    public Product save(Product product);

    public void delete(Long id);

}
