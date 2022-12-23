package com.codegym.model;

import com.codegym.repository.IModel;

import java.util.Date;
import java.util.List;

public class Order implements IModel<Order> {
    private long id;
    private String nameCustomer;
    private double total;
    private Date createAt;
    private EStatusOrder eStatusOrder;

    private List<OrderItem> orderItems;

    public long getId() {
        return id;
    }

    @Override
    public void update(Order objNew) {
        this.nameCustomer = objNew.getNameCustomer();
        this.createAt = objNew.getCreateAt();
        this.total = objNew.getTotal();
        this.orderItems = objNew.getOrderItems();
        this.eStatusOrder = objNew.geteStatusOrder();
    }

    public EStatusOrder geteStatusOrder() {
        return eStatusOrder;
    }

    public void seteStatusOrder(EStatusOrder eStatusOrder) {
        this.eStatusOrder = eStatusOrder;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Order(long id, String nameCustomer, double total, Date createAt, List<OrderItem> orderItems) {
        this.id = id;
        this.nameCustomer = nameCustomer;
        this.total = total;
        this.createAt = createAt;
        this.orderItems = orderItems;
    }
    public Order(long id, String nameCustomer, double total, Date createAt, EStatusOrder eStatusOrder) {
        this.id = id;
        this.nameCustomer = nameCustomer;
        this.total = total;
        this.createAt = createAt;
        this.orderItems = orderItems;
        this.eStatusOrder = eStatusOrder;
    }
}
