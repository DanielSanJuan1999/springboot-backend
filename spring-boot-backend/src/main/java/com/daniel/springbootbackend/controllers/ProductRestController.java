package com.daniel.springbootbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

import com.daniel.springbootbackend.models.entity.Product;
import com.daniel.springbootbackend.models.entity.services.IProductServices;

@CrossOrigin(origins={"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ProductRestController {
    
    @Autowired
    private IProductServices productServices;

    @GetMapping("/product")
    public List<Product> index(){
        return productServices.findAll();
    }

}
