package grammers_basic_java;

public class CarExam3 {

	public static void main(String[] args) {
		Car c1 = new Car("�ҹ���");
		
		//�⺻�����ڴ� �����ڸ� �ϳ��� ����� �θ� ����� �� ����.
		//������ �⺻�����ڸ� ���� �����ϸ� ����� �����ϴ�.
		Car c2 = new Car(); 
		System.out.println(c2.name);
		System.out.println(c2.number);
		
		Car c3 = new Car("������",100);
		System.out.println(c3.name + "�� �ü�" + c3.number + "���� �޸��ϴ�.");
		
		

	}

}
