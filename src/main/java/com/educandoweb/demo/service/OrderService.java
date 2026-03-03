package com.educandoweb.demo.service;

import com.educandoweb.demo.entities.Order;
import com.educandoweb.demo.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository OrderRepository;

    public List<Order> findAll(){
       return OrderRepository.findAll();
    }
    public Order findById(long id){
        Optional<Order> optionalOrder = OrderRepository.findById(id);
         return optionalOrder.get();
    }
}
