package com.jk.mapper;

import com.jk.entity.OrderEntity;
import com.jk.entity.TypeEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper {
    @Select("select o.*,t.typeName typeName from jk_order2 o,jk_type2 t where o.typeId = t.typeId")
    List<OrderEntity> findOrder();

    @Insert("insert into jk_order2(number,orderName,orderPrice,orderDate,typeId) values(#{number},#{orderName},#{orderPrice},#{orderDate},#{typeId})")
    void saveOrder(OrderEntity orderEntity);
    @Update("update jk_order2 set number=#{number},orderName=#{orderName},orderPrice=#{orderPrice},orderDate=#{orderDate},typeId=#{typeId} where orderId =#{orderId}")
    void updateOrder(OrderEntity orderEntity);
    @Delete("delete from jk_order2 where orderId =#{orderId}")
    void deleteOrder(Integer orderId);
    @Select("select * from jk_order2 where orderId =#{orderId}")
    OrderEntity findById2(Integer orderId);
    @Select("select * from jk_type2")
    List<TypeEntity> findType();
}
