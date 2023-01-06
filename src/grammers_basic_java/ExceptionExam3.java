package grammers_basic_java;

public class ExceptionExam3 {

	//������ ������ �߻���Ű�� throw
	//throw�� ������ ���ѱ�� throws�� ���� ���� ����
	
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		// 2)���� �������(try)
		try {
		int k = divide(i, j);
		System.out.println(k);
		} catch (IllegalArgumentException e) {
			System.out.println(e.toString());
		}
	}
	
	public static int divide(int i, int j) throws IllegalArgumentException{
		
		if(j==0) {
//			System.out.println("2��° �Ű������� 0�̸� �ȵ˴ϴ�.");
//			return 0;
			
			throw new IllegalArgumentException("0���� ���� �� �����ϴ�.");	//1) ������ ���� �߻� ��Ű�� �ڵ�	 
			//throwŰ������ �ǹ� : �ش� ���ο��� exception�� �߻��Ѵ�.
		}
		
		int k = i / j ;
		return k;
		
	}

}
