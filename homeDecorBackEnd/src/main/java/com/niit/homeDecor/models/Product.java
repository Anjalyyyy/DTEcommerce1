package com.niit.homeDecor.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
@Component
public class Product 
{
	@Id
	private String id;
	private String name;
	private int price;
	private String description;
	
	@ManyToOne
	@JoinColumn(name="cid" , insertable=false, updatable=false, nullable=false)
	private Category category;
	private String cid;
	@ManyToOne
	@JoinColumn(name="sid",insertable=false, updatable=false, nullable=false)
	private Supplier supplier;
	private String sid;
	
	private int stock;
	
	public String getId() 
	{
		return id;
	}
	
	public void setId(String id) 
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getPrice() 
	{
		return price;
	}
	
	public void setPrice(int price) 
	{
		this.price = price;
	}
	
	public String getDescription() 
	{
		return description;
	}
	
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	public String getsid() 
	{
		return sid;
	}
	
	public void setsid(String sid) 
	{
		this.sid = sid;
	}
	
	public int getStock() 
	{
		return stock;
	}
	
	public void setStock(int stock) 
	{
		this.stock = stock;
	}

	public Category getCategory()
	{
		return category;
	}

	public void setCategory(Category category) 
	{
		this.category = category;
	}

	public Supplier getSupplier() 
	{
		return supplier;
	}

	public void setSupplier(Supplier supplier) 
	{
		this.supplier = supplier;
	}
	
	@Transient
	private MultipartFile image;

	public String getcid() {
		return cid;
	}

	public void setCategory_id(String cid) {
		this.cid = cid;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}
	
	
}