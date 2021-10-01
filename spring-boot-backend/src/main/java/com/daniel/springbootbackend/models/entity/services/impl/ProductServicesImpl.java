package com.daniel.springbootbackend.models.entity.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daniel.springbootbackend.models.entity.Product;
import com.daniel.springbootbackend.models.entity.services.IProductServices;
import com.daniel.springbootbackend.models.dao.IProductDao;

@Service
public class ProductServicesImpl implements IProductServices{
    
    @Autowired
    private IProductDao productDao;
    
    @Transactional
    @Override
    public List<Product> findAll(){
        return (List<Product>) productDao.findAll();
    }

}
