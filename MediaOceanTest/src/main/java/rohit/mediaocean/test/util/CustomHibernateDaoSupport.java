package rohit.mediaocean.test.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public abstract class CustomHibernateDaoSupport extends HibernateDaoSupport
{
	@Autowired
	public void setHibernateSessionFactory(SessionFactory sessionFactory)
	{
		setSessionFactory(sessionFactory);
	}
}