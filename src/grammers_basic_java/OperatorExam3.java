package grammers_basic_java;

public class OperatorExam3 {

	public static void main(String[] args) {
		//������ �켱����
		int a = 5;
		int b = 10;
		int c = 15;
		
		System.out.println(a - b * c); //-145
		System.out.println((a - b) * c); //-75

		System.out.println(a > 5 && b > 5); //and������
		//System.out.println(�񱳿����� ��������(and����) �񱳿�����); //�񱳿����ڰ� �������ں��� �켱������ ����.
															  //������� a>5 �Ǻ� , b>5�Ǻ� // 5>5 , 10>5
		                                                      //flase && ture // and������ ���ʸ�� true���� true �ƴϸ� false
		System.out.println(a > 5 || b > 5); //ture// or������ ���� �ϳ��� true���� true. ��� false�϶��� false
		
		System.out.println(a); //5
		System.out.println(++a - 5); //1
		System.out.println(a); //6

//		System.out.println(a); //5
//		System.out.println(a++ - 5); //0
//		System.out.println(a); //6
		

	}

}
