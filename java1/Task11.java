package java1;

import static java.lang.Math.sqrt;
public class Task11 {

	public static void main(String[] args) {
		int s;
		int p;
		int a = 8;
		int b = 4;
		 

		
		 s = (a * b / 2);
		 p = (a + b + (a * a) + (b * b));
		
		
		System.out.println(a + "*" + b + "/" + 2 + "=" + s);
		System.out.println(a + b + Math.sqrt(a * a + b * b) + "=" + p);
	}

}
