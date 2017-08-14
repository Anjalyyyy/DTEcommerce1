package com.niit.homeDecor.daos;

import java.util.List;

import com.niit.homeDecor.models.Product;


public interface ProductDao {
	public void insertProduct(Product product);
	public List<Product> getProducts();

}
