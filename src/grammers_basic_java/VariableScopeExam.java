package grammers_basic_java;

public class VariableScopeExam {
	// 변수의 사용 범위 = 변수가 선언된 블록

	int globalscope = 10;
	static int staticVal = 7;
	
	public void scopeTest(int value) {
		int localScope = 20;
		
		//클래스 속성으로 선언된 변수globalscope 사용 가능
		System.out.println(globalscope);
		
		//해당 블럭 내 선언한 localScope (당연히 ㅋ) 사용 가능
		System.out.println(localScope);
		
		//매개변수로 선언된 value도 사용가능(블록 밖에 존재하지만, 메서드 선언부에 존재하므로 해당 블럭내 사용 가능)
		System.out.println(value);
		
	}
	
	public void scopeTest2(int value2) {
		
		//클래스 속성으로 선언된 변수globalscope 사용 가능
		System.out.println(globalscope);
		
//		//다른 블럭 내 선언한 localScope 사용 불가능
//		System.out.println(localScope);
//		
//		//다른 블럭의 매개변수로 선언된 value도 사용 불가능
//		System.out.println(value);
		
		//블럭 안에서 선언한 value2는 사용 가능
		System.out.println(value2);
		
	}
	
	public static void main(String[] args) {
		
//		//같은 클래스 안에 있지만 사용 불가능
//		// >> static(붕어빵의 틀 : 모든 클래스는 인스턴스화 하지 않은 채로 사용불가능)
//		// 키워드 static을 사용하면 인스턴스화(객체를 생성) 하지 않아도 사용할 수 있다.
//		// 그러므로 static메서드 안에 있으면 static하지 않은 메서드는 사용할 수 없다.
//		System.out.println(globalscope);
		
		//같은 클래스 안에 있지만 static변수로 선언하여 사용 가능
		System.out.println(staticVal);
		
//		//다른 블럭내 선언한 메서드도(당연히ㅋ) 사용 불가능
//		 //해당 블럭 내 선언한 localScope (당연히 ㅋ) 사용 가능
//		 System.out.println(localScope);
//		 //매개변수로 선언된 value도 사용가능(블록 밖에 존재하지만, 메서드 선언부에 존재하므로 해당 블럭내 사용 가능)
//		 System.out.println(value);
		
		//클래스에서 선언한 변수 사용시 해당객체를 선언하면됨
		VariableScopeExam v1 = new VariableScopeExam();
		//사용시에는 반드시 레퍼런스 변수 . 필드 이름을 적어야 사용할 수 있음 
		//인스턴스 변수 : globalscope같이 인스턴스가 생성될 때 생성된 변수를 의미한다.
		System.out.println(v1.globalscope);		
		
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalscope = 100;
		v2.globalscope = 200;
		System.out.println(v1.globalscope);
		System.out.println(v2.globalscope);
		
		// 클래스 변수 : static하게 선언된 변수는 값을 저장할 수 있는 공간이 하나만 생성된다. 그러므로 인스턴스가 여러개 생성되도 static한 변수는 하나이다.(값이 변하지 않음)
		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal); // 100출력
		System.out.println(v2.staticVal); // 100출력 //맨마지막에 v2.staticVal = 100;선언한 부분이 앞의 값을 덮어쓴다고 사용하면 될듯..ㅋㅋ
		
		//static변수는 인스턴스가 선언되지 않아도 사용 가능하기 때문에 "클래스이름 + static변수명" 으로 사용하는 것이 바람직하다.
		System.out.println(VariableScopeExam.staticVal);
		
		

	}

}
