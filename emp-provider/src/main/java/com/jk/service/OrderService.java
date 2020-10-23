package com.jk.service;

import com.jk.entity.OrderEntity;
import com.jk.entity.TypeEntity;

import java.util.List;

public interface OrderService {
    List<OrderEntity> findOrder();

    void saveOrder(OrderEntity orderEntity);

    void deleteOrder(Integer orderId);

    OrderEntity findById2(Integer orderId);

    List<TypeEntity> findType();
}
