package com.course.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
