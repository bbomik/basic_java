package grammers_basic_java;

public class MyCalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new MyCal();
		cal.plus(3, 4);
		cal.multiple(5, 6);
		
		//default로 구현한 메서드도 사용가능
		//cal.exec(0, 0);
		int i = cal.exec(5, 6);
		System.out.println(i);
		
		//static메서드를 사용하기 위해서는
		//인터페이스명.메소드명(); 으로 사용해야한다.
		Calculator.exec2(3, 4);

	}

}
