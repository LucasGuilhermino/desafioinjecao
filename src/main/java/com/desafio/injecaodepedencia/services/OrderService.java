package com.desafio.injecaodepedencia.services;

import com.desafio.injecaodepedencia.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public double total(Order order){
        double discountValue = order.getBasic() * order.getDiscount()/100  ;
        return order.getBasic() - discountValue + shippingService.shipment(order);
    }
}
