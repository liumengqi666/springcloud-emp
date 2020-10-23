package com.jk.controller;


import com.jk.entity.EmpEntity;
import com.jk.entity.OrderEntity;
import com.jk.entity.TypeEntity;
import com.jk.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {


    @Autowired
    private OrderService orderService;

    @RequestMapping("findOrder")
    public List<OrderEntity> findOrder() {

        return orderService.findOrder();
    }

        @RequestMapping("saveOrder")
        public void saveOrder(@RequestBody OrderEntity orderEntity){

            orderService.saveOrder(orderEntity);
        }


        @RequestMapping("deleteOrder")
    public void deleteOrder(@RequestParam Integer orderId){

            orderService.deleteOrder(orderId);
    }

    @RequestMapping("findById2")
    public OrderEntity findById2(@RequestParam Integer orderId){


        return  orderService.findById2(orderId);
    }


    @RequestMapping("findType")
    public List<TypeEntity> findType(){
        return orderService.findType();
    }
}
