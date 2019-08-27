package java1;

import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int T;
	    int s=0;//seconds
	    int m=0;//minutes
	    int h=0;//hour
	    System.out.println("input seconds -->");
	    T=console.nextInt();
	    if(T >= 60){
	      m=T/60;
	      T = T- m*60;
	    } if(m>=60){
	      h=m/60;
	      m = m - h*60;
	    }
	    s = T%60;
	    System.out.println(h + "ч");
	    System.out.println(m + "мин");
	    System.out.println(s + "c");

	}

}
