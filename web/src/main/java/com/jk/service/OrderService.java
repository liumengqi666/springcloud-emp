package com.jk.service;

import com.jk.entity.OrderEntity;
import com.jk.entity.TypeEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("emp-provider")
public interface OrderService {
    @RequestMapping("findOrder")
    public List<OrderEntity> findOrder();

    @RequestMapping("saveOrder")
    public void saveOrder(@RequestBody OrderEntity orderEntity);

    @RequestMapping("deleteOrder")
    public void deleteOrder(@RequestParam Integer orderId);

    @RequestMapping("findById2")
    public OrderEntity findById2(@RequestParam Integer orderId);

    @RequestMapping("findType")
    public List<TypeEntity> findType();
}
