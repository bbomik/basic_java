package grammers_basic_java;

public class IfExam {

	public static void main(String[] args) {
		int x = 50 ;
		int y = 60 ;
		
		if( x < y ) {
			System.out.println("x�� y���� �۽��ϴ�.");
		} 
		
		if(x==y) {
			System.out.println("x�� y�� �����ϴ�.");
		}

		
        //��ȣ ���� TEST
		int x2 = 50 ;
		int y2 = 50 ;
		
		if( x2 < y2 ) {
			System.out.println("x2�� y2���� �۽��ϴ�.1");
			System.out.println("��ȣ ���� TEST1");
		} 
		
		if(x2 < y2) //��ȣ�� ���� ��� if���� �ش�Ǵ� ���� �ٷ� ���ٸ� �����
			System.out.println("x2�� y2���� �۽��ϴ�.2");
			System.out.println("��ȣ ���� TEST2");
		
        //if, else if, else ����
		int x3 = 50 ;
		int y3 = 60 ;
	    if(x3 == y3) {
	    	System.out.println("x3�� y3�� �����ϴ�.");
	    } else if(x3 > y3){
	    	System.out.println("x3�� y3���� ŭ�ϴ�.");
	    } else {
	    	System.out.println("y3�� x3���� ŭ�ϴ�.");
	    }
		
	}

}
