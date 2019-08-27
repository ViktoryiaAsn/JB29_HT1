package java1;

import java.util.*;

public class Task19 {

	public static void main(String[] args) {


		double a = 3;
		double S;
		double h;
		double r; // радиус вписанной окружности
		double R; // радиус описанной окружности
		
		S = (Math.sqrt(3)/4)*a*a;
		System.out.println(S);
		
		h = (Math.sqrt(3)/2)*a;
		System.out.println(h);
		
		r = a/(2*(Math.sqrt(3)));
		System.out.println(r);
		
		R = a/(Math.sqrt(3));
		System.out.println(R);
		
	}

}
