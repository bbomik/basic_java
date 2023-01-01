package grammers_basic_java;

public class MyClassExam {

	public static void main(String[] args) {
		//클래스가 가진 메소드를 사용하기 위해서는 객체로 만들어야 사용할 수 있다.
		//붕어빵틀이 암만 있어봤자 우리가 붕어빵을 만들지 않으면 먹을수 없는 것과 같은 이치
		MyClass myclass = new MyClass();
		myclass.method1();
		myclass.method2(10);
		
		//리턴값이 반환되는 메서드는 리턴값을 받을 변수를 선언해 리턴값을 확인한다.
		int value = myclass.method3();
		System.out.println("method3이 return한 값 : " + value);
		
		myclass.method4(10, 20);
		
		int value2 = myclass.method5(10);
		System.out.println("method5이 return한 값 : " + value2);
	}

}
