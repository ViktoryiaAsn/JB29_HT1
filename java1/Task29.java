package java1;

import static java.lang.Math.PI;
import static java.lang.Math.toRadians;
public class Task29 {

	public static void main(String[] args) {
		
		double a = 15;
		double b = 13;
		double c = 17;
		double ra; //radian
		double rb;
		double rc;
		double ga; //gradus
		double gb;
		double gc;
		  
		ra = Math.toRadians(a);
		rb = Math.toRadians(b);
		rc = Math.toRadians(c);
		ga = (ra * 180) / Math.PI;
		gb = (rb * 180) / Math.PI;
		gc = (rc * 180) / Math.PI;
		
        System.out.println("������ a(" + ra + ")=" +ga + "(�������� a)");
        System.out.println("������ b(" + rb + ")=" +gb + "(�������� b)");
        System.out.println("������ c(" + rc + ")=" +gc + "(�������� c)");

	}

}
