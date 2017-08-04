package com.niit.homeDecor.daoImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.homeDecor.daos.UserDao;
import com.niit.homeDecor.models.User;



@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	SessionFactory sessionFactory;
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	public void insertUser(User user)
	{
		System.out.print("hai in user impl");
		Session session=sessionFactory.openSession();
	    session.beginTransaction();
	    session.saveOrUpdate(user);
	    session.getTransaction().commit();
	}
	

}
