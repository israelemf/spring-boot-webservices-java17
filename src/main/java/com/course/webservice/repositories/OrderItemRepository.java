package com.course.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
