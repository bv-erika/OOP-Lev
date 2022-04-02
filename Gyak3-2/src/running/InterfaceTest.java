package running;

import estates.House;
import interfaces.Sellable;
import products.Book;

public class InterfaceTest {

	public static void main(String[] args) {
		Sellable s1 = new Book("book", 27, "x", "title", 2000, 300);
		Sellable s2 = new House("Miskolc", 100);
		
		//Állítsuk át a könyv árát
		System.out.println(s1);
		s1.setPrice(3500);
		System.out.println(s1);
		
		/*Deviza átváltás : ha változik a devizanem, 
		akkor számítsa át az árat*/
		
	}
}
