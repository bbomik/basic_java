package grammers_basic_java;

public interface Calculator {
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	//java8부터는 default라는 키워드를 이용해 메소드 구현이 가능하다.
	//인터페이스가 변경이 되면 그 인터페이스를 구현하고 있는 모든 클래스들이 해당 메서드를 구현해야하는 문제점이 있음.
	//이를 해결하기 위해 default기능이 추가됨.
	default int exec(int i, int j) {
		return i + j;
	}
	
	//static키워드를 이용한 메서드 구현도 가능하다.
	public static int exec2(int i, int j) {
		return i * j ;
	}

}
