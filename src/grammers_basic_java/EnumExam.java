package grammers_basic_java;

public class EnumExam {

	// 열거형 : JDK5에서 추가된 문법
	// 열거형 등장 전에는 public과 static, final을 사용하여 상수를 사용하였음
	public static final String MALE="MALE"; //상수를 선언할때 전체 문자열을 대문자로 사용하는 것이 관례였음
	public static final String FEMALE="FEMALE"; 
	
	public static void main(String[] args) {
		String genter1;
		genter1 = EnumExam.MALE;
		genter1 = EnumExam.FEMALE;
		
		//genter1이 String으로 선언되었기 때문에 MALE이나 FEMALE이 아닌 다른 문자열도 입력가능한 문제가 발생됨
		genter1 = "boy"; // <-"boy"와 같이 원치 않는 값이 들어오지 못하도록 사용하는 방법이 "열거형" 임
		
		
		//코드상에서 열거형 사용 시 Gender자체가 타입이 됨
		//따로 String등과 같은 타입이 아닌 Gender타입으로 선언함.
		Gender gender2 ;
		gender2 = Gender.MAEL;
		gender2 = Gender.FEMALE;
		
		//gender2 = "boy"; //특정 값 외 다른 값을 입력 시 오류 발생
		

		
		
	}

}

//열거형 선언시  >>  enum 이름{값1, 값2;}
enum Gender{
	MAEL, FEMALE;
}