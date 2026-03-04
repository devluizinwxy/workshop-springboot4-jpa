package com.educandoweb.demo.service;

import com.educandoweb.demo.entities.Product;
import com.educandoweb.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
       return productRepository.findAll();
    }
    public Product findById(long id){
        Optional<Product> optionalProduct = productRepository.findById(id);
         return optionalProduct.get();
    }
}
