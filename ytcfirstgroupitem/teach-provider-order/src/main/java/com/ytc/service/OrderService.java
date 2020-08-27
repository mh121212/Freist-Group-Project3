package com.ytc.service;

import com.ytc.model.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface OrderService {
    List<Order> AllOrder();
    void addOrder(Order order);
    void deleteOrder(@RequestParam("orderid") int orderid);
    void updateOrder(@RequestParam("orderid") int orderid,@RequestParam("orderstatus") int orderstatus);
}
