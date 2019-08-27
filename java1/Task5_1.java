package java1;
import java.util.Scanner; 

public class Task5_1 {

	public static void main(String[] args) {
		
		Scanner input = new
				Scanner(System.in);
		float num1 = input.nextFloat ();
		float num2 = input.nextFloat ();
		
		float result = (num1+num2)/2;
		System.out.println("number 1:" + num1);
		System.out.println("number 2:" + num2);
		System.out.println("average of number 1 + number 2:" + result);
		
		

	}

}

