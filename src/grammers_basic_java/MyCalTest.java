package grammers_basic_java;

public class MyCalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new MyCal();
		cal.plus(3, 4);
		cal.multiple(5, 6);
		
		//default�� ������ �޼��嵵 ��밡��
		//cal.exec(0, 0);
		int i = cal.exec(5, 6);
		System.out.println(i);
		
		//static�޼��带 ����ϱ� ���ؼ���
		//�������̽���.�޼ҵ��(); ���� ����ؾ��Ѵ�.
		Calculator.exec2(3, 4);

	}

}
