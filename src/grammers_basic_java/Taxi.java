package grammers_basic_java;

public class Taxi implements Meter {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("가다.");

	}
	
	public int BASE_FARE = 3000; // 기본요금(인터페이스에 정의한 변수는 상수라서 변경할 수 없습니다.) 

	@Override
	public int stop(int distance) {
		int fare = BASE_FARE + distance * 2;
        System.out.println("운행을 종료합니다. 요금은 " + fare + "원 입니다.");
        return fare;
	}
	
    //default메서드의 오버라이드
	//활성화 시 주석 처리 제거
//	public void afterMidnight() {
//		
//	}
	
}
