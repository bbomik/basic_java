package grammers_basic_java;

public class CarExam {

	public static void main(String[] args) {
		//Ŭ������ ����� �ش� Ŭ������ �̿��ؼ� ��ü �� �ν��Ͻ��� ������� new�����ڸ� �����
		//new������ �������� �ݵ�� �����ڰ� ���;� ��.
		/* 
		 * Car c1 = new Car(); //�ؾ //Car()�κ��� �����ڶ�� �� �� ����.
		 * Car.java���� ������name�� ����� �־����� new�� �⺻�����ڸ� ������ Car c1 = new Car();�� ������ ����
		 */
		//Car.java���� �������(������) �����ڸ� �̿��Ͽ� Car��ü�� ����� �ָ��
		//Car.java���� �Ű������� String������ �־��ֱ�� ������
		Car c2 = new Car("�ҹ���"); //���� ���� ����
		Car C3 = new Car("������");

		System.out.println(c2.name);
		
//		c1.name = "�ҹ���";
//		c1.number = 1234;
//		
//		c2.name = "������";
//		c2.number = 1111;
//		
//		System.out.println(c1.name);
//		System.out.println(c1.number);
//		
//		System.out.println(c2.name);
//		System.out.println(c2.number);

	}

}
