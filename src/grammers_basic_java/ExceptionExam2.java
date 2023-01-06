package grammers_basic_java;


//Exceptionó���� �����ϴ� Throwsó��

public class ExceptionExam2 {
	
	
	//2)�Ʒ����� ������ divide�޼��� ȣ��
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		//3)������ �߻��Ǵ� �κ��� try��� ó��.
		try {
		int k = divide(i, j); //throws������� �߻��� ����(����)�� ���� �޼��� ���ο��� ó������ �ʰ� �޼��带 ȣ���� �ʿ��� ó���� �� �ֵ��� ������ ���ѱ�
		System.out.println(k);
		} catch(ArithmeticException e) {
			System.out.println(e.toString()); // ��� > java.lang.ArithmeticException: / by zero >> �� ó����
		}

	}
	
	//1)Throwsó���� ����� �޼��带 ����
	//throws : ���� ó������ �ʰ� ���� ȣ���� �ʿ��� ó���ϰ� ���ּ���
	public static int divide(int i, int j) throws ArithmeticException{
		//������  �ϳ��� ó���� �� �ִ°� �ƴ϶� �������� ó���� �� ����
		//��. (����) throws ArithmeticException, ClasscasException{ // << �̷������� �ڿ� ,�� ����� ��� �߰��ϸ� ��
		int k = i/j; //����� �� �ش� �ٿ��� ArithmeticException�� �߻��Ǵ� ���� �� �� �ִ�.
		return k;
	}
	

}
