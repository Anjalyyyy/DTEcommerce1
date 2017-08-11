package com.niit.homeDecor.models;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class Supplier 
{
	@Id	
	private String sid;
	private String name;
	private String address;
	@OneToMany(mappedBy = "supplier", fetch=FetchType.EAGER)
	private Set<Product> products;

	
	public Set<Product> getProducts() {
	return products;
	}
	public void setProducts(Set<Product> products) {
	this.products = products;
	}
	
	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getAddress() 
	{
		return address;
	}
	
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
}