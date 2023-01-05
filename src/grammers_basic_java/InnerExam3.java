package grammers_basic_java;

//내부클래스3 : 지역 중첩 클래스(지역클래스 local class)
//내부클래스가 메서드 안에서 선언되는 경우
public class InnerExam3 {
	
	public void exec() {
		class Cal{
			int value = 0 ;
			public void plus() {
				value ++;
			}
		}
		
		//Cal(지역중첩클래스)에서 생성된 객체는 메서드 안에서만 사용 가능
		Cal cal = new Cal();
		cal.plus(); //메서드 안에서만 메서드 사용
		System.out.println(cal.value); //메서드 안에서만 객체 호출
		
	}

	public static void main(String[] args) {
		
		//Cal(지역중첩클래스)사용하고자 하는 경우
		InnerExam3 t = new InnerExam3(); //내부클래스를 생성(Cal이라는 클래스가 하나 생김)
		t.exec();
		
		// >> 메서드 안에서도 클래스를 지역변수 처럼 선언해 사용할 수 있음.

	}

}
