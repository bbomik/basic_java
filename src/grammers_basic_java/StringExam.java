package grammers_basic_java;

public class StringExam {

	public static void main(String[] args) {
		//String Class : ���ڿ��� ǥ���ϴ� �ڹٿ��� ���帹�� ����ϴ� Ŭ����
		//new�� ������� �ʰ� �ν��Ͻ��� ���� �� �ִ�.
		//new�� ������� �ʰ� ���� "hello"�� ����� ����Ǵ� ������ ����ȴ�. ����� �������ʴ� ���� �ǹ�
		String str1 = "hello";
		String str2 = "hello";

		//new�� ����Ͽ� �ν��Ͻ��� ����� ������ �ν��Ͻ��� ������ ���Ӱ� ���������.
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		if(str1 == str2) //���� �ν��Ͻ��� �����ϹǷ� true
			System.out.println("str1�� str2�� ���� ���۷��� �Դϴ�.");
			
		if(str1 == str3) //str1�� str3�� ���� �ٸ� �ν��Ͻ��� �����ϹǷ� ����� false
			System.out.println("str1�� str3�� ���� ���۷��� �Դϴ�.");
			
		if(str3 == str4) //str3�� str4�� ���� �ٸ� �ν��Ͻ��� �����ϹǷ� ����� false
			System.out.println("str3�� str4�� ���� ���۷��� �Դϴ�.");

		System.out.println(str1);
		
		System.out.println(str1.substring(3));

		System.out.println(str1);		

	}

}
