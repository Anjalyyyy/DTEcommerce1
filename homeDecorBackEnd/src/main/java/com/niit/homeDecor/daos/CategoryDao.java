package com.niit.homeDecor.daos;

import java.util.List;

import com.niit.homeDecor.models.Category;
import com.niit.homeDecor.models.Supplier;


public interface CategoryDao {
	public void insertCategory(Category category);
	public List<Category> getCategorys();


}
