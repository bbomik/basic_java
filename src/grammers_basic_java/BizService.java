package grammers_basic_java;


//사용자 정의 exception을 사용하는 class

public class BizService {
	 //Business를 수행하는 Biz메서드
	public void bizMethod(int i) throws BizException{ //BizException이 발생하였을때 throws(넘겨주는) 로직으로 작성
		System.out.println("비지니스 메소드 시작");
		
		if(i < 0) {//i가 0보다 작을 때
			//BizException을 발생 시킴
			throw new BizException("매개변수 i는 0 이상이어야 합니다."); // String으로 매개변수를 받아드릴 수 있었기 때문에 BizException의 msg를 넘겨줌
		}
		System.out.println("비지니스 메소드 종료");
	}

}
