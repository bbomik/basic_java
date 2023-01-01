package grammers_basic_java;
import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		
		int value = 0;
		Scanner scan = new Scanner(System.in); //어디로 부터 값을 입력받고 싶을때 사용하는 클래스
									//System.in >> 키보드로 부터 값을 입력받겠다. >> 키보드로 부터 값을 입력받는 Scanner클래스
		

		System.out.println("아래에 값을 입력해 주세요.");
		
		do {
			//실제로 반복할 문장들
			//do를 사용했기 때문에 무조건 한번은 실행됨
			value = scan.nextInt();
			System.out.println("입력받을 값 : " + value);
		} while(value != 10); //while문의 조건을 만족할때만 다시do로 올라가서 실행됨

		System.out.println("반복문 종료!!");

	}

}
