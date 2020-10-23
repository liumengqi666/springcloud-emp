package com.jk.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderEntity implements Serializable {

    private Integer orderId;
    private String number;
    private String orderName;
    private Integer orderPrice;
    private String orderDate;
    private Integer typeId;
    private String typeName;
}
