package rohit.mediaocean.test.dao;

import java.util.List;

import rohit.mediaocean.test.model.Sale;



public interface SalesDao {
	void delete(Sale sale);

	List<Sale>  findByProductName(String productName);
	List<Object[]> getSalesData();
	void save(Sale sale);

	void update(Sale sale);
}
