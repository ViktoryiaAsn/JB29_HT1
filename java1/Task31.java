package java1;

public class Task31 {

	public static void main(String[] args) {
	
		
		double V = 5; //�������� � ������� ����
		double V1 = 1; // �������� ������� ����
		double T1 = 3; //����� �������� �� �����
		double T2 = 1; //����� �������� ������ ������� ����
		double S1; //����, ����������� ������ �� �����
		double S; // ����� ����, ���������� ������
		double V2; //�������� ����� ������ �������
		
		S1 = V * T1;
		V2 = V - V1;
		S = (S1 + V2 ) * T2;
		
		System.out.format("����� ���� ���������� ������ = " + S);

	}

}
