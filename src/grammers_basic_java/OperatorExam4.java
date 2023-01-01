package grammers_basic_java;

public class OperatorExam4 {

	public static void main(String[] args) {
		//비교연산자 .. 크다 / 작다를 표현하며 비교연산자의 값은 boolean값으로 나옴
		
		//단순대입연산자
		int i = 10;
		int j = 10;
		System.out.println(i==j); //true
		System.out.println(i!=j); //false
		System.out.println(i<j); //false
		System.out.println(j<=i); //true
		System.out.println(i<j); //false
		System.out.println(i>=j); //true
		
		//복합대입연산자
		i += 10; // i = i + 10;
		System.out.println(i); //20
		System.out.println(i-=5); //15
		System.out.println(i); //15
		

	}

}
