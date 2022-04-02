package interfaces;

public interface Sellable {

	public static int defaultprice = 1;
	public static String currency = "HUF";
	
	public void setPrice(int price);
	public void setCurrency(String currency);
	
	public default int getDefPrice() {
		return defaultprice;
	}
	public default String getDefCurrency() {
		return currency;
	}
	
}
