package grammers_basic_java;

public class IfExam {

	public static void main(String[] args) {
		int x = 50 ;
		int y = 60 ;
		
		if( x < y ) {
			System.out.println("x는 y보다 작습니다.");
		} 
		
		if(x==y) {
			System.out.println("x와 y는 같습니다.");
		}

		
        //괄호 유무 TEST
		int x2 = 50 ;
		int y2 = 50 ;
		
		if( x2 < y2 ) {
			System.out.println("x2는 y2보다 작습니다.1");
			System.out.println("괄호 유무 TEST1");
		} 
		
		if(x2 < y2) //괄호가 없을 경우 if문에 해당되는 것은 바로 한줄만 적용됨
			System.out.println("x2는 y2보다 작습니다.2");
			System.out.println("괄호 유무 TEST2");
		
        //if, else if, else 구문
		int x3 = 50 ;
		int y3 = 60 ;
	    if(x3 == y3) {
	    	System.out.println("x3와 y3는 같습니다.");
	    } else if(x3 > y3){
	    	System.out.println("x3이 y3보다 큼니다.");
	    } else {
	    	System.out.println("y3이 x3보다 큼니다.");
	    }
		
	}

}
