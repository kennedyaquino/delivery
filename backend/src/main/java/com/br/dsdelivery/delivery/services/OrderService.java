package com.br.dsdelivery.delivery.services;

import com.br.dsdelivery.delivery.entities.Order;
import com.br.dsdelivery.delivery.entities.dto.OrderDTO;
import com.br.dsdelivery.delivery.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public List<OrderDTO> findAll() {
        List<Order> list = repository.findOrderWithProducts();
        return list.stream().map(order -> new OrderDTO(order)).collect(Collectors.toList());
    }
}
