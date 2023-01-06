package grammers_basic_java;

public class ExceptionExam {

	public static void main(String args[]) {

		int i = 10;
		int j = 0; //int j = 5;  // j�� ���ܸ� ���� 0�̵� ���ܸ� ���� �ʴ� �����̵� finally�� ������ �����
		
		/* try-catch-finally : ���ܻ�Ȳ�� �̸� �����ϰ� ����ó�� �ϴ� ��
		 * try�κ� : ������ �ڵ�(���� �߻� ���ɼ��� �ִ� ���)
		 * catch�κ� : ����ó�� ���
		 * finally�κ� : ���� �߻� ���ο� ������� �ݵ�� ����Ǵ� ���(��������)
		 * 	 */
		
		try { //���ܰ� �߻��Ǵ� �κ��� try������� ���´�.
			
		int k = i / j; //10/0�� ������ k�� �����Ҷ� �ڹٴ� ���������� ��Ȳ���� �Ǵ��Ͽ� ���� ó�� ��
		System.out.println(k);
		
		//���� ���� �߻��� �� ���� java.lang.ArithmeticException/ by zero:
		//Ȥ �������� ���ܸ� ���ٸ� �߻��� ���ܿ� ���� �������� catch��� ������ ����
		} catch (ArithmeticException e) {  //�߻��� �� �־��� ArithmeticException�� �����ش�.
			//���ܰ� �߻��� �����ؾ��� �ڵ�

			//ArithmeticException�̶�� ���� ��ü�� e��� ���۷��� ��ü�� ����Ű�� ����
			
			//e��� ���۷��� ������ toString()�̶�� �޼��带 ������ ����
			//����Ŭ����������.toString() >>������ ������ �˷��ִ� �޼ҵ�
			System.out.println("0���� ���� �� �����ϴ�."+e.toString());
		}finally {
			System.out.println("������ �߻��ߵ� �߻����� �ʾҵ� ������ ����!!");
		}
		
		//ExceptionŬ�������� ��� ExceptionŬ������ ��ӹ����Ƿ�,
		//����Ŭ������ Exception�� �ΰ� �Ǹ� � ������ �߻��ϵ��� ����
		//�ϳ��� catch��Ͽ��� ��� ������ ó���� �� �ִ�.
		
		System.out.println("main end!");

	}

}
