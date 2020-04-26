package net.hoss.shopingbackend.dao;

import java.util.List;

import net.hoss.shopingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();

	Category get(int id);
	
	
	

}
