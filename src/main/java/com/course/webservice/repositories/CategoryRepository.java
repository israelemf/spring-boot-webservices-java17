package com.course.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
