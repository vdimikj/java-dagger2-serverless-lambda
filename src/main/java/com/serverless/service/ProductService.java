package com.serverless.service;

import com.serverless.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> productList = new ArrayList<>();

    public String createProduct(Product p) {
        productList.add(p);
        return "create";
    }

    public Product getProduct(String id) {
        if (productList != null) {
            return productList.get(0);
        }
        return null;
    }

    public Product putProduct(Product p) {
        throw new UnsupportedOperationException();
    }

    public Product deleteProduct(Product p) {
        throw new UnsupportedOperationException();
    }
}