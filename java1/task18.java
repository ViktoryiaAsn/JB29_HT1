package java1;

import java.util.*;

public class task18 {

	public static void main(String[] args) {
		 
		Scanner console = new Scanner(System.in);
	    System.out.println("Input length of Rebro ->");
	    double r = console.nextDouble(); //r = rebro
	    double Sg = r*r; // ������� �����
	    double Sp = Sg * 6; // ������� �����������
	    double V = Sg*r; // �����
	    System.out.println("S ����� " + Sg + "; S ����������� " + Sp + "; ����� " + V); 
	}

}
