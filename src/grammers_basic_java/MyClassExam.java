package grammers_basic_java;

public class MyClassExam {

	public static void main(String[] args) {
		//Ŭ������ ���� �޼ҵ带 ����ϱ� ���ؼ��� ��ü�� ������ ����� �� �ִ�.
		//�ؾƲ�� �ϸ� �־���� �츮�� �ؾ�� ������ ������ ������ ���� �Ͱ� ���� ��ġ
		MyClass myclass = new MyClass();
		myclass.method1();
		myclass.method2(10);
		
		//���ϰ��� ��ȯ�Ǵ� �޼���� ���ϰ��� ���� ������ ������ ���ϰ��� Ȯ���Ѵ�.
		int value = myclass.method3();
		System.out.println("method3�� return�� �� : " + value);
		
		myclass.method4(10, 20);
		
		int value2 = myclass.method5(10);
		System.out.println("method5�� return�� �� : " + value2);
	}

}
