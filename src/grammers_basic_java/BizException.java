package grammers_basic_java;

/* ����� ���� Exception
 * ����
 * 1. exception class�� �̹� �ڹٿ��� ������ ���� Ŭ�������� ���ɼ��� ����
 * 2. ����ڰ� ���� exception�� �����ؼ� ����� ���� ����
 * 3. ����ڴ� exception�̳� runtime exception�̶�� Ŭ������ ����� �޾Ƽ� ���ο� exception class�� ���� ���� ����
 *    >> ���ο� exception class�� ����� ����
 *       exception class ��ü�� Ư���� ���� �� �س��� ���� �ƴϳ� "�̸�" ����
 *       Ŭ������ �̸��� ���� � ������ �߻��ߴ��� ���������� ����ڰ� ���� �˰��ϱ� ���Ϸ��� ������ ����
 * 
 * checked exception : exception�� ��ӹ��� class��
 *                     ����ó���� ���� ������ compile������ �߻��ϱ� ������ "�ݵ��" ������ ó���ؾ� �ϴ� exception���� ����Ŵ
 * unckecked exception : runtime exception�� ��ӹ޴� class��  
 *                       ����ó���� �ݵ�� ���� �ʾƵ� compile �󿡼� ������ �߻���Ű�� ����.
 *                       (������, ��� ���ܻ�Ȳ�� ���� ������ ó�����ִ� ���� ���α׷����� ���������� ���� ��)        
 */

//�������� �޼���(Business method)����
public class BizException extends RuntimeException { // 1) RuntimeException�� ��ӹ޴� BizException ����
	
	// 2) String ������ ����
	public BizException(String msg) { //���ڿ��ε� �����޼����� ���� ������ = msg
		super(msg); //super(�θ�)�� msg�� ����
		
	}
	
	// 2) Exception ������ ����
	public BizException(Exception ex) { //���� �߻��� exception�� ���� ������ ������ = ex
		super(ex); //exception�� �޾Ƶ�� �ش�exception�� �θ� �����ڿ��� �Ѱ��ټ� �ִ� �����ڸ� ������
		
	}

/* �̹� �θ� Ŭ������ ���� ����� ���� �ִ� �����ڰ� �ֱ� ������ ����ڰ� ������ exception ��ü���� ���� �� ���� ����
 * �ش� �����ڸ� �θ��� �����ڿ��� ���޸� �����ָ� ��. >> super(); >> �θ��� �����ڸ� ȣ���ϴ� �޼��� ���
 * super�޼��忡 �Ű������� ���޹��� ��(msg, ex) �� �����ָ� �� 
 *  >> ����� ���� exception���� �Ϸ�
 */

}
