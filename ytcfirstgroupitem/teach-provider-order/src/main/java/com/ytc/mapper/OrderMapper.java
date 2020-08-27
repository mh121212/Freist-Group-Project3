package com.ytc.mapper;

import com.ytc.model.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface OrderMapper {
    List<Order> AllOrder();
    void addOrder(Order order);
    void deleteOrder(@RequestParam("orderid") int orderid);
    void updateOrder(@Param("orderid") int orderid,@Param("orderstatus") int orderstatus);
}
