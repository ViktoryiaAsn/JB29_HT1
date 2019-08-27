package java1;

import static java.lang.Math.PI;
import static java.lang.Math.tan;
public class Task24 {

	public static void main(String[] args) {
		double a = 3;
		double b = 2;
		double alpha = Math.PI/4;
		double S;
		S = (a+b)*(a-b)*Math.tan(alpha)/4;
		System.out.println("S="+S);

	}

}
