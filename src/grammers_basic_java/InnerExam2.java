package grammers_basic_java;

import grammers_basic_java.InnerExam1.Cal;

//���� Ŭ����2 : ���� ��øŬ����(����ƽ Ŭ����static class)
//�ʵ尡 ������(static��) �ʵ��� Ư¡�� ����.
public class InnerExam2 {
	static class Cal { // <<static���� ����� Cal�� �Ϲ� ����Ŭ������ ����ϴ� ����� �ٸ�
		int value = 0;

		public void plus() {
			value++;
		}
	}

	public static void main(String[] args) {
		
		//�Ϲ� ����Ŭ������ ��� �� ����Ŭ������ �ݵ�� ���� ���� �� ��밡��
		//��1. InnerExam1 t = InnerExam1();
		//    InnerExam1.Cal cal = t.new Cal();
		//��2. InnerExam1 t = new InnerExam1();
		//    InnerExam1.Cal cal = t.new Cal();
		
		//������ staticŬ������ static�� Ŭ�����̱� ������ ����Ŭ������ ���� �������� �ʰ�(���� ������ �ʿ� ����)
		//�ٷ� ��밡��
		InnerExam2.Cal cal = new InnerExam2.Cal();
		cal.plus();
		System.out.println(cal.value);

	}

}
