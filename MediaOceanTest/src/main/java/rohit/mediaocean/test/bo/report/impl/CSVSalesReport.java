package rohit.mediaocean.test.bo.report.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import rohit.mediaocean.test.bo.report.SalesReport;

public class CSVSalesReport implements SalesReport{
	private String csvFile=null;
	private void generateCsvFile(List<Object[]>dataList)
	{
		try
		{
			FileWriter writer = new FileWriter(csvFile);

			writer.append("Product Name");
			writer.append(',');
			writer.append("Sales Count");
			writer.append(',');
			writer.append("Sales Amount");
			writer.append('\n');


			for(Object[] arr: dataList)
			{
				for(Object object:arr)
				{
					writer.append(object.toString());
					writer.append(",");
				}
				writer.append('\n');
			}
			writer.flush();
			writer.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	public void generateReport(List<Object[]> list) {
		generateCsvFile(list);
	}

	public String getCsvFile() {
		return csvFile;
	}

	public void setCsvFile(String csvFile) {
		this.csvFile = csvFile;
	}

}
