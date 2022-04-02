package base;

public abstract class Cube {

	private int height;

	public Cube(int height) {
		super();
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public abstract double getArea();
	
	public double getVolume() {
		return getArea() * height;
	}
	
	public static int compareCubes(Cube c1, Cube c2) {
		if (c1.getVolume() > c2.getVolume())
			return 1;
		else if (c1.getVolume() < c2.getVolume())
			return -1;
		else
			return 0;
	}
	
	public boolean hasGreaterVolume(Cube other) {
		if (this.getVolume() > other.getVolume())
			return true;
		
		return false;
	}
	
}
