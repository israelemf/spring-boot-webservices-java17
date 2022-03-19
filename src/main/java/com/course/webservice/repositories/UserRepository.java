package com.course.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
