package grammers_basic_java;

public class AccessObj {

	public int p = 3 ;
	//모든 접근을 허용(전체공개)
	
	protected int p2 = 4 ;
	//같은 패키지인 경우 접근허용
	//다른 패키지라도 상속을 받을 경우 접근가능
	
	private int i = 1 ;
	//자기자신만 접근 가능
	
	int k = 2;
	//default 접근지정자 : 자기자신과 같은 패키지에서만 접근할 수 있다.
	
	
	//public > protected > default > private
	
}
