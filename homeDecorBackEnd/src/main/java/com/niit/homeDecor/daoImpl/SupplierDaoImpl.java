package com.niit.homeDecor.daoImpl;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.homeDecor.daos.SupplierDao;
import com.niit.homeDecor.models.Supplier;
import com.niit.homeDecor.models.User;

@Repository("SupplierDao")
public class SupplierDaoImpl implements SupplierDao
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
	public void insertSupplier(Supplier supplier)
	{
		
		Session session=sessionFactory.openSession();
	    session.beginTransaction();
	    session.persist(supplier);
	    session.getTransaction().commit();
	}
	public List<Supplier> getSuppliers() {
		 
		System.out.print("hai in supplier impl");
		Session session=sessionFactory.openSession();
	    session.beginTransaction();
	   List<Supplier> supplier=session.createCriteria(Supplier.class).list();
	    	    
	    session.getTransaction().commit();
		return supplier;
	}

	public Supplier getSupplier(String sid) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
	    session.beginTransaction();
	   Supplier supplier=(Supplier) session.get(Supplier.class,sid);
	    	    
	    session.getTransaction().commit();
		return supplier;
	}


	
	
}


