package grammers_basic_java;

public class ExceptionExam {

	public static void main(String args[]) {

		int i = 10;
		int j = 0; //int j = 5;  // j가 예외를 뱉어내는 0이든 예외를 뱉어내지 않는 정수이든 finally는 무조건 실행됨
		
		/* try-catch-finally : 예외상황을 미리 예측하고 예외처리 하는 것
		 * try부분 : 수행할 코드(예외 발생 가능성이 있는 블록)
		 * catch부분 : 예외처리 블록
		 * finally부분 : 예외 발생 여부에 상관없이 반드시 실행되는 블록(생략가능)
		 * 	 */
		
		try { //예외가 발생되는 부분을 try블록으로 묶는다.
			
		int k = i / j; //10/0의 식으로 k가 동작할때 자바는 예외적인인 상황으로 판단하여 예외 처리 함
		System.out.println(k);
		
		//기존 예외 발생시 뱉어낸 예외 java.lang.ArithmeticException/ by zero:
		//혹 여러개의 예외를 뱉어낸다면 발생된 예외에 맞춰 여러개의 catch블록 생성도 가능
		} catch (ArithmeticException e) {  //발생할 수 있었던 ArithmeticException을 적어준다.
			//에외가 발생시 수행해야할 코드

			//ArithmeticException이라는 예외 객체를 e라는 래퍼런스 객체가 가르키고 있음
			
			//e라는 래퍼런스 변수는 toString()이라는 메서드를 가지고 있음
			//예외클래스변수명.toString() >>예외의 정보를 알려주는 메소드
			System.out.println("0으로 나눌 수 없습니다."+e.toString());
		}finally {
			System.out.println("오류가 발생했든 발생하지 않았든 무조건 실행!!");
		}
		
		//Exception클래스들은 모두 Exception클래스를 상속받으므로,
		//예외클래스에 Exception을 두게 되면 어떤 오류가 발생하든지 간에
		//하나의 catch블록에서 모든 오류를 처리할 수 있다.
		
		System.out.println("main end!");

	}

}
