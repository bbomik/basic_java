package grammers_basic_java;

public class SwitchExam {

	public static void main(String[] args) {
		// switch, case, default, break ���� Ȱ��
		
		int value = 1;
		
		switch (value) { //switch�� ���� case���� ������ case���� ��� ����
		case 1: 
			System.out.println("1");
		case 2: 
			System.out.println("2");
		case 3: 
			System.out.println("3");
		default: 
			System.out.println("�� �� �ٸ�����");
		}


		int value2 = 2;
		
		switch (value2) { //switch�� ���� case���� ������ case���� ��� ���� ���ְ� �ϰ� �ʹٸ� break���� ����ؾ���
		case 1: 
			System.out.println("1");
		case 2: 
			System.out.println("2");
		case 3: 
			System.out.println("3");
		default: 
			System.out.println("�� �� �ٸ�����");
		}
		
		//case ������ ���ְ� �ϰ� �ʹٸ� break���� ����ؾ���
		switch (value2) { 
		case 1: 
			System.out.println("1");
		case 2: 
			System.out.println("2");
		case 3: 
			System.out.println("3");
			break;
		default: 
			System.out.println("�� �� �ٸ�����");
		}
		
		//JDK7���� ���� ���ʹ� switch���п� ���ڿ��� ��� ����
		//���� �������� 17..LOL
		String str = "A";
		switch(str) {
			case "A":
				System.out.println("A");
			case "B":
				System.out.println("B");
				break;
			default :
				System.out.println("�� �� �ٸ�����");
				
		}
		
	}

}
