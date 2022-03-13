/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.productmanagement2.service;

import com.java.productmanagement2.dao.ProductDao;
import com.java.productmanagement2.entity.Product;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ProductService {
    private final ProductDao productDao;

    public ProductService() {
        productDao = new ProductDao();
    }
    
    
    public List<Product> findAll() {
        return productDao.findAll();
    }
    
    public Product findById(Long id) {
        return productDao.findById(id);
        
    }
    
    public Boolean delete(Long id) {
        return productDao.delete(id);
    }
    
    public Boolean update(Product product) {
        return productDao.update(product);
    }
    
}
