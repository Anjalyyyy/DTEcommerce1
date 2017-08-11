package com.niit.homeDecor.models;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
@Entity
@Table
@Component
public class Category 
{
	@Id
private String cid;
public String getCid() {
	return cid;
}
public void setCid(String cid) {
	this.cid = cid;
}

private String name;
private String description;
@OneToMany(mappedBy = "category", fetch=FetchType.EAGER)
private Set<Product> products;


public Set<Product> getProducts() {
return products;
}
public void setProducts(Set<Product> products) {
this.products = products;
}


public String getName() 
{
return name;
}

public void setName(String name) 
{
this.name = name;
}

public String getDescription() 
{
return description;
}

public void setDescription(String description) 
{
this.description = description;
}

}