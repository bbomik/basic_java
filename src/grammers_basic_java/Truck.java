package grammers_basic_java;

public class Truck extends Car {
	public Truck() { 
		//Truck�� �����Ǳ� ���ؼ��� �ݵ�� �θ� ���� �����Ǿ�� ��
		//�θ��� �����ڸ� ���� �������� ������ �����Ϸ��� �θ��� �⺻ �����ڸ� ȣ����
		super("�ҹ���"); //�ڵ����� �θ��� �����ڰ� ȣ���
		//super()�� ���� �ٿ����� �ʾƵ� ���۵Ǵ� ���� java���� ���Ƿ� �߰��Ǿ� ���۵Ǿ����� ������ ������
		System.out.println("Truck�� �⺻ ������ �Դϴ�.");
	}
}
