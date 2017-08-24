package eCom.homeDecorBackEnd.daoimplementations;
import eCom.homeDecorBackEnd.models.*;
import eCom.homeDecorBackEnd.daos.*;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


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
	public void deleteCategory(int cid)
	{
		
		Session session=sessionFactory.openSession();
	    session.beginTransaction();
	    Category category=(Category)session.get(Category.class,cid);
	    session.delete(category);
	    session.getTransaction().commit();
	}
	public void updateCategory(Category c)
	{
		
		Session session=sessionFactory.openSession();
		try
		{
	    session.beginTransaction();
	    session.update(c);
		}
		catch(HibernateException ex)
		{
			ex.printStackTrace();
			 session.getTransaction().rollback();
		}
	   
	}

}
