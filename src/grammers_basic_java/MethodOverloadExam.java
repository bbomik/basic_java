package grammers_basic_java;

public class MethodOverloadExam {

	public static void main(String[] args) {
		MyClass2 m = new MyClass2(); 
		//Ŭ������ ����� ���
		// : �ش� Ŭ���� Ÿ�� + ������ = new + Ŭ������ �����ִ� ������ �̸�
		
		System.out.println(m.plus(1,2));
		System.out.println(m.plus(1,2,3));
		System.out.println(m.plus("hello", "world"));
		

	}

}
