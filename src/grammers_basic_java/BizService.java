package grammers_basic_java;


//����� ���� exception�� ����ϴ� class

public class BizService {
	 //Business�� �����ϴ� Biz�޼���
	public void bizMethod(int i) throws BizException{ //BizException�� �߻��Ͽ����� throws(�Ѱ��ִ�) �������� �ۼ�
		System.out.println("�����Ͻ� �޼ҵ� ����");
		
		if(i < 0) {//i�� 0���� ���� ��
			//BizException�� �߻� ��Ŵ
			throw new BizException("�Ű����� i�� 0 �̻��̾�� �մϴ�."); // String���� �Ű������� �޾Ƶ帱 �� �־��� ������ BizException�� msg�� �Ѱ���
		}
		System.out.println("�����Ͻ� �޼ҵ� ����");
	}

}
