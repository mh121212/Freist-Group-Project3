package com.ytc.Controller;

import com.ytc.Service.OrderService;
import com.ytc.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("AllOrder")
    public String AllOrder(){
        List<Order> list = orderService.AllOrder();
        System.out.println(list);
        return "index";
    }

    @RequestMapping("addOrder")
    @ResponseBody
    public void addOrder(Order order){
        orderService.addOrder(order);
    }

    @RequestMapping("deleteOrder")
    @ResponseBody
    public String deleteOrder(int orderid){
        orderService.deleteOrder(orderid);
        return "index";
    }

    @RequestMapping("updateOrder")
    @ResponseBody
    public String updateOrder(int orderid,int orderstatus){
        orderService.updateOrder(orderid,orderstatus);
        return "index";
    }
}
