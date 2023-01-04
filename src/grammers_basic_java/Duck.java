package grammers_basic_java;

public class Duck extends Bird {

	@Override
	public void sing() {
		// 앞서 Bird에서 선언만 해주었던(구현하지 않았던) sing이라는 메서드를 구현해 주어야 한다.
		System.out.println("꽥!꽥!");
	}

}
