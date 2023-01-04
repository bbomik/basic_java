package grammers_basic_java;

public class Car { //붕어빵틀
	//타입 필드명
	String name;
	int number;
	
	// CarExam.java에서 사용된 Car()에 대한 생성자가 따로 만들어지지 않았음을 확인 할 수 있다.
	// 아래예시와 같이 Car를 생성하는 부분을 볼 수 없음
	
	  public Car(String name){ //자동차 객체에 반드시 이름을 가지고 만들게 하고 싶다면 Car클래스에 다음과 같은 생성자를 만들어두면 됨.
	   
	   // 이름을 받아드릴 수 있는 String n과 같은 매개변수를 받음
	   
	  	this.name = name; //Car클래스의 속성인 name에 넣어주게 하는것
	  	//this : 객체 자신을 참조하는 키워드(변수 명이 동일할 때 구분하기 위해 사용)
	  	//위의 this.name = name; 은 내 필드(Class) 안의 name에다가 지금 선언한 name을 넣어주세요 라는 의미 //결과 : 소방차
	  	//this를 사용하지 않고 name = name이라고 사용시 name을 클래스에 대한 name으로 인지하지 못함 //결과 : null
	  
	}

	  //기본생성자를 직접 정의
	  public Car() {
		  
		//기본생성자를 호출했을때 name은 "이름 없음" 으로 초기화 하는 경우
		  //this.name = "이름없음";
		  //this.number = 0;
		  
		//위에 줄 처럼 같은 코드를 여러번 중복 작성할 필요 없음.
		  this("이름없음",0);
	}
	  
	  public Car(String name, int number) {
		//이름과 숫자도 받아드리는 Car메서드 생성
		  this.name = name;
		  this.number = number;
	}
	  
	  // 이제 Car라는 객체는 생성되면서 name이라는 속성이 초기화 될 것
	 
	// 생성자가 없는 경우 >> 매개변수가 없는 생성자가 컴파일할 때 자동으로 만들어진다.
	// >> 기본 생성자 : 매개변수가 없는 생성자
	// (생성자를 하나라도 프로그래머가 만들었다면 기본생성자는 자동으로 만들어지지 않는다.)
	
}
