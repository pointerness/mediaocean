package rohit.mediaocean.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import rohit.mediaocean.test.bo.SalesBo;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main( String[] args )
	{

		ApplicationContext appContext =
				new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");

		SalesBo salesBo =  (SalesBo) appContext.getBean("salesBo");
		//Run this only once  to generate test data for the exercise
		//salesBo.insertSalesData();
		salesBo.generateSalesReport(args[0]);
		((ClassPathXmlApplicationContext)appContext).close();
	}


}
