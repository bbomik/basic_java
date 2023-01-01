package grammers_basic_java;

public class PrimitiveDataTypeExam {

	public static void main(String[] args) {
		
		boolean isFun = true; //boolean형 데이터 변수는 true/false 값만 갖을 수 있다.
		System.out.println(isFun);

		char c = 'f'; //char 타입은 ''안에 값을 넣어야 하고 값을 하나만 넣을 수 있다. 'fff' 같이 하나 이상의 값이 들어가면 오류 
		
		int x = 59; //정수를 표현할 때는 int 사용
		
		long bing = 345453534L; //좀더 큰 정수를 표현하고 싶을 때는 long 사용. long타입 변수는 값뒤에 반드시 L를 붙여주어야 한다.
		
		float f = 32.4f; //실수를 넣고 싶다면 float을 사용하면된다. long타입과 마찬가지로 값뒤에 f를 붙여주어야 한다.(대소문자 모두 가능)
		
		double d = 3545121231.3; //조금더 큰 실수를 표현하는 double
	}

}
