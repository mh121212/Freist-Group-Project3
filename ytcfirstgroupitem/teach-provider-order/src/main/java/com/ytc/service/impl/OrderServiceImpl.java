package com.ytc.service.impl;

import com.ytc.mapper.OrderMapper;
import com.ytc.model.Order;
import com.ytc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> AllOrder() {
        List<Order> list = orderMapper.AllOrder();
        return list;
    }

    @Override
    public void addOrder(Order order) {
        orderMapper.addOrder(order);
    }

    @Override
    public void deleteOrder(@RequestParam("orderid") int orderid) {
        orderMapper.deleteOrder(orderid);
    }

    @Override
    public void updateOrder(@RequestParam("orderid") int orderid, @RequestParam("orderstatus") int orderstatus) {
        orderMapper.updateOrder(orderid,orderstatus);
    }
}
