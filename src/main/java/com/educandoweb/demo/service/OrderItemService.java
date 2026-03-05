package com.educandoweb.demo.service;

import com.educandoweb.demo.entities.OrderItem;
import com.educandoweb.demo.repositories.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {
    @Autowired
    private OrderItemRepository orderItemRepository;

    public List<OrderItem> findAll(){
       return orderItemRepository.findAll();
    }
    public OrderItem findById(long id){
        Optional<OrderItem> optionalOrderItem = orderItemRepository.findById(id);
         return optionalOrderItem.get();
    }
}
