package grammers_basic_java;

public abstract class Bird {
	public abstract void sing();
	//클래스에 속한 메서드가 하나라도 abstract(추상)라면 클래스도 abstract(추상) 클래스가 되어야 한다. 
	
	public void fly() {
	//abstract는 추상메서드 외에 일반 메서드도 선언(정의) 할 수 있다.
		System.out.println("날다.");
	}

}
