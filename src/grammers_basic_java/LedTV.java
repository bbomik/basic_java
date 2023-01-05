package grammers_basic_java;

public class LedTV implements TV {

	//동일한 인터페이스를 구현한다는 것은 클래스 사용법이 같다는 것을 의미한다.
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("켜다.");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("끄다.");

	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("볼륨을 조정하다.");

	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("채널을 지정하다.");

	}

}
