package grammers_basic_java;

public class ArrayExam2 {

	public static void main(String[] args) {
		// 2���� �迭�̶�? �迭�� �迭�� �ǹ�
		int[][] array4 = new int[3][4];
		
		//error ��
		//array4[0] = 10;
		//���� > array4[0] �κ��� ���� int���� ���� �� �ִ� �κ��� �ƴ϶� int�� �迭�� ����ų �� �ִ� ���� �����̱� ������ ���� ���� ���� ���� �����ϴ�.
		
		array4[0][1] = 10;
		
		//2���� �迭 ����� ũ�Ⱑ �ٸ� �迭�� ������ ���� ����(�ݵ�� ũ�Ⱑ ���� �迭�� ���� �����Ѱ��� �ƴ�)
		int[][] array5 = new int[3][]; // <-�̷� ������ �ڿ� �ִ� �迭 ũ�⸦ ����൵ ��
		
		//array5[0][0] = 10; //�� �迭�� ������ �ʰ� ����� �������� �� ��� ������ â������ ���� error�� �ȳ����� ������ �� error ��
		
		array5[0] = new int[1]; //�� �迭�� ���ϰ� ����
		array5[0][0] = 10; //����� ������ ��
		//�� �ܿ���
		array5[1] = new int[2];
		array5[2] = new int[3]; //�̷������� ���� ũ�Ⱑ �ٸ� �迭�� ���� �� ����
			
		
		int[][] array6 = {{1},{1,2},{1,2,3}};
		//System.out.println(array6); ��� [[I@1563da5  �̷��� ���� ����..
		System.out.println(array6[0][0]);
		System.out.println(array6[2][2]);
		
		

	}

}
