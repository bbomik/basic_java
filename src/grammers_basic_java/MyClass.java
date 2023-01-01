package grammers_basic_java;

public class MyClass {
	// public 리턴타입 메서드명 (매개변수 들) {//필요한 기능들을 구현할 수 있음}
	
	//1)매개변수도 없고 리턴하는 것도 없는 형태의 메소드
	public void method1() {
		//void 리턴타입이 없을 때 사용
		System.out.println("method1이 실행됨..");
	}

	//2)정수를 받아들인 후, 리턴하지 않는 메소드
	public void method2(int x) {
		//void 리턴타입이 없을 때 사용
		System.out.println(x + "를 이용한 method2 실행..");
	}

	//3)아무것도 받아들이지 않고, 정수를 반환하는 메소드
	public int method3() {
		System.out.println("method3이 실행됨..");
		return 10;
	}

	//4)정수를 2개 매개변수로 받고, 아무것도 반환하지 않는 메소드
	public void method4(int x, int y) {
		//void 리턴타입이 없을 때 사용
		System.out.println(x + y + "method4가 실행됨..");
		
	}

	//5)정수를 한개 받아들인 후, 정수를 반환하는 메소드
	public int method5(int y) {
		System.out.println(y + "를 이용한 method5 실행");
		
		return y*2;
		
	}
}
