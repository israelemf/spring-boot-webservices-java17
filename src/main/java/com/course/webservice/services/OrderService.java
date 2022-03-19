package com.course.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.webservice.entities.Order;
import com.course.webservice.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository; // dependencia

	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
