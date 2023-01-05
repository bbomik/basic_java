package grammers_basic_java;

public interface Calculator {
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	//java8���ʹ� default��� Ű���带 �̿��� �޼ҵ� ������ �����ϴ�.
	//�������̽��� ������ �Ǹ� �� �������̽��� �����ϰ� �ִ� ��� Ŭ�������� �ش� �޼��带 �����ؾ��ϴ� �������� ����.
	//�̸� �ذ��ϱ� ���� default����� �߰���.
	default int exec(int i, int j) {
		return i + j;
	}
	
	//staticŰ���带 �̿��� �޼��� ������ �����ϴ�.
	public static int exec2(int i, int j) {
		return i * j ;
	}

}
