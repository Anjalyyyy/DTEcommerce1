package eCom.homeDecorBackEnd.models;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity//for creating table
@Table(name="Supplier")

public class Supplier implements Serializable {
	@Id
	private int sid;
	private String supplierName;
	@OneToMany(targetEntity=Product.class,fetch=FetchType.EAGER,mappedBy="category")
	private Set<Product> product=new HashSet<Product>(0);
	public int getsid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setsupplierName(String supplierName) {
		this.supplierName =supplierName;
	}

	public Set<Product> getProduct()
	{
		return product;
	}
	

}
