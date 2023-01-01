package grammers_basic_java;

public class ArrayWithFor {

	public static void main(String[] args) {
		int [] iarray = new int[100];
		System.out.println(iarray.length);
		
		for(int i=0; i < iarray.length; i++) { //for문 안에서 선언된 변수는 for문 안에서만 동작함 밖에서는 사용할 수 없음
			iarray[i] = i+1;
			System.out.println(iarray[i]);
		}
		
		int sum = 0;
		for(int i=0; i< iarray.length; i++) {
			System.out.println(sum);
			sum += iarray[i] ; 
		}
		System.out.println(sum);
		

	}

}
