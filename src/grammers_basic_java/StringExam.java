package grammers_basic_java;

public class StringExam {

	public static void main(String[] args) {
		//String Class : 문자열을 표현하는 자바에서 가장많이 사용하는 클래스
		//new를 사용하지 않고 인스턴스를 만들 수 있다.
		//new를 사용하지 않고 만든 "hello"는 상수가 저장되는 영역에 저장된다. 상수는 변하지않는 값을 의미
		String str1 = "hello";
		String str2 = "hello";

		//new를 사용하여 인스턴스를 만들면 무조건 인스턴스는 무조건 새롭게 만들어진다.
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		if(str1 == str2) //같은 인스턴스를 참조하므로 true
			System.out.println("str1과 str2는 같은 래퍼런스 입니다.");
			
		if(str1 == str3) //str1과 str3은 서로 다른 인스턴스를 참조하므로 결과는 false
			System.out.println("str1과 str3는 같은 래퍼런스 입니다.");
			
		if(str3 == str4) //str3과 str4는 서로 다른 인스턴스를 참조하므로 결과는 false
			System.out.println("str3과 str4는 같은 래퍼런스 입니다.");

		System.out.println(str1);
		
		System.out.println(str1.substring(3));

		System.out.println(str1);		

	}

}
