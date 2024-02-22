package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Random;

@Repository
public class ProductRepository {

    private ArrayList<Product> product_list = new ArrayList<Product>();
    public Product createProduct(Product product){
        product_list.add(product);
        return product;
    }

    public Product getProduct(String id){
        Product product = product_list.stream().filter(p -> p.getProdutc_id().equals((id))).findFirst().orElse(null);
        return product;
    }

}
