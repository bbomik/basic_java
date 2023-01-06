package grammers_basic_java;

/* 사용자 정의 Exception
 * 사용법
 * 1. exception class가 이미 자바에서 정의해 놓은 클래스들이 사용될수도 있음
 * 2. 사용자가 직접 exception을 정의해서 사용할 수도 있음
 * 3. 사용자는 exception이나 runtime exception이라는 클래스를 상속을 받아서 새로운 exception class를 만들어낼 수도 있음
 *    >> 새로운 exception class를 만드는 이유
 *       exception class 자체가 특별한 일을 막 해내는 것은 아니나 "이름" 때문
 *       클래스의 이름만 봐도 어떤 오류가 발생했는지 직관적으로 사용자가 쉽게 알게하기 위하려는 목적을 가짐
 * 
 * checked exception : exception을 상속받은 class들
 *                     오류처리를 하지 않으면 compile오류가 발생하기 때문에 "반드시" 오류를 처리해야 하는 exception들을 가리킴
 * unckecked exception : runtime exception을 상속받는 class들  
 *                       오류처리를 반드시 하지 않아도 compile 상에서 오류를 발생시키지 않음.
 *                       (하지만, 모든 예외상황에 대해 적절히 처리해주는 것이 프로그래밍이 안정적으로 수행 됨)        
 */

//업무관련 메서드(Business method)선언
public class BizException extends RuntimeException { // 1) RuntimeException을 상속받는 BizException 생성
	
	// 2) String 생성자 정의
	public BizException(String msg) { //문자열로된 오류메세지를 담을 생성자 = msg
		super(msg); //super(부모)로 msg를 보냄
		
	}
	
	// 2) Exception 생성자 정의
	public BizException(Exception ex) { //실제 발생할 exception을 담을 목적의 생성자 = ex
		super(ex); //exception을 받아드려 해당exception을 부모에 생성자에게 넘겨줄수 있는 생성자를 정의함
		
	}

/* 이미 부모 클래스가 같은 기능을 갖고 있는 생성자가 있기 때문에 사용자가 정의한 exception 객체에서 따로 할 일은 없음
 * 해당 생성자를 부모의 생성자에게 전달만 시켜주면 됨. >> super(); >> 부모의 생성자를 호출하는 메서드 사용
 * super메서드에 매개변수로 전달받은 값(msg, ex) 만 보내주면 됨 
 *  >> 사용자 정의 exception정의 완료
 */

}
