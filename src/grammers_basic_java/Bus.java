package grammers_basic_java;

public class Bus extends Car {
	public void ppangppang() {
		System.out.println("����");
	}
	
	public void run() {
		super.run();
		//super.run(); >> �θ� ���� run�޼��带 �߰��� �����
		//��� �� ���� �θ��� run() ����� >> Car�� run �޼���
		//�ڽ��� run() ����� >> Bus�� run �޼���
		//��� ��µǴ� ���� �� �� �ִ�.
		
		//�������̵��� ���� Car.java�� run�޼��� ������
		System.out.println("Bus�� run �޼���");
	}
}
