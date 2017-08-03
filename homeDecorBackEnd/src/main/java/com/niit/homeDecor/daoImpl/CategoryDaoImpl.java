package com.niit.homeDecor.daoImpl;
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
	public CategoryDaoImpl(SessionFactory sessionFactory)
	{
		
		this.sessionFactory=sessionFactory;
	}
	public void insertCategory(Category category)
	{
		
		Session session=sessionFactory.openSession();
	    session.beginTransaction();
	    session.saveOrUpdate(category);
	    session.getTransaction().commit();
	}
	

}
