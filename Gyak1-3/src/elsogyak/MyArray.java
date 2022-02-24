package elsogyak;

import java.util.Scanner;

public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = readInt();
		//System.out.println("Size of array: " + size);
		int[] array = new int[size];
		
		//tömb feltöltése
		fillArray(array);
		//tömb kiírása
		printArray(array);
		
		//legnagyobb páros szám keresése
		if (findGreatestEven(array) < 0) {
			System.out.println("Even not found");
		}
		else {
			System.out.println("Greatest even number: " +
				array[findGreatestEven(array)] + 
				", index: " +
				findGreatestEven(array));
		}
		
		//prímszámok kiválogatása
		printArray(selectPrimes(array));
		
	}

	//prímszámok kiválogatása
	public static int[] selectPrimes(int[] array) {
		int counter = 0;
		for(int i = 0; i < array.length; i++) {
			if (checkPrime(array[i])) {
				counter++;
			}
		}
		int[] selection = new int[counter];
		for(int i = 0, j = 0; i < array.length; i++) {
			if (checkPrime(array[i])) {
				selection[j++] = array[i];
			}
		}
		return selection;
	}
	
	//prímvizsgálat
	public static boolean checkPrime(int num) {
		boolean prime = true;
		for(int div = 2; div < Math.sqrt(num); div++) {
			if (num % div == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
	
	//legnagyobb páros szám keresése
	public static int findGreatestEven(int[] array) {
		int i;
		for(i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				break;
			}
		}
		if (i < array.length) {
			int maxindex = i;
			for(int index = i; index < array.length; index++) {
				if (array[maxindex] < array[index] && 
					array[index] % 2 == 0) {
					maxindex = index;
				}	
			}
			return maxindex;
		}
		return -1;
	}
	
	//tömb feltöltése
	public static void fillArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			//1 és 50 közötti véletlenszámok
			array[i] = (int)(Math.random() * 50) + 1;
		}
	}
	
	//tömb kiírása
	public static void printArray(int[] array) {
		/*
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}*/
		for(int item : array) {
			System.out.print(item + ", ");
		}
		System.out.println();
	}
	
	//egész szám ellenőrzött beolvasása
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
