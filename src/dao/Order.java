package dao;

import java.util.List;

public class Order {

    int orderId;
    List<Product> products;

    public Order(int orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
    }
}
