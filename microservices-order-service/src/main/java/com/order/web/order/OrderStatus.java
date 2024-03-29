package com.order.web.order;

/**
 * Describes the state of an {@link Order}.
 *
 * @author Kenny Bastani
 */
public enum OrderStatus {
    PURCHASED,
    PENDING,
    CONFIRMED,
    SHIPPED,
    DELIVERED
}
