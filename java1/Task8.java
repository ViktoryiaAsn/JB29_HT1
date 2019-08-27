package java1;

import static java.lang.Math.sqrt; 


public class Task8 {

	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		int c = 5;
		
		double R;
		
		R = (b + sqrt(b * b) + (4 * a * c)) / (2 * a) - (a * a * a) * c +  (b * b - 2);
		
		System.out.println(R);

	}
	

}
