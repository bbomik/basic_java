package grammers_basic_java;

public class OperatorExam6 {

	public static void main(String[] args) {
		//삼항연산
		int b1 = (5 > 4) ? 50 : 40;	// b1의 값는 만약 괄호 안(5>4)비교가 true라면 50, false를 40으로 넣는다.
		System.out.println(b1);
		
//		int b11 = (5 < 4) ? 50 : 40;	// b1의 값는 만약 괄호 안(5<4)비교가 true라면 50, false를 40으로 넣는다.
//		System.out.println(b11);
		
		//if문 사용을 통해 동일한 결과를 얻음
		int b2 = 0;
		if(5>4) {
			b2 = 50;
		} else {
			b2 = 40;
		}
		System.out.println(b2);

	}

}
