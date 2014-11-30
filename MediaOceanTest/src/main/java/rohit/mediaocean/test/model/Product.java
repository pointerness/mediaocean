package rohit.mediaocean.test.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
@Entity
@Table(name="ProductTable",uniqueConstraints={@UniqueConstraint(columnNames="ProductName")})
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4900185628679068235L;

	private int productID;
	private String productName;
	private Set<Sale> salesRecord;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	@Column(name="ProductID",unique=true,nullable=false)
	public int getProductID() {
		return productID;
	}
	@Column(name="ProductName",unique=true,nullable=false)
	public String getProductName() {
		return productName;
	}
	@OneToMany(fetch = FetchType.LAZY, targetEntity= Sale.class, mappedBy = "product")
	public Set<Sale> getSalesRecord() {
		return salesRecord;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setSalesRecord(Set<Sale> salesRecord) {
		this.salesRecord = salesRecord;
	}

}
