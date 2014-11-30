package rohit.mediaocean.test.bo;


import java.util.List;

import rohit.mediaocean.test.model.Sale;

public interface SalesBo {
	void delete(Sale sales);
	public void generateSalesReport(String fileName);
	List<Sale>  getSalesByProductName(String productName);
	public void insertSalesData() ;
	void update(Sale sales);
}
