package grammers_basic_java;

public class OperatorExam6 {

	public static void main(String[] args) {
		//���׿���
		int b1 = (5 > 4) ? 50 : 40;	// b1�� ���� ���� ��ȣ ��(5>4)�񱳰� true��� 50, false�� 40���� �ִ´�.
		System.out.println(b1);
		
//		int b11 = (5 < 4) ? 50 : 40;	// b1�� ���� ���� ��ȣ ��(5<4)�񱳰� true��� 50, false�� 40���� �ִ´�.
//		System.out.println(b11);
		
		//if�� ����� ���� ������ ����� ����
		int b2 = 0;
		if(5>4) {
			b2 = 50;
		} else {
			b2 = 40;
		}
		System.out.println(b2);

	}

}
