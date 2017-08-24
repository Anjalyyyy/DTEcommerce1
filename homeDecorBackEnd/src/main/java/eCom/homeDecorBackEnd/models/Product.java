package eCom.homeDecorBackEnd.models;

import java.io.Serializable;
import java.util.function.Supplier;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Repository;

import eCom.homeDecorBackEnd.daos.CategoryDao;
import eCom.homeDecorBackEnd.models.Category;

@SuppressWarnings("deprecations")
@Repository("UserDao")


public class Product implements Serializable
 {

	private static final long serialVersionUID=1L;
	@Id
	private int id;
	private String name;
	private String description;
	private float price;
	private int stock;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cid")
    private  Category category;
	@ManyToOne
	@JoinColumn(name="pid")
	private Supplier supplier;
	/*@Transient
	MultipartFile pimage;
	private String imgname;*/
 }
	
	
	
	
	
	