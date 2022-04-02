package base.derived;

import base.Cube;

public class Brick extends Cube {

	private int sideA;
	private int sideB;

	public Brick(int height, int sideA, int sideB) {
		super(height);
		this.sideA = sideA;
		this.sideB = sideB;
	}

	public int getSideA() {
		return sideA;
	}
	
	public void setSideA(int sideA) {
		this.sideA = sideA;
	}

	public int getSideB() {
		return sideB;
	}

	public void setSideB(int sideB) {
		this.sideB = sideB;
	}

	@Override
	public double getArea() {
		return sideA * sideB;
	}

	@Override
	public String toString() {
		return "Brick [sideA=" + sideA + ", sideB=" + sideB + ", getArea()=" + getArea() + ", getHeight()="
				+ getHeight() + ", getVolume()=" + getVolume() + "]";
	}

	public boolean equals(Brick other) {
		if (this.sideA == other.sideA &&
				this.sideB == other.sideB &&
				this.getHeight() == other.getHeight())
			return true;
		
		return false;
	}
}
