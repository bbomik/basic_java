package grammers_basic_java;

public interface TV {
	public int MIN_VOLUME=0;
	public int MAX_VOLUME=100;
	
	//�������̽��� �������̽� ��ü�� ������ ����, �߻��ϴ� ��ü�̱� ������ abstract�� ������ ����.
	public void turnOn(); //�߻�Ŭ�������� �޼��� ������ �ָ��Ҷ� �߻�޼��带 �����ϴ� ������ ����ϴ�.
	public void turnOff(); 
	public void changeVolume(int volume); 
	public void changeChannel(int channel); 
}
