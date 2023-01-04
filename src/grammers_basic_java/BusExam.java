package grammers_basic_java;

public class BusExam {

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		//Bus라는 클래스에는 정의된 메서드가 하나도 없지만 Car에서 상속받은 run이라는 메서드가 있어 .run이 동작함
		//원래 상속된 출력 >> Car의 run 메서드
		//오버라이딩을 통한 Bus.java의 run메서드 재정의 후 출력 >> Bus의 run메서드
		bus.ppangppang();
		//부모(Car클래스)의 메서드 이외에 추가로 메서드를 생성해 사용하는 것을 보고 "확장하였다." 라고 표현
		
		Car car = new Car();
		car.run();
		//car.ppangppang(); 부모클래스는 자식클래스에서 선언된 메서드를 사용할 수 없음.
		
		Car c = new Bus();
		//Bus객체를 Car타입의 참조변수로 참조할 수 있음.
		c.run();
		//부모타입으로 자식 객체를 참조하게되면 부모가 가지고 있는 메서드만 참조할 수 있음
		
		//c.ppangppang(); >> 자식타입(Bus.java)에서 만든 메서드이어서 사용할 수 없다.
		//하지만 꼭 사용해야할 경우.!!
		//형변환을 이용하면 가능!!
		Bus b = (Bus)c;
		b.run();
		b.ppangppang();
		//모든 경우에 형변환이 가능한 것은 아님
		//Car를 참조하는 객체가 원래 Bus였기 때문에 가능한 것 >> (참조) >> Car c = new Bus(); 애초에 Bus로 만들어졌음 ㅇㅇ;;
		
		
		
	}

}
