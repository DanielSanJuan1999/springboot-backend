package com.daniel.springbootbackend.models.entity.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daniel.springbootbackend.models.entity.Product;
import com.daniel.springbootbackend.models.entity.services.IProductServices;
import com.daniel.springbootbackend.models.dao.IProductDao;

@Service
public class ProductServicesImpl implements IProductServices{
    
    @Autowired
    private IProductDao productDao;
    

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll(){
        return (List<Product>) productDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Product> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return productDao.findAll(pageable);
    }

    //
    @Override
    @Transactional(readOnly = true)
    public Product findById(Long id) {
        // TODO Auto-generated method stub
        return productDao.findById(id).orElse(null);
    }    

}
