package grammers_basic_java;

public class forEachExam {

	public static void main(String[] args) {
		//�ڹ�1.5�������� for each���� �߰���(�ڹٿ��� ������ for������ ���������, ��κ� �ٸ����� for each������ ���Ǿ� for each���� �߰��Ѱɷ� ������)
		
		//�迭����
		int iarr[] = {10, 20, 30, 40, 50};
		//for���� Ȱ���� �迭 ���
		for(int i = 0 ; i < iarr.length; i++) {
			//System.out.println(iarr[i]);
			int value = iarr[i];
			System.out.println(value);
		}

		System.out.println("");
		
		//for���� ;�����ݷ��� �������� 3���� ����������
		//for each���� :�ݷ��� �������� 2���� ����
		//��) for(Ÿ�� ���� �޾��� ������ : ����ϰ� ���� �ڷᱸ��)
		for(int value:iarr) { //for each�� ������ ���� �޴� �������� �迭 ���
			System.out.println(value);
		}
	}

}
