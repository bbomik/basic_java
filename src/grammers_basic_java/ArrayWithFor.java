package grammers_basic_java;

public class ArrayWithFor {

	public static void main(String[] args) {
		int [] iarray = new int[100];
		System.out.println(iarray.length);
		
		for(int i=0; i < iarray.length; i++) { //for�� �ȿ��� ����� ������ for�� �ȿ����� ������ �ۿ����� ����� �� ����
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
