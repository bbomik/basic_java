package grammers_basic_java;

public interface TV {
	public int MIN_VOLUME=0;
	public int MAX_VOLUME=100;
	
	//인터페이스는 인터페이스 자체가 구현이 없고, 추상하는 자체이기 때문에 abstract를 붙이지 않음.
	public void turnOn(); //추상클래스에서 메서드 구현이 애매할때 추상메서드를 선언하는 구조와 비슷하다.
	public void turnOff(); 
	public void changeVolume(int volume); 
	public void changeChannel(int channel); 
}
