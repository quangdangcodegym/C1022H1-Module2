package com.codegym.model;

import com.codegym.repository.IModel;

import java.util.Date;

public class Product implements IModel<Product> {
    private long id;
    private String name;
    private double price;
    private int quantity;
    private Date createAt;


    public Product() {

    }

    public long getId() {
        return id;
    }

    @Override
    public void update(Product objNew) {
        this.createAt = objNew.getCreateAt();
        this.price = objNew.getPrice();
        this.quantity = objNew.getQuantity();
        this.name = objNew.getName();
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public void updateProduct(Product product) {
        this.setName(product.getName());
        this.setPrice(product.getPrice());
        this.setCreateAt(product.getCreateAt());
        this.setQuantity(product.getQuantity());
    }

    public Product(long id, String name, double price, int quantity, Date createAt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.createAt = createAt;
    }

    public String toViewer() {
        return String.format("%-5s|%-10s|%-10s|%-10s|%-10s\n", this.getId(), this.getName(), this.getPrice(), this.getQuantity(), this.getCreateAt());
    }
}
