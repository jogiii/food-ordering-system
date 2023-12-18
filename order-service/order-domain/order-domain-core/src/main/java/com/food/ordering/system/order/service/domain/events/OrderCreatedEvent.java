package com.food.ordering.system.order.service.domain.events;

import com.food.ordering.system.domain.event.DomainEvent;
import com.food.ordering.system.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderCreatedEvent extends OrderEvent {


    public OrderCreatedEvent(Order order, ZonedDateTime zonedDateTime) {
        super(order, zonedDateTime);
    }
}
