package rohit.mediaocean.test.dao;

import rohit.mediaocean.test.model.Product;

public interface ProductDao {
	void delete(Product product);
	void save(Product product);
	void update(Product product);
}
