package com.ecommerce.microcommerce.web.controller;
import com.ecommerce.microcommerce.dao.ProductDao;
import com.ecommerce.microcommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    //Find a product with its id
    @GetMapping(value="/products/{id}")
    public Product showProduct(@PathVariable int id) {
        return productDao.findById(id);
    }
}