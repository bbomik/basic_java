package grammers_basic_java;

public class CarExam3 {

	public static void main(String[] args) {
		Car c1 = new Car("소방차");
		
		//기본생성자는 생성자를 하나라도 만들어 두면 사용할 수 없다.
		//하지만 기본생성자를 직접 정의하면 사용이 가능하다.
		Car c2 = new Car(); 
		System.out.println(c2.name);
		System.out.println(c2.number);
		
		Car c3 = new Car("구급차",100);
		System.out.println(c3.name + "는 시속" + c3.number + "으로 달립니다.");
		
		

	}

}
