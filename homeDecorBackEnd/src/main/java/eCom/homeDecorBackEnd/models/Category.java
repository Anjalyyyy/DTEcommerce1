package eCom.homeDecorBackEnd.models;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import eCom.homeDecorBackEnd.models.*;
import eCom.homeDecorBackEnd.daos.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.io.Serializable;


@Entity//for creating table
@Table(name="Category")

public class Category implements Serializable {
	@Id
	private int cid;
	private String name;
	@OneToMany(targetEntity=Product.class,fetch=FetchType.EAGER,mappedBy="category")
	private Set<Product> products=new HashSet<Product>(0);
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Set<Product> getProducts()
	{
		return products;
	}
	

}
