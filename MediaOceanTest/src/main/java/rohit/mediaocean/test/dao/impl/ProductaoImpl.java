package rohit.mediaocean.test.dao.impl;

import org.springframework.stereotype.Repository;

import rohit.mediaocean.test.dao.ProductDao;
import rohit.mediaocean.test.model.Product;
import rohit.mediaocean.test.util.CustomHibernateDaoSupport;
@Repository("productDao")
public class ProductaoImpl extends CustomHibernateDaoSupport implements ProductDao {

	public void delete(Product product) {
		getHibernateTemplate().delete(product);
	}

	public void save(Product product) {
		getHibernateTemplate().save(product);
	}

	public void update(Product product) {
		getHibernateTemplate().update(product);
	}


}
