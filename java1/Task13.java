package java1;

import static java.lang.Math.sqrt;

public class Task13 {

	public static void main(String[] args) {
		double S;
		double P;
		double a;
		double b;
		double c;
		int x1 = 1;
		int x2 = 3;
		int x3 = 4;
		int y1 = 6;
		int y2 = 5;
		int y3 = 6;
		 a = sqrt((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
		 b = sqrt((x3 - x2) * (x3 - x2)) + ((y3 - y2) * (y3 - y2));
		 c = sqrt((x3 - x1) * (x3 - x1)) + ((y3 - y1) * (y3 - y1));
		
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);

		 P = (a + b + c);
		 
		 System.out.println("Perimeter = " + P);
		 
		 S = 0.5 * (x1 * (y2 - y3) + (x2 * (y3 - y1)) + (x3 * (y1 - y2)));
		 
		 System.out.println("Square = " + S);
		 
	}

}
