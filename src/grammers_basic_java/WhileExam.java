package grammers_basic_java;

public class WhileExam {

	public static void main(String[] args) {
		int i = 0;
		
		while(i<10) {
			i++; // i++ >> i+1 = i; 1���� ��� // ++i >> i = i+1 0��� �� 1�� ��
			System.out.println(i);
		}
		
		int total = 0;
		int ii = 1;
		while(ii <= 10) {

			System.out.println(ii);
			total = total + ii;
			ii++;
			
		}
		System.out.println(total);

	}

}
