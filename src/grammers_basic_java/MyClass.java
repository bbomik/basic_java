package grammers_basic_java;

public class MyClass {
	// public ����Ÿ�� �޼���� (�Ű����� ��) {//�ʿ��� ��ɵ��� ������ �� ����}
	
	//1)�Ű������� ���� �����ϴ� �͵� ���� ������ �޼ҵ�
	public void method1() {
		//void ����Ÿ���� ���� �� ���
		System.out.println("method1�� �����..");
	}

	//2)������ �޾Ƶ��� ��, �������� �ʴ� �޼ҵ�
	public void method2(int x) {
		//void ����Ÿ���� ���� �� ���
		System.out.println(x + "�� �̿��� method2 ����..");
	}

	//3)�ƹ��͵� �޾Ƶ����� �ʰ�, ������ ��ȯ�ϴ� �޼ҵ�
	public int method3() {
		System.out.println("method3�� �����..");
		return 10;
	}

	//4)������ 2�� �Ű������� �ް�, �ƹ��͵� ��ȯ���� �ʴ� �޼ҵ�
	public void method4(int x, int y) {
		//void ����Ÿ���� ���� �� ���
		System.out.println(x + y + "method4�� �����..");
		
	}

	//5)������ �Ѱ� �޾Ƶ��� ��, ������ ��ȯ�ϴ� �޼ҵ�
	public int method5(int y) {
		System.out.println(y + "�� �̿��� method5 ����");
		
		return y*2;
		
	}
}
