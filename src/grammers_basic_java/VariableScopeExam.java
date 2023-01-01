package grammers_basic_java;

public class VariableScopeExam {
	// ������ ��� ���� = ������ ����� ���

	int globalscope = 10;
	static int staticVal = 7;
	
	public void scopeTest(int value) {
		int localScope = 20;
		
		//Ŭ���� �Ӽ����� ����� ����globalscope ��� ����
		System.out.println(globalscope);
		
		//�ش� �� �� ������ localScope (�翬�� ��) ��� ����
		System.out.println(localScope);
		
		//�Ű������� ����� value�� ��밡��(��� �ۿ� ����������, �޼��� ����ο� �����ϹǷ� �ش� ���� ��� ����)
		System.out.println(value);
		
	}
	
	public void scopeTest2(int value2) {
		
		//Ŭ���� �Ӽ����� ����� ����globalscope ��� ����
		System.out.println(globalscope);
		
//		//�ٸ� �� �� ������ localScope ��� �Ұ���
//		System.out.println(localScope);
//		
//		//�ٸ� ���� �Ű������� ����� value�� ��� �Ұ���
//		System.out.println(value);
		
		//�� �ȿ��� ������ value2�� ��� ����
		System.out.println(value2);
		
	}
	
	public static void main(String[] args) {
		
//		//���� Ŭ���� �ȿ� ������ ��� �Ұ���
//		// >> static(�ؾ�� Ʋ : ��� Ŭ������ �ν��Ͻ�ȭ ���� ���� ä�� ���Ұ���)
//		// Ű���� static�� ����ϸ� �ν��Ͻ�ȭ(��ü�� ����) ���� �ʾƵ� ����� �� �ִ�.
//		// �׷��Ƿ� static�޼��� �ȿ� ������ static���� ���� �޼���� ����� �� ����.
//		System.out.println(globalscope);
		
		//���� Ŭ���� �ȿ� ������ static������ �����Ͽ� ��� ����
		System.out.println(staticVal);
		
//		//�ٸ� ���� ������ �޼��嵵(�翬����) ��� �Ұ���
//		 //�ش� �� �� ������ localScope (�翬�� ��) ��� ����
//		 System.out.println(localScope);
//		 //�Ű������� ����� value�� ��밡��(��� �ۿ� ����������, �޼��� ����ο� �����ϹǷ� �ش� ���� ��� ����)
//		 System.out.println(value);
		
		//Ŭ�������� ������ ���� ���� �ش簴ü�� �����ϸ��
		VariableScopeExam v1 = new VariableScopeExam();
		//���ÿ��� �ݵ�� ���۷��� ���� . �ʵ� �̸��� ����� ����� �� ���� 
		//�ν��Ͻ� ���� : globalscope���� �ν��Ͻ��� ������ �� ������ ������ �ǹ��Ѵ�.
		System.out.println(v1.globalscope);		
		
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalscope = 100;
		v2.globalscope = 200;
		System.out.println(v1.globalscope);
		System.out.println(v2.globalscope);
		
		// Ŭ���� ���� : static�ϰ� ����� ������ ���� ������ �� �ִ� ������ �ϳ��� �����ȴ�. �׷��Ƿ� �ν��Ͻ��� ������ �����ǵ� static�� ������ �ϳ��̴�.(���� ������ ����)
		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal); // 100���
		System.out.println(v2.staticVal); // 100��� //�Ǹ������� v2.staticVal = 100;������ �κ��� ���� ���� ����ٰ� ����ϸ� �ɵ�..����
		
		//static������ �ν��Ͻ��� ������� �ʾƵ� ��� �����ϱ� ������ "Ŭ�����̸� + static������" ���� ����ϴ� ���� �ٶ����ϴ�.
		System.out.println(VariableScopeExam.staticVal);
		
		

	}

}
