package grammers_basic_java;

public class StringMethodExam {

	public static void main(String[] args) {
		
		//new 생성자를 이용해 객체를 생성하는 것이 가장 일반적
		//String str = new String("hello");
		
		//자바에서 가장많이 사용되는String은 예외적으로 생성자 없이 객체를 생성할 수 있다.
		String str = "Hello";
		
		//문자열의 길이를 구해 알려주는 메서드
		//str.length();
		System.out.println(str.length()); //공백도 하나의 문자로 처리

		//concat메서드 : 문자열과 문자열을 결합해주는 메서드
		System.out.println(str.concat(" world"));
		
		//concat 후 str출력
		//String은 한번 만들어진 객체를 바꾸지 않음 = "불변 클래스"
		System.out.println(str);
		//concat method사용시 world라는 새로운 객체가 생성 >> concat사용으로 문자열이 결합되어 보이더라도 실제 결합되 값으로str값이 변한 것은 아님
		//concat method를 사용한 값으로 str의 값을 바꾸고 싶다면
		str = str.concat(" world"); //str변수 값을 선언해서 바꾸어 주어야함
		System.out.println(str);
		
		//substring메서드 : 문자열을 잘라내는 메서드
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7));
		

	}

}
