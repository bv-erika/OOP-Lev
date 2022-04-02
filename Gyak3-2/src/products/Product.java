package products;

import interfaces.Sellable;

public class Product implements Sellable {
	private String name;
	private int netprice;
	private int taxrate;
	private String currency;
	
	public Product(String name, int taxrate) {
		super();
		this.name = name;
		this.netprice = this.getDefPrice();
		this.taxrate = taxrate;
		this.currency = this.getDefCurrency();
	}

	public double getPrice() {
		return netprice * taxrate / 100;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", netprice=" + netprice + ", taxrate=" + taxrate + ", currency=" + currency
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNetprice() {
		return netprice;
	}

	public void setNetprice(int netprice) {
		this.netprice = netprice;
	}

	public int getTaxrate() {
		return taxrate;
	}

	public void setTaxrate(int taxrate) {
		this.taxrate = taxrate;
	}
	
	// Interface implementations
	public void setPrice(int price) {
		setNetprice(price);
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
