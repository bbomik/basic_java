package grammers_basic_java;

public class InnerExam1 {
	
	//내부클래스 실습
	//필드를 선언할 위치에 클래스를 선언
	class Cal{
		int value = 0;
		
		//일반적인 클래스와 동일하게 필드를 선언할 수도 있고,
		//메서드를 선언할 수도 있다.
		public void plus() {
			value ++;
		}
	}
	
	public static void main(String[] args) {
		
		//내부클래스 사용 예.
		/* 1번
		 * InnerExam1 t = InnerExam1(); //혼자 독자적으로 만들어질 수 없으니 new생성자는 사용하지 않음.
		   t.new Cal(); //InnerExam1에대한 t를 생성 후 new생성자를 통한 선언(객체생성)이 가능함.
		 */
		
		// 2번 타입이 선언되는 방법
		//바깥쪽(Inner)클래스 타입.내부클래스 타입  으로 사용되어야 함
		InnerExam1 t = new InnerExam1(); //바깥쪽에 있는 클래스도 new생성자로 만들어 줌
		InnerExam1.Cal cal = t.new Cal(); //이렇게 사용할 시 변수를 선언하는 방법 동일
		
		cal.plus();
		System.out.println(cal.value);
		
	}

}
