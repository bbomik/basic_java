package grammers_basic_java;

public class LedTV implements TV {

	//������ �������̽��� �����Ѵٴ� ���� Ŭ���� ������ ���ٴ� ���� �ǹ��Ѵ�.
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("�Ѵ�.");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("����.");

	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("������ �����ϴ�.");

	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("ä���� �����ϴ�.");

	}

}
