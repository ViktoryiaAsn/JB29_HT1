package java1;

import java.util.Scanner;

public class Task34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        long A = input.nextLong();
        long TByte = 1099511627776L;
        long GByte = 1073741824L;
        long MByte = 1048576;
        int KByte = 1024;
        long result;
        
        if (A>TByte){
            result = A / TByte;
            System.out.print(result + " TB ");
            A = A - (TByte*result);
        }
        if (A>GByte){
            result = A / GByte;
            System.out.print(result + " GB ");
            A = A - (GByte*result);
        }
        if (A>MByte){
            result = A / MByte;
            System.out.print(result + " MB ");
            A = A - (MByte*result);
        }
        if (A>KByte){
            result = A / KByte;
            System.out.print(result + " KB ");
            A = A - (KByte*result);
        }
      
        if (A > 0){
            System.out.println(A + " Bytes"); //check if there are bytes left
        }


	}

}
