package rohit.mediaocean.test.bo.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rohit.mediaocean.test.bo.SalesBo;
import rohit.mediaocean.test.bo.report.SalesReport;
import rohit.mediaocean.test.bo.report.impl.CSVSalesReport;
import rohit.mediaocean.test.constants.CellPhone;
import rohit.mediaocean.test.dao.ProductDao;
import rohit.mediaocean.test.dao.SalesDao;
import rohit.mediaocean.test.model.Product;
import rohit.mediaocean.test.model.Sale;
@Service("salesBo")
public class SalesBoImpl implements SalesBo {
	@Autowired
	ProductDao productDao;
	@Autowired
	SalesDao salesDao;
	public void delete(Sale sales) {
		// TODO Auto-generated method stub
		salesDao.delete(sales);
	}

	public void generateSalesReport(String fileName) {
		List<Object[]> list =salesDao.getSalesData();
		SalesReport salesReport = new CSVSalesReport();
		((CSVSalesReport)salesReport).setCsvFile(fileName);
		salesReport.generateReport(list);
	}


	public List<Sale> getSalesByProductName(String productName) {
		// TODO Auto-generated method stub
		return salesDao.findByProductName(productName);
	}

	public void insertSalesData() {
		for(CellPhone phone:CellPhone.values())
		{
			Product product = new Product();
			product.setProductName(phone.getManufacturerName());
			productDao.save(product);
			for(int amount = 10; amount<=100;amount+=10)
			{
				Sale sale =  new Sale();
				sale.setDateOfSale(new Date());
				sale.setProduct(product);
				sale.setSaleAmount(amount);
				salesDao.save(sale);
			}
		}

	}

	public void update(Sale sale) {
		salesDao.update(sale);
	}

}
