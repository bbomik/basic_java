package grammers_basic_java;

public class ForExam {

	public static void main(String[] args) {
		
		int total = 0;
		for(int i = 1; i <= 100; i++) {
			//변수선언 ; 조건문 ; 조건만족 시 동작
			//조건을 만족하지 않을 시 for문을 나옴
			if(i%2 != 0) {
				continue; //그냥 통과 //다시 for문으로 올라감
			}

//			total = total +i;
//			if(i==50) {
//				break; //중간에 빠져나올 경우 break 사용
//			}
		}

		System.out.println(total);

	}

}
