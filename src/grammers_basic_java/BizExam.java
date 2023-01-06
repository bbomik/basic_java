package grammers_basic_java;

//BixService.java를 이용하는 코드

public class BizExam {

	public static void main(String[] args) {
		BizService biz = new BizService();
		
		 //BizService에서 i는 0보다 커야한다고 정함
		biz.bizMethod(5); //정상적으로 bizMethod 동작 
		
		try { //예외처리
			biz.bizMethod(-3);
		} catch(Exception e){
			e.printStackTrace();
		}

	}

}
