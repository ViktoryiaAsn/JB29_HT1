package java1;

import java.util.Scanner;


public class Task36 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int digit = input.nextInt();
        
        String digitToString = Integer.toString(digit);
        char[] num = digitToString.toCharArray(); //conversion from int to string, from string to char array
        
        if (num.length!=4){
            System.out.println("Input should contain 4 digits. Exit program");
            System.exit(0);
        }

        int even=1; int odd=1;
        for (int i=0;i<num.length;i++){
            //turn char into int
            int intConsidered = Character.getNumericValue(num[i]);
            //determine if it is even or odd with modulo operation
            if (intConsidered%2==0){
                even=even*intConsidered;
            }
            else {
                odd=odd* intConsidered;
            }
        }    
        System.out.println("even " + even);
        System.out.println("odd "+ odd);

        //perform the division
        float result = (float)even/(float)odd;
        System.out.println("result " + result);
    }
}
