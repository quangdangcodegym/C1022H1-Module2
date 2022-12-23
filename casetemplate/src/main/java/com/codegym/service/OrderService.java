package com.codegym.service;

import com.codegym.model.Order;
import com.codegym.repository.OrderRepository;

import javax.sound.sampled.Line;
import java.util.List;

public class OrderService {
    private OrderRepository orderRepository;

    public OrderService() {
        orderRepository = new OrderRepository();
    }
    public List<Order> getAllOrders(){
        return orderRepository.getAll();
    }
    public Order findOrderById(long idOrder){
        return orderRepository.findById(idOrder);
    }
}
