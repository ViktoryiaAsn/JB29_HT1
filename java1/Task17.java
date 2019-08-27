package java1;

import static java.lang.Math.sqrt;

public class Task17 {

	public static void main(String[] args) {
		 int a = 2;
		 
	      int b = 4;
	      int s;
	     
	      s = ((a * a * a) + (b * b * b)) / 2;
	   
	      System.out.println(((a + "*" + a + "*" + a) + "+" +  (b + "*" + b + "*" + b )) + "/" + 2 + "=" + s); // среднее арифметическое
	      
	      System.out.println((Math.sqrt(Math.abs(a)*Math.abs(b)))); // среднее геометрическое модулей

	}

}
