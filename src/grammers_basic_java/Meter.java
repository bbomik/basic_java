package grammers_basic_java;

public interface Meter {
	
	//public int BASE_FARE = 3000; // �⺻���(�������̽��� ������ ������ ����� ������ �� �����ϴ�.)
	//������ ��� ó���� �������̽����� ���� ���������� Ŭ�������� ����� ���� �����ϰ� �ɼ��� ���� ��� �ٸ� Ŭ������ �Űܼ� ����ϸ� ���������� ���۵ȴ�.

    public void start();
    public int stop(int distance);
    
    //�������̽������� default�Լ� ����
    public default void afterMidnight() {
    	System.out.println("������ �Ѿ����ϴ�. ������ �ʿ��� ��� �� �޼ҵ带 �������̵� �ϼ���.");
    }
    
}
