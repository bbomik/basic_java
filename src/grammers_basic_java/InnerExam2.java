package grammers_basic_java;

import grammers_basic_java.InnerExam1.Cal;

//내부 클래스2 : 정적 중첩클래스(스태틱 클래스static class)
//필드가 정적인(static한) 필드인 특징을 갖음.
public class InnerExam2 {
	static class Cal { // <<static으로 선언된 Cal을 일반 내부클래스와 사용하는 방법이 다름
		int value = 0;

		public void plus() {
			value++;
		}
	}

	public static void main(String[] args) {
		
		//일반 내부클래스는 사용 시 내부클래스를 반드시 먼저 선언 후 사용가능
		//예1. InnerExam1 t = InnerExam1();
		//    InnerExam1.Cal cal = t.new Cal();
		//예2. InnerExam1 t = new InnerExam1();
		//    InnerExam1.Cal cal = t.new Cal();
		
		//하지만 static클래스는 static한 클래스이기 때문에 내부클래스를 먼저 선언하지 않고(먼저 생성할 필요 없음)
		//바로 사용가능
		InnerExam2.Cal cal = new InnerExam2.Cal();
		cal.plus();
		System.out.println(cal.value);

	}

}
