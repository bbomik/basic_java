package grammers_basic_java;

public class ArrayExam {

	public static void main(String[] args) {
		int[] array1 = new int[100]; //�迭�� ó�����鶧 ������ ũ�Ⱑ ������ ����
		//�迭�� ���� ���� ���� �ִ°� �ƴ϶� ���� ����ִ� �޸� �ּҸ� ���ϴ� ��
		array1[0] = 50; //0~99���� 100���� ���� ����� �� ����
		array1[1] = 100;
		
		int[] array2 = new int[] {1, 2, 3, 4}; //�Ʒ��� ���� ����
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
