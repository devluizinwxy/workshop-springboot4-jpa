package com.educandoweb.demo.service;

import com.educandoweb.demo.entities.Category;
import com.educandoweb.demo.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository CategoryRepository;

    public List<Category> findAll(){
       return CategoryRepository.findAll();
    }
    public Category findById(long id){
        Optional<Category> optionalCategory = CategoryRepository.findById(id);
         return optionalCategory.get();
    }
}
