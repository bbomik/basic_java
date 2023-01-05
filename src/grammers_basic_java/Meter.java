package grammers_basic_java;

public interface Meter {
	
	//public int BASE_FARE = 3000; // 기본요금(인터페이스에 정의한 변수는 상수라서 변경할 수 없습니다.)
	//보통의 상수 처리는 인터페이스에서 같이 선언하지만 클래스에서 상수의 값을 변경하게 될수도 있을 경우 다른 클래스에 옮겨서 사용하면 정상적으로 동작된다.

    public void start();
    public int stop(int distance);
    
    //인터페이스에서의 default함수 선언
    public default void afterMidnight() {
    	System.out.println("자정이 넘었습니다. 할증이 필요한 경우 이 메소드를 오버라이드 하세요.");
    }
    
}
