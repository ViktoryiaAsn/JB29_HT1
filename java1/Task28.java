package java1;


import java.text.NumberFormat;
import static java.lang.Math.PI;

public class Task28 {

	public static void main(String[] args) {
		
		
		double a = 5; // �������
        double g = (a * 180) / Math.PI; //������� �� ������ � �������
        int gr = (int) g;
        double min = (g * 60) % 60; // ������� � ������
        int m = (int) min;
        int sec = (int) (min * 60) % 60; // ������� � �������
        System.out.println("������(" + a + ")=" +gr + "(��������)" + "=" + m + "(�����)" + "=" + sec + "(������)");

	}

}
