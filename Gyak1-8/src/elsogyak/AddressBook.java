package elsogyak;

import java.util.Scanner;

/**
 * Feladatleírás: telefonkönyv nyilvántartása
 * @author erika
 * @version 1.0
 *
 */
public class AddressBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int size = readInt();
		String[][] myAddressBook = new String[size][];
		
		for(int i = 0; i < myAddressBook.length; i++) {
			System.out.println("Name: ");
			String name = input.nextLine();
			System.out.println("Email addresses: ");
			int numOfEmails = readInt();
			myAddressBook[i] = new String[numOfEmails+1];
			myAddressBook[i][0] = name;
			for(int j = 1; j <= numOfEmails; j++) {
				System.out.print("Email: ");
				myAddressBook[i][j] = input.nextLine();
			}
		}
		
		printArray(myAddressBook);
		
		//azonos nevűek keresése
		int counter = 0;
		for(int i = 0; i < myAddressBook.length-1; i++) {
			for(int j = i+1; j < myAddressBook.length; j++) {
				if (myAddressBook[i][0].equals(myAddressBook[j][0])) {
					counter++;
				}
			}
		}
		System.out.println(counter);
		
		//azonos kezdőbetűsek keresése
		counter = 0;
		for(int i = 0; i < myAddressBook.length-1; i++) {
			for(int j = i+1; j < myAddressBook.length; j++) {
				if (myAddressBook[i][0].charAt(0) == myAddressBook[j][0].charAt(0)) {
					counter++;
				}
			}
		}
		System.out.println(counter);
		
	}

	public static void printArray(String[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + ", ");
			}
			System.out.println();
		}
	}
	
	public static int readInt() {
		Scanner input = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("Give a number: ");
			while(!input.hasNextInt()) {
				System.out.println("Not a number");
				input.next();
			}
			n = input.nextInt();
		} while(n < 1 || n > 10);
		
		return n;
	}
}
