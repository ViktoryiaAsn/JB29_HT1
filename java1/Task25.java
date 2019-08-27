package java1;

import static java.lang.Math.sqrt;
public class Task25 {

	public static void main(String[] args) {
		
         double a = 1;
         double b = -7;
         double c = 6;
         double x; // корень 
         double y; // корень 
         double z; // корень
         double D; // дискриминант
         
         
         D = b * b - 4 * a * c;
         
         if (D > 0) {

        	    x = (-b - Math.sqrt(D)) / (2 * a);
        	    y = (-b + Math.sqrt(D)) / (2 * a);
        	    System.out.println(" орни уравнени€: x = " + x + ", y = " + y);
        	}
        	else if (D == 0) {
        	   
        	    z = -b / (2 * a);
        	    System.out.println("”равнение имеет единственный корень: z = " + z);
        	}
        	else {
        	    System.out.println("”равнение не имеет действительных корней!");

		
	}

	}
}
