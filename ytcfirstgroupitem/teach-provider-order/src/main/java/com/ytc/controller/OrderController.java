package com.ytc.controller;

import com.ytc.model.Order;
import com.ytc.service.OrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("AllOrder")
    @ResponseBody
    public List<Order> AllOrder(){
        List<Order> list = orderService.AllOrder();
        System.out.println(list);
        return list;
    }

    @RequestMapping("addOrder")
    @ResponseBody
    public void addOrder(Order order){
        orderService.addOrder(order);
    }

    @RequestMapping("deleteOrder")
    @ResponseBody
    public void deleteOrder(@RequestParam("orderid") int orderid){
        orderService.deleteOrder(orderid);
    }

    @RequestMapping("updateOrder")
    @ResponseBody
    public void updateOrder(@RequestParam("orderid") int orderid ,@RequestParam("orderstatus") int orderstatus){
        orderService.updateOrder(orderid,orderstatus);
    }
}
