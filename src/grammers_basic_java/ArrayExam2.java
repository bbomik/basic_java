package grammers_basic_java;

public class ArrayExam2 {

	public static void main(String[] args) {
		// 2차원 배열이란? 배열의 배열을 의미
		int[][] array4 = new int[3][4];
		
		//error 남
		//array4[0] = 10;
		//이유 > array4[0] 부분은 실제 int값을 담을 수 있는 부분이 아니라 int형 배열을 가리킬 수 있는 참조 변수이기 때문에 정수 값을 담을 수는 없습니다.
		
		array4[0][1] = 10;
		
		//2차원 배열 선언시 크기가 다른 배열을 선언할 수도 있음(반드시 크기가 같은 배열만 선언 가능한것이 아님)
		int[][] array5 = new int[3][]; // <-이런 식으로 뒤에 있는 배열 크기를 비워줘도 됨
		
		//array5[0][0] = 10; //뒤 배열을 정하지 않고 상수를 넣으려고 할 경우 에디터 창에서는 당장 error는 안나지만 컴파일 시 error 남
		
		array5[0] = new int[1]; //뒤 배열을 정하고 난뒤
		array5[0][0] = 10; //상수를 넣으면 들어감
		//이 외에도
		array5[1] = new int[2];
		array5[2] = new int[3]; //이런식으로 각기 크기가 다른 배열을 만들 수 있음
			
		
		int[][] array6 = {{1},{1,2},{1,2,3}};
		//System.out.println(array6); 출력 [[I@1563da5  이렇게 나옴 ㅋㅋ..
		System.out.println(array6[0][0]);
		System.out.println(array6[2][2]);
		
		

	}

}
