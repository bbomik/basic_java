package grammers_basic_java;

public class TruckExam {

	public static void main(String[] args) {
		Truck t = new Truck();
		//객체가 생성될 때 반드시 생성자를 실행하고 생성이 됨.
		//생성자의 역할 : 객체를 초기화 하는 일
		//생성자가 호출될때 자동으로 부모의 생성자가 호출되며 부모의 객체가 초기화됨
		//부모의 생성자를 호출할 때는 부모객체를 나타내는 super라는 키워드를 사용하게됨
		//부모생성자는 super()를 붙이면 부모의 생성자가 호출되게 됨
		//(Truck.java를 보면 super()를 따로 붙여주지 않아도 임의로 추가되어 동작되었음을 예측할 수있음.)
		//this > 나를 가리키는 것
		//super > 부모를 가리키는 것
		//Car c = new Car();
	}

}
