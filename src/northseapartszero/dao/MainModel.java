package northseapartszero.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class MainModel 
{
	@Autowired
	protected SessionFactory sessionFactory;

	public Session session() 
	{
		return sessionFactory.getCurrentSession();
	}

}
