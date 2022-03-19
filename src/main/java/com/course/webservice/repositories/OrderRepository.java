package com.course.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
