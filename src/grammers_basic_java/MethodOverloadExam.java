package grammers_basic_java;

public class MethodOverloadExam {

	public static void main(String[] args) {
		MyClass2 m = new MyClass2(); 
		//클래스를 만드는 방법
		// : 해당 클래스 타입 + 변수명 = new + 클래스가 갖고있는 생성자 이름
		
		System.out.println(m.plus(1,2));
		System.out.println(m.plus(1,2,3));
		System.out.println(m.plus("hello", "world"));
		

	}

}
