package grammers_basic_java;

public class CarExam {

	public static void main(String[] args) {
		//클래스를 만들고 해당 클래스를 이용해서 객체 즉 인스턴스를 만들려면 new연산자를 사용함
		//new연산자 다음에는 반드시 생성자가 나와야 함.
		/* 
		 * Car c1 = new Car(); //붕어빵 //Car()부분이 생성자라고 할 수 있음.
		 * Car.java에서 생성자name을 만들어 주었더니 new로 기본생성자를 생성한 Car c1 = new Car();가 오류를 뱉음
		 */
		//Car.java에서 만들어준(정의한) 생성자를 이용하여 Car객체를 만들어 주면됨
		//Car.java에서 매개변수를 String값으로 넣어주기로 정의함
		Car c2 = new Car("소방차"); //오류 나지 않음
		Car C3 = new Car("구급차");

		System.out.println(c2.name);
		
//		c1.name = "소방차";
//		c1.number = 1234;
//		
//		c2.name = "구급차";
//		c2.number = 1111;
//		
//		System.out.println(c1.name);
//		System.out.println(c1.number);
//		
//		System.out.println(c2.name);
//		System.out.println(c2.number);

	}

}
