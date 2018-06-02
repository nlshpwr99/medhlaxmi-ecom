package com.man.medhlaxmi.backend.dao;

import java.util.List;

import com.man.medhlaxmi.backend.dto.Category;

public interface CategoryDAO {

	
	
	Category get(int id);
	List<Category> list();
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
	
	
}
