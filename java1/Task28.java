package java1;


import java.text.NumberFormat;
import static java.lang.Math.PI;

public class Task28 {

	public static void main(String[] args) {
		
		
		double a = 5; // радиана
        double g = (a * 180) / Math.PI; //перевод из радиан в градусы
        int gr = (int) g;
        double min = (g * 60) % 60; // перевод в минуты
        int m = (int) min;
        int sec = (int) (min * 60) % 60; // перевод в секунды
        System.out.println("радиан(" + a + ")=" +gr + "(градусов)" + "=" + m + "(минут)" + "=" + sec + "(секунд)");

	}

}
