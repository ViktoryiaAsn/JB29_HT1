package java1;

public class Task30 {
	
	public static void main(String[] args) {
		
		double R;
		double R1 = 500;
		double R2 = 400;
		double R3 = 300;
		
		R = 1/((1/R1)+(1/R2)+(1/R3));
		
		System.out.format("Общее сопротивление цепи = " + R);
	}
	}


