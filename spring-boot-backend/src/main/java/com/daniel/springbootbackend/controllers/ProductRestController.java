package com.daniel.springbootbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.daniel.springbootbackend.models.entity.Product;
import com.daniel.springbootbackend.models.entity.services.IProductServices;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {
    
    @Autowired
    private IProductServices productServices;

    public List<Product> index(){
        return productServices.findAll();
    }

}
