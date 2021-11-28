package service;

import dao.Order;
import dao.Promotion;

public interface ProductService {

    public  int getTotalPrice(Order order, Promotion promotion);
}
