package com.ytc.Service;

import com.ytc.model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Component
@FeignClient(value = "teach-provider-order")
public interface OrderService {
    @GetMapping("AllOrder")
    List<Order> AllOrder();

    @RequestMapping("addOrder")
    @ResponseBody
    void addOrder(Order order);

    @RequestMapping("deleteOrder")
    @ResponseBody
    void deleteOrder(@RequestParam("orderid") int orderid);

    @RequestMapping("updateOrder")
    @ResponseBody
    void updateOrder(@RequestParam("orderid") int orderid, @RequestParam("orderstatus") int orderstatus);
}
