package grammers_basic_java;

public class InnerExam1 {
	
	//����Ŭ���� �ǽ�
	//�ʵ带 ������ ��ġ�� Ŭ������ ����
	class Cal{
		int value = 0;
		
		//�Ϲ����� Ŭ������ �����ϰ� �ʵ带 ������ ���� �ְ�,
		//�޼��带 ������ ���� �ִ�.
		public void plus() {
			value ++;
		}
	}
	
	public static void main(String[] args) {
		
		//����Ŭ���� ��� ��.
		/* 1��
		 * InnerExam1 t = InnerExam1(); //ȥ�� ���������� ������� �� ������ new�����ڴ� ������� ����.
		   t.new Cal(); //InnerExam1������ t�� ���� �� new�����ڸ� ���� ����(��ü����)�� ������.
		 */
		
		// 2�� Ÿ���� ����Ǵ� ���
		//�ٱ���(Inner)Ŭ���� Ÿ��.����Ŭ���� Ÿ��  ���� ���Ǿ�� ��
		InnerExam1 t = new InnerExam1(); //�ٱ��ʿ� �ִ� Ŭ������ new�����ڷ� ����� ��
		InnerExam1.Cal cal = t.new Cal(); //�̷��� ����� �� ������ �����ϴ� ��� ����
		
		cal.plus();
		System.out.println(cal.value);
		
	}

}
