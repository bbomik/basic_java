package grammers_basic_java;

//익명클래스를 사용하는 이유 : Action을 상속받는 클래스를 굳이 만들어낼 필요가 없는 경우에 사용
//Action을 상속받는 클래스가 해당 클래스 안에서만 사용되고 다른클래스에서 전혀 사용되지 않을 경우
//굳이 MyAction과 같은 클래스를 만들 필요가 없음(한번만 쓸것이기 때문에)

public class MyAction extends Action {

	//추상클래스를 사용하기 위해 추상클래스를 상속받는 자식클래스를 생성 후
	//추상메서드를 구현
	@Override
	public void exec() {
		//구현하는 형태
		System.out.println("exec");

	}

	//하지만 
	
}
