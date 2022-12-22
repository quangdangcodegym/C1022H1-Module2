package com.codegym.service;

import com.codegym.model.Customer;
import com.codegym.model.Product;

public abstract class DatabaseContext<T> {
    public abstract T getAll();

    public abstract void deleteById(long id);
    public abstract void findById(long id);

    public abstract void add(T obj);
    public abstract void updateById(long id, T obj);

}
