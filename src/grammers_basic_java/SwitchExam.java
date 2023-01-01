package grammers_basic_java;

public class SwitchExam {

	public static void main(String[] args) {
		// switch, case, default, break 등을 활용
		
		int value = 1;
		
		switch (value) { //switch는 만난 case부터 이후의 case까지 모두 실행
		case 1: 
			System.out.println("1");
		case 2: 
			System.out.println("2");
		case 3: 
			System.out.println("3");
		default: 
			System.out.println("그 외 다른숫자");
		}


		int value2 = 2;
		
		switch (value2) { //switch는 만난 case부터 이후의 case까지 모두 실행 멈주게 하고 싶다면 break문을 사용해야함
		case 1: 
			System.out.println("1");
		case 2: 
			System.out.println("2");
		case 3: 
			System.out.println("3");
		default: 
			System.out.println("그 외 다른숫자");
		}
		
		//case 실행을 멈주게 하고 싶다면 break문을 사용해야함
		switch (value2) { 
		case 1: 
			System.out.println("1");
		case 2: 
			System.out.println("2");
		case 3: 
			System.out.println("3");
			break;
		default: 
			System.out.println("그 외 다른숫자");
		}
		
		//JDK7버전 이후 부터는 switch구분에 문자열도 사용 가능
		//현재 내버전은 17..LOL
		String str = "A";
		switch(str) {
			case "A":
				System.out.println("A");
			case "B":
				System.out.println("B");
				break;
			default :
				System.out.println("그 외 다른문자");
				
		}
		
	}

}
