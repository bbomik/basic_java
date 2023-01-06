package grammers_basic_java;

public class ExceptionExam3 {

	//강제로 오류를 발생시키는 throw
	//throw는 오류를 떠넘기는 throws와 보통 같이 사용됨
	
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		// 2)오류 수정블록(try)
		try {
		int k = divide(i, j);
		System.out.println(k);
		} catch (IllegalArgumentException e) {
			System.out.println(e.toString());
		}
	}
	
	public static int divide(int i, int j) throws IllegalArgumentException{
		
		if(j==0) {
//			System.out.println("2번째 매개변수는 0이면 안됩니다.");
//			return 0;
			
			throw new IllegalArgumentException("0으로 나눌 수 없습니다.");	//1) 오류를 직접 발생 시키는 코드	 
			//throw키워드의 의미 : 해당 라인에서 exception이 발생한다.
		}
		
		int k = i / j ;
		return k;
		
	}

}
