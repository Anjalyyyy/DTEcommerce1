package com.niit.homeDecor.daos;

import java.util.List;

import com.niit.homeDecor.models.Category;

public interface CategoryDao {
	public void insertCategory(Category category);
	public List<Category> getCategorys();


}
