package grammers_basic_java;

//�͸�Ŭ������ ����ϴ� ���� : Action�� ��ӹ޴� Ŭ������ ���� ���� �ʿ䰡 ���� ��쿡 ���
//Action�� ��ӹ޴� Ŭ������ �ش� Ŭ���� �ȿ����� ���ǰ� �ٸ�Ŭ�������� ���� ������ ���� ���
//���� MyAction�� ���� Ŭ������ ���� �ʿ䰡 ����(�ѹ��� �����̱� ������)
		

public class ActionExam {

	public static void main(String[] args) {
		/* �߻�Ŭ������ ����ϱ� ���� �Ϲ����� ����
		// Action action = new Action(); //Action�� �߻�Ŭ���� �ڽ��̱� ������ �������� ����
		Action action = new MyAction(); //MyAction���� ����
		action.exec(); //���
		*/
		
		//�͸�Ŭ������ �ڽ�Ŭ������ MyAction�� ������ �ʰ� ActionExam���� Action(�߻�Ŭ����)�� ��ӹ��� �͸�Ŭ������ ���� �ٷ� ����� ������.
		Action action = new Action() {//Action�� �߻� Ŭ�����̱� ������ Action��ü�� ���������� ����
			//������ �͸����� Ŭ������ �ϳ� �������.
			
			@Override
			public void exec() { //�ٸ� �޼��� ������ �����ϰ� �޼��带 ������ �� ����
				System.out.println("exec");
			}
			
			
		};
		
		action.exec();

	}

}
