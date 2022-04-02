package running;

import base.CubeArray;
import base.derived.*;

public class CubeArrayTest {

	public static void main(String[] args) {
		
		CubeArray myArray = new CubeArray(5);
		
		for(int i = 0; i < myArray.getArraySize(); i++) {
			int option = (int)(Math.random() * 3) + 1;
			switch(option) {
				case 1: 
					double radius = Math.random() * 10 + 1;
					int height = 10;
					myArray.setItem(i, new Cylinder(height,radius));
					break;
				case 2: 
					int sideA = (int)(Math.random() * 10) + 1;
					int sideB = (int)(Math.random() * 10) + 1;
					height = 5;
					myArray.setItem(i, new Brick(height,sideA,sideB));
					break;
				case 3:
					myArray.setItem(i, null);
			}
		}
		
		System.out.println("Num of items: " + myArray.getRealSize());
		System.out.println("Num of cylinders: " + myArray.getNumberOfCylinders());
		System.out.println("Num of bricks: " + myArray.getNumberOfBricks());
		System.out.println("Avg volume: " + myArray.getAvgVolume());
		
		for(int i = 0; i < myArray.getArraySize(); i++) {
			System.out.println(myArray.getItem(i));
		}
		
	}

}
