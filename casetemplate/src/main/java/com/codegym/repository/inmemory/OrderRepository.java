package com.codegym.repository.inmemory;

import com.codegym.model.EStatusOrder;
import com.codegym.model.Order;
import com.codegym.model.OrderItem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderRepository extends MemoryContext<Order>{
    @Override
    public void init() {
        list = new ArrayList<>();

        Order order1 = new Order(1L, "Quang Dang", 100000, new Date(), EStatusOrder.NEW);
        List<OrderItem> orderItems1 = new ArrayList<>();
        //long id, long idOrder, long idProduct, int amount)
        orderItems1.add(new OrderItem(1L, 1L, 1671692231, 5));
        order1.setOrderItems(orderItems1);

        Order order2 = new Order(2L, "Thiên Phụng", 950000, new Date(), EStatusOrder.NEW);
        List<OrderItem> orderItems2 = new ArrayList<>();
        //long id, long idOrder, long idProduct, int amount)
        orderItems2.add(new OrderItem(1L, 2L, 1671692231, 5));
        orderItems2.add(new OrderItem(2L, 2L, 1671692232, 5));
        order2.setOrderItems(orderItems2);
        list.add(order1);
        list.add(order2);

    }
}
