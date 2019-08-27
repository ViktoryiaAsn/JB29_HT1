package java1;

public class Task31 {

	public static void main(String[] args) {
	
		
		double V = 5; //скорость в стоячей воде
		double V1 = 1; // скорость течения реки
		double T1 = 3; //время движения по озеру
		double T2 = 1; //время движения против течения реки
		double S1; //путь, пройденного лодкой по озеру
		double S; // общий путь, пройденный лодкой
		double V2; //скорость лодки против течения
		
		S1 = V * T1;
		V2 = V - V1;
		S = (S1 + V2 ) * T2;
		
		System.out.format("Общий путь пройденный лодкой = " + S);

	}

}
