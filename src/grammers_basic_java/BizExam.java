package grammers_basic_java;

//BixService.java�� �̿��ϴ� �ڵ�

public class BizExam {

	public static void main(String[] args) {
		BizService biz = new BizService();
		
		 //BizService���� i�� 0���� Ŀ���Ѵٰ� ����
		biz.bizMethod(5); //���������� bizMethod ���� 
		
		try { //����ó��
			biz.bizMethod(-3);
		} catch(Exception e){
			e.printStackTrace();
		}

	}

}
