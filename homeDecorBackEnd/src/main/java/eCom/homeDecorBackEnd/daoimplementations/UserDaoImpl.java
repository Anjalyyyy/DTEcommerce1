package eCom.homeDecorBackEnd.daoimplementations;
import eCom.homeDecorBackEnd.models.User;
import eCom.homeDecorBackEnd.daos.UserDao;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("UserDao")
public class UserDaoImpl implements UserDao{
	
	@Autowired
	SessionFactory sessionFactory;
	public UserDaoImpl(SessionFactory sessionFactory)
	{
		super();
		this.sessionFactory=sessionFactory;
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
