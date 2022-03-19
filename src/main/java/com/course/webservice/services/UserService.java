package com.course.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.webservice.entities.User;
import com.course.webservice.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository; // dependencia

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
