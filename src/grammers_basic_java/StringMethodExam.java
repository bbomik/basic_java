package grammers_basic_java;

public class StringMethodExam {

	public static void main(String[] args) {
		
		//new �����ڸ� �̿��� ��ü�� �����ϴ� ���� ���� �Ϲ���
		//String str = new String("hello");
		
		//�ڹٿ��� ���帹�� ���Ǵ�String�� ���������� ������ ���� ��ü�� ������ �� �ִ�.
		String str = "Hello";
		
		//���ڿ��� ���̸� ���� �˷��ִ� �޼���
		//str.length();
		System.out.println(str.length()); //���鵵 �ϳ��� ���ڷ� ó��

		//concat�޼��� : ���ڿ��� ���ڿ��� �������ִ� �޼���
		System.out.println(str.concat(" world"));
		
		//concat �� str���
		//String�� �ѹ� ������� ��ü�� �ٲ��� ���� = "�Һ� Ŭ����"
		System.out.println(str);
		//concat method���� world��� ���ο� ��ü�� ���� >> concat������� ���ڿ��� ���յǾ� ���̴��� ���� ���յ� ������str���� ���� ���� �ƴ�
		//concat method�� ����� ������ str�� ���� �ٲٰ� �ʹٸ�
		str = str.concat(" world"); //str���� ���� �����ؼ� �ٲپ� �־����
		System.out.println(str);
		
		//substring�޼��� : ���ڿ��� �߶󳻴� �޼���
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7));
		

	}

}
