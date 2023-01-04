package com.codegym;

import com.codegym.view.CustomerView;
import com.codegym.view.OrderView;
import com.codegym.view.ProductView;

public class Main {
    public static void main(String[] args) {
//        CustomerView customerList = new CustomerView();
//        customerList.launcher();


//        ProductView myStore = new ProductView();
//        myStore.laucher();

        OrderView orderView = new OrderView();
        orderView.laucher();
    }
}