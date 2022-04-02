package base;

import base.derived.*;

public class CubeArray {

	Cube[] cubeArr;

	public CubeArray(int size) {
		super();
		cubeArr = new Cube[size];
	}
	
	public void setItem(int index, Cube c) {
		cubeArr[index] = c;
	}
	
	public int getArraySize() {
		return cubeArr.length;
	}
	
	public int getRealSize() {
		int counter = 0;
		for(int i = 0; i < cubeArr.length; i++) {
			if (cubeArr[i] != null)
				counter++;
		}
		return counter;
	}
	
	public Cube getItem(int index) {
		return cubeArr[index];
	}
	
	public double getAvgVolume() {
		double avg = 0;
		for(int i = 0; i < cubeArr.length; i++) {
			if (cubeArr[i] != null) {
				avg += cubeArr[i].getVolume();
			}
		}
		return avg/getRealSize();
	}
	
	public int getNumberOfCylinders() {
		int counter = 0;
		for(int i = 0; i < cubeArr.length; i++) {
			if (cubeArr[i] instanceof Cylinder)
				counter++;
		}
		return counter;
	}
	
	public int getNumberOfBricks() {
		int counter = 0;
		for(int i = 0; i < cubeArr.length; i++) {
			if (cubeArr[i] instanceof Brick)
				counter++;
		}
		return counter;
	}
}
