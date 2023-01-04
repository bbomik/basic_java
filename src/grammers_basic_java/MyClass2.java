package grammers_basic_java;

public class MyClass2 {

/*매개변수의 갯수나 타입이 조금씩 다를 수 있지만 비슷한 기능을 하는 메서드가 여러개 있을 수 있습니다.
  이런 메서드가 각각 다른 이름으로 정의가 되어있다면 어떤 상황에서 어떠한 메서드를 사용해야하는지 구분하기 어려울 수 있음
  이러한 경우 매개변수의 수가 다르거나 타입이 다르다면 동일한 이름으로 메서드를 여러개 정의할 수 있다. */
// 메소드 오버로딩 : 매개변수의 수, 타입이 다른 경우 동일한 이름으로 메소드를 여러개 정의 할 수 있다.
	// 타입과 매개변수 수가 중요!
	
	//정수 2개를 받아드려 두 정수의 합을 리턴하는 메서드
	public int plus(int x, int y) {
		
		return x + y;
		
	}
	
	
	//정수 3개를 받아드려 세 정수의 합을 리턴하는 메서드
	public int plus(int x, int y, int z) {
		
		return x + y + z;
		
	}

	//문자열 2개를 받아드려 두 문자열을 붙여서 리턴하는 메서드
	public String plus(String x, String y) {
		
		return x + y;
		
	}
	
	
//	public int plus(int i, int j) {
//		//변수명은 다르지만 매개변수의 타입과 갯수가 동일한 메서드를 또 정의 할 수 없다!!
//	}
	
	
}
