package com.shopping.web.order;

import java.io.Serializable;

import com.shopping.web.domain.BaseEntity;

public class OrderEvent extends BaseEntity implements Serializable {

    private String id;
    private OrderEventType type;
    private String orderId;

    public OrderEvent() {
    }

    public OrderEvent(OrderEventType type, String orderId) {
        this.type = type;
        this.orderId = orderId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OrderEventType getType() {
        return type;
    }

    public void setType(OrderEventType type) {
        this.type = type;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "OrderEvent{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", orderId='" + orderId + '\'' +
                "} " + super.toString();
    }
}
