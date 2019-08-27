package java1;

import static java.lang.Math.sin; 
import static java.lang.Math.cos; 
import static java.lang.Math.tan; 

public class Task10 {

	public static void main(String[] args) {
		int x = 20;
		int y = 4;
	
		double R; //Result
		
		R = ((sin(x) + cos(y))) / ((cos(x) - sin(y))) * tan(x * y);
		
		System.out.println(R);

	}

}
