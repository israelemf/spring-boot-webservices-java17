package com.course.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.webservice.entities.Product;
import com.course.webservice.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository; // dependencia

	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
