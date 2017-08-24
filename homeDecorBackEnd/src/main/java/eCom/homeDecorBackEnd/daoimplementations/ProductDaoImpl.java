package eCom.homeDecorBackEnd.daoimplementations;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import eCom.homeDecorBackEnd.daos.ProductDao;
import eCom.homeDecorBackEnd.models.Product;

@Repository("ProductDao")
public class ProductDaoImpl implements ProductDao
{
	@Autowired
	SessionFactory sessionFactory;
	public ProductDaoImpl(SessionFactory sessionFactory)
	{
		
		this.sessionFactory=sessionFactory;
	}
	/*@Transactional*/
	public void insertProduct(Product product)
	{
		
		Session session=sessionFactory.openSession();
	    session.beginTransaction();
	    session.persist(product);
	    session.getTransaction().commit();
	}
	public void deleteProdct(int pid)
	{
		
		Session session=sessionFactory.openSession();
	    session.beginTransaction();
	    Product product=(Product)session.get(Product.class,pid);
	    session.delete(product);
	    session.getTransaction().commit();
	}
	public void updateProduct(Product p)
	{
		
		Session session=sessionFactory.openSession();
		try
		{
	    session.beginTransaction();
	    session.update(p);
		}
		catch(HibernateException ex)
		{
			ex.printStackTrace();
			 session.getTransaction().rollback();
		}
	   
	}
	
}
