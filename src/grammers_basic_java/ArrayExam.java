package grammers_basic_java;

public class ArrayExam {

	public static void main(String[] args) {
		int[] array1 = new int[100]; //배열은 처음만들때 정해진 크기가 변하지 않음
		//배열은 실제 값을 갖고 있는게 아니라 값이 들어있는 메모리 주소를 뜻하는 것
		array1[0] = 50; //0~99까지 100개의 값을 사용할 수 있음
		array1[1] = 100;
		
		int[] array2 = new int[] {1, 2, 3, 4}; //아래와 같은 뜻임
		//int[] array2 = {1, 2, 3, 4}
		// int[] array2 = new int[4] 
		// array2[0] = 1;
		// array2[1] = 2;
		// array2[2] = 3;
		// array2[3] = 4;
		
		System.out.println(array2[3]);
		
		int value = array2[0];
		System.out.println(value);
		
		
		for(int i = 0; i < 4; i++) {
			System.out.println(array2[i]);
		}

	}

}
