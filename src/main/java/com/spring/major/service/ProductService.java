package com.spring.major.service;

import com.spring.major.model.Product;
import com.spring.major.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
}
