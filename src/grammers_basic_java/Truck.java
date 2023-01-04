package grammers_basic_java;

public class Truck extends Car {
	public Truck() { 
		//Truck이 생성되기 위해서는 반드시 부모가 먼저 생성되어야 함
		//부모의 생성자를 내가 생성하지 않으면 컴파일러는 부모의 기본 생성자만 호출함
		super("소방차"); //자동으로 부모의 생성자가 호출됨
		//super()를 따로 붙여주지 않아도 동작되는 것은 java에서 임의로 추가되어 동작되었음을 예측할 수있음
		System.out.println("Truck의 기본 생성자 입니다.");
	}
}
