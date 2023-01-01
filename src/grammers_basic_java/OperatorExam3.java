package grammers_basic_java;

public class OperatorExam3 {

	public static void main(String[] args) {
		//연산자 우선순위
		int a = 5;
		int b = 10;
		int c = 15;
		
		System.out.println(a - b * c); //-145
		System.out.println((a - b) * c); //-75

		System.out.println(a > 5 && b > 5); //and연산자
		//System.out.println(비교연산자 논리연산자(and연산) 비교연산자); //비교연산자가 논리연산자보다 우선순위가 높음.
															  //연산순서 a>5 판별 , b>5판별 // 5>5 , 10>5
		                                                      //flase && ture // and연산은 양쪽모두 true여야 true 아니면 false
		System.out.println(a > 5 || b > 5); //ture// or연산은 둘중 하나만 true여도 true. 모두 false일때만 false
		
		System.out.println(a); //5
		System.out.println(++a - 5); //1
		System.out.println(a); //6

//		System.out.println(a); //5
//		System.out.println(a++ - 5); //0
//		System.out.println(a); //6
		

	}

}
