package grammers_basic_java;


//Exception처리를 무시하는 Throws처리

public class ExceptionExam2 {
	
	
	//2)아래에서 정의한 divide메서드 호출
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		//3)오류가 발생되는 부분을 try블록 처리.
		try {
		int k = divide(i, j); //throws사용으로 발생된 오류(예외)에 대해 메서드 내부에서 처리하지 않고 메서드를 호출한 쪽에서 처리할 수 있도록 오류를 떠넘김
		System.out.println(k);
		} catch(ArithmeticException e) {
			System.out.println(e.toString()); // 출력 > java.lang.ArithmeticException: / by zero >> 잘 처리됨
		}

	}
	
	//1)Throws처리를 사용할 메서드를 정의
	//throws : 내가 처리하지 않고 나를 호출한 쪽에서 처리하게 해주세요
	public static int divide(int i, int j) throws ArithmeticException{
		//오류를  하나만 처리할 수 있는게 아니라 여러개를 처리할 수 있음
		//예. (생략) throws ArithmeticException, ClasscasException{ // << 이런식으로 뒤에 ,를 사용해 계속 추가하면 됨
		int k = i/j; //디버깅 시 해당 줄에서 ArithmeticException가 발생되는 것을 알 수 있다.
		return k;
	}
	

}
