package running;

import base.*;
import base.derived.*;

public class CubeTest {

	public static void main(String[] args) {
		
		Cube c1 = new Cylinder(10, 5);
		Cube c2 = new Brick(10, 3, 6);
		//Cube c3 = c1;
		Cylinder c4 = new Cylinder(10, 5);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(Cube.compareCubes(c1, c2));
		System.out.println(c1.hasGreaterVolume(c2));
		System.out.println(c4.equals(c1));
		
	}

}
