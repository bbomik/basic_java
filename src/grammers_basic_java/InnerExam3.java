package grammers_basic_java;

//����Ŭ����3 : ���� ��ø Ŭ����(����Ŭ���� local class)
//����Ŭ������ �޼��� �ȿ��� ����Ǵ� ���
public class InnerExam3 {
	
	public void exec() {
		class Cal{
			int value = 0 ;
			public void plus() {
				value ++;
			}
		}
		
		//Cal(������øŬ����)���� ������ ��ü�� �޼��� �ȿ����� ��� ����
		Cal cal = new Cal();
		cal.plus(); //�޼��� �ȿ����� �޼��� ���
		System.out.println(cal.value); //�޼��� �ȿ����� ��ü ȣ��
		
	}

	public static void main(String[] args) {
		
		//Cal(������øŬ����)����ϰ��� �ϴ� ���
		InnerExam3 t = new InnerExam3(); //����Ŭ������ ����(Cal�̶�� Ŭ������ �ϳ� ����)
		t.exec();
		
		// >> �޼��� �ȿ����� Ŭ������ �������� ó�� ������ ����� �� ����.

	}

}
