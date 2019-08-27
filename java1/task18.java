package java1;

import java.util.*;

public class task18 {

	public static void main(String[] args) {
		 
		Scanner console = new Scanner(System.in);
	    System.out.println("Input length of Rebro ->");
	    double r = console.nextDouble(); //r = rebro
	    double Sg = r*r; // площадь грани
	    double Sp = Sg * 6; // площадь поверхности
	    double V = Sg*r; // объем
	    System.out.println("S Грани " + Sg + "; S Поверхности " + Sp + "; Объем " + V); 
	}

}
