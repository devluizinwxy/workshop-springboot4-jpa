package com.educandoweb.demo.Resource;

import com.educandoweb.demo.entities.Category;
import com.educandoweb.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categorys")
public class CategoryResource {
    @Autowired
    CategoryService CategoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = CategoryService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable long id) {
        return ResponseEntity.ok().body(CategoryService.findById(id));
    }
}
