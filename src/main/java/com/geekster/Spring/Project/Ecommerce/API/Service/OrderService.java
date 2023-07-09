package com.geekster.Spring.Project.Ecommerce.API.Service;

import com.geekster.Spring.Project.Ecommerce.API.Model.Orders;
import com.geekster.Spring.Project.Ecommerce.API.Repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    IOrderRepo iOrderRepo;

    public  Optional<Orders> getOrderById(Integer id) {
        return iOrderRepo.findById(id);
    }

    public String placeAnOrder(Orders orders) {
        iOrderRepo.save(orders);
        return "Order Placed";
    }

    public List<Orders> getAllOrders() {
        return (List<Orders>) iOrderRepo.findAll();
    }

    public String deleteOrderById(Integer id) {
        iOrderRepo.deleteById(id);

        return "Order Cancelled";
    }
}