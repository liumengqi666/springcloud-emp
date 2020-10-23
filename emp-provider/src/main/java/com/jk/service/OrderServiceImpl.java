package com.jk.service;

import com.jk.entity.OrderEntity;
import com.jk.entity.TypeEntity;
import com.jk.mapper.EmpMapper;
import com.jk.mapper.OrderMapper;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderMapper orderMapper;


    @Override
    public List<OrderEntity> findOrder() {
        return orderMapper.findOrder();
    }

    @Override
    public void saveOrder(OrderEntity orderEntity) {
        if (orderEntity.getOrderId()==null){
            orderMapper.saveOrder(orderEntity);
        }else{
            orderMapper.updateOrder(orderEntity);
        }
    }

    @Override
    public void deleteOrder(Integer orderId) {
        orderMapper.deleteOrder(orderId);
    }

    @Override
    public OrderEntity findById2(Integer orderId) {
        return orderMapper.findById2(orderId);
    }

    @Override
    public List<TypeEntity> findType() {
        return orderMapper.findType();
    }
}
