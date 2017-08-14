package com.niit.homeDecor.daoImpl;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.homeDecor.daos.ProductDao;
import com.niit.homeDecor.models.Category;
import com.niit.homeDecor.models.Product;

@Repository("ProductDao")
public class ProductDaoImpl implements ProductDao
{
	@Autowired
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*@Transactional*/
	public void insertProduct(Product product)
	{
		
		Session session=sessionFactory.openSession();
	    session.beginTransaction();
	    session.persist(product);
	    session.getTransaction().commit();
	}
	public List<Product> getProducts() {
		 
		System.out.print("hai in product impl");
		Session session=sessionFactory.openSession();
	    session.beginTransaction();
	   List<Product> product=session.createCriteria(Product.class).list();
	    	    
	    session.getTransaction().commit();
		return product;
	}


	
	
}
