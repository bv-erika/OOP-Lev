package estates;

import interfaces.Sellable;

public class House implements Sellable {

	private int price;
	private String currency;
	private String place;
	private int size;
	
	public House(String place, int size) {
		super();
		this.price = this.getDefPrice();
		this.currency = this.getDefCurrency();
		this.place = place;
		this.size = size;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "House [price=" + price + ", currency=" + currency + ", place=" + place + ", size=" + size + "]";
	}

	// Interface implementation
	public void setPrice(int price) {
		this.price = price;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
