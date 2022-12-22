package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ProductService {
    private List<Product> products;
    public ProductService() {
        products = new ArrayList<>();
        //long id, String name, double price, int quantity, Date createAt
        products.add(new Product(1671692231, "A Iphone", 90000, 2, new Date()));
        products.add(new Product(1671692232, "Uphone 11", 10000, 2, new Date()));
        products.add(new Product(1671692233, "Bphone 12", 50000, 2, new Date()));
        products.add(new Product(1671692234, "Aphone 13", 30000, 2, new Date()));
    }
    public List<Product> getAllProducts() {
        return products;
    }


    public List<Product> searchProductsByName(String name) {
        List<Product> results = new ArrayList<>();
        for (Product p : products) {
            if (p.getName().toUpperCase().contains(name.toUpperCase())) {
                results.add(p);
            }
        }
        return results;
    }
    public void deleteProductById(long idProduct) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == idProduct) {
                products.remove(i);
                break;
            }
        }
    }
    public Product findProductById(long id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return products.get(i);
            }
        }
        return null;
    }
    public void updateProductById(long id, Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.get(i).updateProduct(product);
            }
        }
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
