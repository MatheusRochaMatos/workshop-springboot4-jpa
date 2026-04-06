package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;

@Service
public class CategoryService {
	
	@Autowired
	private com.educandoweb.course.repositories.CategoryRepository CategoryRepository;
	
	public List<Category> findAll(){
		return CategoryRepository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = CategoryRepository.findById(id);
		return obj.get();
	}
	
}
