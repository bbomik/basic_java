package grammers_basic_java;

//익명클래스를 사용하는 이유 : Action을 상속받는 클래스를 굳이 만들어낼 필요가 없는 경우에 사용
//Action을 상속받는 클래스가 해당 클래스 안에서만 사용되고 다른클래스에서 전혀 사용되지 않을 경우
//굳이 MyAction과 같은 클래스를 만들 필요가 없음(한번만 쓸것이기 때문에)
		

public class ActionExam {

	public static void main(String[] args) {
		/* 추상클래스를 사용하기 위한 일반적인 형태
		// Action action = new Action(); //Action은 추상클래스 자신이기 때문에 생성되지 않음
		Action action = new MyAction(); //MyAction으로 생성
		action.exec(); //사용
		*/
		
		//익명클래스는 자식클래스인 MyAction을 만들지 않고 ActionExam에서 Action(추상클래스)을 상속받은 익명클래스를 만들어서 바로 사용할 수있음.
		Action action = new Action() {//Action은 추상 클래스이기 때문에 Action자체가 생성되지는 않음
			//하지만 익명으로 클래스가 하나 만들어짐.
			
			@Override
			public void exec() { //다른 메서드 생성과 동일하게 메서드를 생성할 수 있음
				System.out.println("exec");
			}
			
			
		};
		
		action.exec();

	}

}
