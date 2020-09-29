package com.ecommerce.microcommerce.web.controller;
import com.ecommerce.microcommerce.dao.ProductDao;
import com.ecommerce.microcommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDao productDao;

    //Get product list
    @GetMapping(value="/products")
    public List<Product> productList() {
        return productDao.findAll();
    }

    //Find a product by its id
    @GetMapping(value="/products/{id}")
    public Product showProduct(@PathVariable int id) {
        return productDao.findById(id);
    }

    //Create a new product
    @PostMapping(value="/products")
    public ResponseEntity<Void> newProduct(@RequestBody Product product){

        Product product1 = productDao.save(product);
        if(product==null){
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id")
                .buildAndExpand(product1.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}