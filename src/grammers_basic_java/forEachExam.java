package grammers_basic_java;

public class forEachExam {

	public static void main(String[] args) {
		//자바1.5버전에서 for each문이 추가됨(자바에는 기존의 for문으로 충분하지만, 대부분 다른언어에는 for each문으로 사용되어 for each문을 추가한걸로 보여짐)
		
		//배열생성
		int iarr[] = {10, 20, 30, 40, 50};
		//for문을 활용한 배열 출력
		for(int i = 0 ; i < iarr.length; i++) {
			//System.out.println(iarr[i]);
			int value = iarr[i];
			System.out.println(value);
		}

		System.out.println("");
		
		//for문은 ;세미콜론을 구분으로 3개로 나뉘었지만
		//for each문은 :콜론을 구분으로 2개로 나뉨
		//예) for(타입 값을 받아줄 변수명 : 출력하고 싶은 자료구조)
		for(int value:iarr) { //for each는 별도의 값을 받는 변수선언에 배열 출력
			System.out.println(value);
		}
	}

}
