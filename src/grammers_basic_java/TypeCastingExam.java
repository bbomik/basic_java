package grammers_basic_java;

public class TypeCastingExam {

	public static void main(String[] args) {
		int x = 50000;
		long y = x; //x에 있는 것이 y로 들어갔기 때문에 형변환이 일어났다고 보면 됨.
		
		long x2 = 5;
		// int y2 = x2; //int를 long타입에 넣을 수 있지만 long타입을 int에 담을 수 없다
		int y2 = (int) x2; //long타입을 int로 형변환을 해야한다면 ()를 사용하여 강제 형변환을 할 수 있다.
		
		

	}

}
