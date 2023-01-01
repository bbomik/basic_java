package grammers_basic_java;

public class OperatorExam {

	public static void main(String[] args) {
		int i1 = -5;
		int i2 = +i1;
		int i3 = -5;
		
		System.out.println(i1); // -5
		System.out.println(i2); // -5
		System.out.println(i3); // -5
		
		int i4 = -i1;
		System.out.println(i4); // 5
		
		/*  +��ȣ�� +��Ʈ�� �״�� ���������ִ� ������ ��
		 * -��ȣ�� ������ �����, ����� ������ �ٲپ��ִ� ������ ��
		 * */
		
		//�̷������ڸ� �ǿ����� �տ� ���� ���� �ְ� �ڿ� ���� ���� ����
		
		int i5 = ++i4; // ++i4�� �ǹ� i4 = i4+1�� ���� �ٲ۴�.
		System.out.println(i5); // 5+1 = 6
		System.out.println(i4); // i4�� 6���� ���ŵ� ���� = 6
		
		int i6 = i4++; // i4++�� �ǹ� i4 = i4+1
		System.out.println(i6); // ++�� �ڿ� ���� ��� ���� �������� �����Ѵ�. (���� i4���� 6 ���)
		System.out.println(i4); // ������ ������ ������ ���� �ٲ۴�. (+1�� 7 ���)
		
		//������� ����
		int i = 5;
		int j = 2;
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j); //int�� ����� ���� ���� ������ ���� ������ ���� ����
		System.out.println(i/(double)j); //�ǿ����� �� �ϳ��� �Ǽ��� ����ȯ�� �ϸ� �Ǽ��� ���� ����(ĳ���ÿ���)
		System.out.println((double)i/j); //�ǿ����� �� �ϳ��� �Ǽ��� ����ȯ�� �ϸ� �Ǽ��� ���� ����(ĳ���ÿ���)
		System.out.println(i%j);//������ ���� ���(��ⷯ����)

	}

}
