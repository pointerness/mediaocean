package rohit.mediaocean.test.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import rohit.mediaocean.test.dao.SalesDao;
import rohit.mediaocean.test.model.Sale;
import rohit.mediaocean.test.util.CustomHibernateDaoSupport;
@Repository("salesDao")
public class SalesDaoImpl extends CustomHibernateDaoSupport implements SalesDao{

	public void delete(Sale sale) {
		getHibernateTemplate().delete(sale);
	}

	@SuppressWarnings("unchecked")
	public List<Sale> findByProductName(String productName) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Sale where product.productName=?",productName);
	}

	public List<Object[]> getSalesData() {
		// TODO Auto-generated method stub

		return getHibernateTemplate().find("select product.productName,count(product.productName),sum(saleAmount) from Sale group by product.productName");
	}

	public void save(Sale sale) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(sale);
	}

	public void update(Sale sale) {
		getHibernateTemplate().update(sale);
	}

}
