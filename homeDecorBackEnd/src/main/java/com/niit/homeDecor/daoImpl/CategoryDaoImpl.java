package com.niit.homeDecor.daoImpl;
import java.util.List;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.homeDecor.daos.*;
import com.niit.homeDecor.models.*;


@Repository("CategoryDao")
public class CategoryDaoImpl implements CategoryDao
{

	@Autowired
	SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public void insertCategory(Category category)
	{
		
		Session session=sessionFactory.openSession();
	    session.beginTransaction();
	    session.saveOrUpdate(category);
	    session.getTransaction().commit();
	}
	public List<Category> getCategorys() {
		 
		System.out.print("hai in category impl");
		Session session=sessionFactory.openSession();
	    session.beginTransaction();
	   List<Category> category=session.createCriteria(Category.class).list();
	    	    
	    session.getTransaction().commit();
		return category;
	}


	

	

}
