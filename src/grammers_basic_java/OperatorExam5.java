package grammers_basic_java;

public class OperatorExam5 {

	public static void main(String[] args) {
		boolean b1 = true ; 
		boolean b2 = false ; 
		boolean b3 = true ; 

		System.out.println(b1 && b2);  //AND false
		System.out.println(b1 && b3);  //AND true
		System.out.println(b1 || b2);  //OR true
		System.out.println(b1 || b3);  //OR true
		System.out.println(b2 || b2);  //OR false

		int score = 88;
		if(score <= 100 && score >= 70) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		System.out.println(b1 ^ b2); //XOR (true false >> true)
		System.out.println(b1 ^ b1); //XOR (true true >> false)
		System.out.println(!b1); //NOT false
		System.out.println(!!b1); //NOT true
	}

}
