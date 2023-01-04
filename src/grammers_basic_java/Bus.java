package grammers_basic_java;

public class Bus extends Car {
	public void ppangppang() {
		System.out.println("빵빵");
	}
	
	public void run() {
		super.run();
		//super.run(); >> 부모가 갖은 run메서드를 추가로 실행시
		//출력 시 기존 부모의 run() 출력인 >> Car의 run 메서드
		//자식의 run() 출력인 >> Bus의 run 메서드
		//모두 출력되는 것을 알 수 있다.
		
		//오버라이딩을 통한 Car.java의 run메서드 재정의
		System.out.println("Bus의 run 메서드");
	}
}
