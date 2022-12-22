package com.codegym.service;

import com.codegym.model.Customer;
import com.codegym.model.EGender;
import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerService {
    private List<Customer> customers;
    public CustomerService() {
        customers = new ArrayList<>();
        customers.add(new Customer(456, "John", 20, "Huế", new Date(), EGender.MAlE));
        customers.add(new Customer(457, "Levis", 30, "Huế", new Date(), EGender.MAlE));
        customers.add(new Customer(458, "Tom", 25, "ĐN", new Date(), EGender.FEMALE));
    }
    public List<Customer> getAllCustomers(){
        return customers;
    }
    public Customer findCustomerById(long id) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == id) {
                return customers.get(i);
            }
        }
        return null;
    }
    public Customer findCustomerByName(String name) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
                return customers.get(i);
            }
        }
        return null;
    }
    public void updateCustomerById(long id, Customer customer) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == id) {
                customers.get(i).updateCustomer(customer);
            }
        }
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public void deleteCustomerById(long idCustomer) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == idCustomer) {
                customers.remove(i);
                break;
            }
        }
    }

}
