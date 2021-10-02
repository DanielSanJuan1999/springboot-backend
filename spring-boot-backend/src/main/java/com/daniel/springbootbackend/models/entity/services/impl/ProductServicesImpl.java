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
    

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll(){
        return (List<Product>) productDao.findAll();
    }

    //
    @Override
    @Transactional(readOnly = true)
    public Product findById(Long id) {
        // TODO Auto-generated method stub
        return productDao.findById(id).orElse(null);
    }

    //CREAR ELEMENTO EN LA TABLA
    @Override
    @Transactional
    public Product save(Product product) {
        // TODO Auto-generated method stub
        return productDao.save(product);
    }

    //BORRAR ELEMENTO DE LA TABLA
    @Override
    @Transactional
    public void delete(Long id) {
        // TODO Auto-generated method stub
        productDao.deleteById(id);
    }

}
