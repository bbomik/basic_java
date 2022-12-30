package grammers_basic_java;

public class ConstantExam {

	public static void main(String[] args) {
		int i;
		i = 10;
		i = 5;
		
		System.out.println(i);
		
		//상수선언 시 앞에 final을 붙여준다.
		//상수변수 사용시 모두 대문자만 사용하는 명명규칙을 지니고 있다.
		final int J;
		J = 10;
		
//		J = 5; 에러남
		
		System.out.println(J);
		
		
		double circleArea;
		final double PI = 3.14159;
		circleArea = 3 * 3 * PI ;

		System.out.println(circleArea);
		 
		
		final int OIL_PRICE = 1390;
		
		int totalPrice = 50 * OIL_PRICE;
		
		System.out.println(OIL_PRICE);
		
		
		

	}

}
