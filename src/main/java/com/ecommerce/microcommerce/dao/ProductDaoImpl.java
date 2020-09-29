package com.ecommerce.microcommerce.dao;
import com.ecommerce.microcommerce.model.Product;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {

    public static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, new String("Ordinateur"), 350));
        products.add(new Product(2, new String("Planche de surf"), 600));
        products.add(new Product(3, new String("Vélo électrique"), 1500));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public Product save(Product product) {
        return null;
    }
}