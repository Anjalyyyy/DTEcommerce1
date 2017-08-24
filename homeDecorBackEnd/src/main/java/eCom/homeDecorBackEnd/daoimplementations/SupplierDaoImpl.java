package eCom.homeDecorBackEnd.daoimplementations;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import eCom.homeDecorBackEnd.daos.SupplierDao;
import eCom.homeDecorBackEnd.models.Supplier;

@Repository("SupplierDao")
public class SupplierDaoImpl implements SupplierDao
{
	@Autowired
	SessionFactory sessionFactory;
	public SupplierDaoImpl(SessionFactory sessionFactory)
	{
		
		this.sessionFactory=sessionFactory;
	}
	/*@Transactional*/
	public void insertSupplier(Supplier supplier)
	{
		
		Session session=sessionFactory.openSession();
	    session.beginTransaction();
	    session.persist(supplier);
	    session.getTransaction().commit();
	}
	public void deleteSupplier(int sid)
	{
		
		Session session=sessionFactory.openSession();
	    session.beginTransaction();
	    Supplier supplier=(Supplier)session.get(Supplier.class,sid);
	    session.delete(supplier);
	    session.getTransaction().commit();
	}
	public void updateSupplier(Supplier s)
	{
		
		Session session=sessionFactory.openSession();
		try
		{
	    session.beginTransaction();
	    session.update(s);
		}
		catch(HibernateException ex)
		{
			ex.printStackTrace();
			 session.getTransaction().rollback();
		}
	   
	}
}


