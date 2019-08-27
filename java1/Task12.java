package java1;

import static java.lang.Math.sqrt;

public class Task12 {

	public static void main(String[] args) {
		double r;
		double x1 = 2;
		double x2 = 4;
		double y1 = 6;
		double y2 = 8;
		 

		
		 r = (((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
		
		
	
		System.out.println(Math.sqrt(x2 - x1) + "*" + Math.sqrt(y2 - y1) + "=" + r);
	}

}
