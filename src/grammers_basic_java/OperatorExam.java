package grammers_basic_java;

public class OperatorExam {

	public static void main(String[] args) {
		int i1 = -5;
		int i2 = +i1;
		int i3 = -5;
		
		System.out.println(i1); // -5
		System.out.println(i2); // -5
		System.out.println(i3); // -5
		
		int i4 = -i1;
		System.out.println(i4); // 5
		
		/*  +부호는 +비트를 그대로 유지시켜주는 역할을 함
		 * -부호는 음수는 양수로, 양수는 음수로 바꾸어주는 역할을 함
		 * */
		
		//이런연산자를 피연산자 앞에 붙일 수도 있고 뒤에 붙일 수도 있음
		
		int i5 = ++i4; // ++i4의 의미 i4 = i4+1로 값을 바꾼다.
		System.out.println(i5); // 5+1 = 6
		System.out.println(i4); // i4는 6으로 갱신된 상태 = 6
		
		int i6 = i4++; // i4++의 의미 i4 = i4+1
		System.out.println(i6); // ++가 뒤에 오는 경우 먼저 기존값을 대입한다. (기존 i4값인 6 출력)
		System.out.println(i4); // 대입한 다음에 기존의 값을 바꾼다. (+1된 7 출력)
		
		//산술연산 예시
		int i = 5;
		int j = 2;
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j); //int로 선언된 정수 값을 연산할 때는 정수로 값이 나옴
		System.out.println(i/(double)j); //피연산자 중 하나를 실수로 형변환을 하면 실수로 값이 나옴(캐스팅연산)
		System.out.println((double)i/j); //피연산자 중 하나를 실수로 형변환을 하면 실수로 값이 나옴(캐스팅연산)
		System.out.println(i%j);//나머지 값을 출력(모듈러연산)

	}

}
