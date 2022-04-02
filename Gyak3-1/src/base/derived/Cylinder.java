package base.derived;

import base.Cube;

public class Cylinder extends Cube {

	private double radius;
	
	public Cylinder(int height, double radius) {
		super(height);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public String toString() {
		return "Cylinder [radius=" + radius + ", getArea()=" + getArea() + ", getHeight()=" + getHeight()
				+ ", getVolume()=" + getVolume() + "]";
	}
	
	public boolean equals(Cylinder other) {
		if (this.radius == other.radius &&
				this.getHeight() == other.getHeight())
			return true;
		
		return false;
	}

}
