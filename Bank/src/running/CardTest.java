package running;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import base.Card;
import base.Card.Bank;
import base.CreditCard;

public class CardTest {

	public static void main(String[] args) {
		
		// Fix méretű tömb
		int size = readInt();
		Card[] array = new Card[size];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = createCard();
			System.out.println(array[i]);
		}
		System.out.println();
		
		// Tömb rendezése
		Arrays.sort(array, Comparator.comparing(Card::getValidity));
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		
		// Dinamikus tömb
		ArrayList<Card> list = createList();
		int i = 10;
		for(Card item : list) {
			System.out.println(item);
			// 3. feladat
			item.withdraw(5000*i++);
			System.out.println(item);
		}
		System.out.println();
		
		// 4. feladat
		System.out.println("CIB kártyák száma: " + countCard(list, "otp"));
		
		// 5. feladat - dinamikus tömb rendezése Java8 Comparatorral
		list.sort(Comparator.comparing(Card::getOwner));
		for(Card item : list) {
			System.out.println(item);
		}
		
	}
	
	public static int countCard(ArrayList<Card> list, String bankstr) {
		int counter = 0;
		for(int i = 0; i < list.size(); i++) {
			if (list.get(i).getBank() == Bank.valueOf(bankstr.toUpperCase()))
				counter++;
		}
		return counter;
	}
	
	public static int readInt() {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("Adj meg egy számot: ");
			while(!sc.hasNextInt()) {
				sc.nextLine();
			}
			num = sc.nextInt();
			//sc.next();
		} while(num < 1 || num > 10);
		return num;
	}
	
	public static Card createCard() {
		Card newcard = null;
		
		try {
				InputStreamReader stdinReader = new InputStreamReader(System.in);
				BufferedReader reader = new BufferedReader(stdinReader);
				
				System.out.println("Tulajdonos: ");
				String name = reader.readLine();
				
				System.out.println("Érvényesség: ");
				String[] date = reader.readLine().split("-");
				int year = Integer.parseInt(date[0]);
				int month = Integer.parseInt(date[1]);
				int day = Integer.parseInt(date[2]);
				
				System.out.println("Bank: ");
				String bankstr = reader.readLine().toUpperCase();
				Bank bank = Bank.valueOf(bankstr);
				
				System.out.println("Induló egyenleg: ");
				int balance = Integer.parseInt(reader.readLine());
				
				System.out.println("Hitelkeret: ");
				int credit = Integer.parseInt(reader.readLine());
				
				//Ha a hitelkeret 0, akkor sima bankkártya, egyébként hitelkártya
				if (credit <= 0)
					newcard = new Card(name, LocalDate.of(year, month, day), bank, balance);
				else
					newcard = new CreditCard(name, LocalDate.of(year, month, day), bank, balance, credit);
			
			} catch (NumberFormatException e) {
				System.out.println("Cannot convert string to number");
			} catch (IOException e) {
				System.out.println("Error in reading file...");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
		return newcard;
	}
	
	public static ArrayList<Card> createList() {
		
		ArrayList<Card> mylist = new ArrayList<Card>();
		
		Card newcard = null;
		String line;
		try ( FileReader fileReader = new FileReader("data.txt");
				BufferedReader reader = new BufferedReader(fileReader))
			{
				while ((line = reader.readLine()) != null) {
					String[] row = line.split(",");
					
					String[] date = row[1].split("-");
					int year = Integer.parseInt(date[0]);
					int month = Integer.parseInt(date[1]);
					int day = Integer.parseInt(date[2]);
					
					Bank bank = Bank.valueOf(row[2]);
					
					int balance = Integer.parseInt(row[3]);
					
					// Ha egy sorban 4 adat van, akkor bankkártya, egyébként hitelkártya
					if (row.length == 4)
						newcard = new Card(row[0], LocalDate.of(year, month, day), bank, balance);
					else {
						int credit = Integer.parseInt(row[4]);
						newcard = new CreditCard(row[0], LocalDate.of(year, month, day), bank, balance, credit);
					}
						
					mylist.add(newcard);
				}
				
			} catch (NumberFormatException e) {
				System.out.println("Cannot convert string to number");
			} catch (IOException e) {
				System.out.println("Error in reading file...");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
		return mylist;
	}

}
