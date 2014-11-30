package rohit.mediaocean.test.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SalesEntry")
public class Sale implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1318988233649271202L;

	private int salesID;
	private Date dateOfSale;
	private int saleAmount;
	private Product product;
	@Column(name="DateofSale")
	public Date getDateOfSale() {
		return dateOfSale;
	}
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ProductID")
	public Product getProduct() {
		return product;
	}
	@Column(name="SaleAmount")
	public int getSaleAmount() {
		return saleAmount;
	}
	@Id
	@Column(name="SalesId",unique=true,nullable=false)
	public int getSalesID() {
		return salesID;
	}
	public void setDateOfSale(Date dateOfSale) {
		this.dateOfSale = dateOfSale;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

	public void setSaleAmount(int saleAmount) {
		this.saleAmount = saleAmount;
	}
	public void setSalesID(int salesID) {
		this.salesID = salesID;
	}

}
