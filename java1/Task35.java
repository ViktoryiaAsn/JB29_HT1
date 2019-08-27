package java1;

import java.util.Scanner;

public class Task35 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int M=input.nextInt();
        int N=input.nextInt();


        float result = (float)M/(float)N;
        System.out.println("Division result: " + result);
        
        String floatToString = Float.toString(result); //Convert float to string and then string to char array
        
        char[] parse = floatToString.toCharArray();

        for (int i=0;i<parse.length;i++){
            if (parse[i]=='.'){
                System.out.println("least significant digit of the whole: " + parse[i-1]); 
                System.out.println("most significant digit of the fraction: " + parse [i+1]);
            }
        }
    }




	}


