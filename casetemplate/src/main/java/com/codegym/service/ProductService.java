package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.repository.file.ProductRepository;

import java.util.List;

public class ProductService {
    private ProductRepository productRepository;
    public ProductService() {
        productRepository = new ProductRepository();
    }
    public List<Product> getAllProducts() {
        return productRepository.getAll();
    }


    public List<Product> searchProductsByName(String name) {
//        List<Product> results = new ArrayList<>();
//        for (Product p : products) {
//            if (p.getName().toUpperCase().contains(name.toUpperCase())) {
//                results.add(p);
//            }
//        }
//        return results;
        return null;
    }
    public void deleteProductById(long idProduct) {
        productRepository.deleteById(idProduct);
    }
    public Product findProductById(long id) {
        return productRepository.findById(id);
    }
    public void updateProductById(long id, Product product) {
        productRepository.updateById(id, product);
    }

    public void addProduct(Product product) {
       productRepository.add(product);
    }
}
