package grammers_basic_java;

public class Taxi implements Meter {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("����.");

	}
	
	public int BASE_FARE = 3000; // �⺻���(�������̽��� ������ ������ ����� ������ �� �����ϴ�.) 

	@Override
	public int stop(int distance) {
		int fare = BASE_FARE + distance * 2;
        System.out.println("������ �����մϴ�. ����� " + fare + "�� �Դϴ�.");
        return fare;
	}
	
    //default�޼����� �������̵�
	//Ȱ��ȭ �� �ּ� ó�� ����
//	public void afterMidnight() {
//		
//	}
	
}
