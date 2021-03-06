package com.sda.MyShoppingList.entities.order;

import com.sda.MyShoppingList.abstractclasses.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends AbstractService<Long, Order, OrderRepository> {

    public OrderService(OrderRepository repository) {
        super(repository);
    }
}
