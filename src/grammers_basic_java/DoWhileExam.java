package grammers_basic_java;
import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		
		int value = 0;
		Scanner scan = new Scanner(System.in); //���� ���� ���� �Է¹ް� ������ ����ϴ� Ŭ����
									//System.in >> Ű����� ���� ���� �Է¹ްڴ�. >> Ű����� ���� ���� �Է¹޴� ScannerŬ����
		

		System.out.println("�Ʒ��� ���� �Է��� �ּ���.");
		
		do {
			//������ �ݺ��� �����
			//do�� ����߱� ������ ������ �ѹ��� �����
			value = scan.nextInt();
			System.out.println("�Է¹��� �� : " + value);
		} while(value != 10); //while���� ������ �����Ҷ��� �ٽ�do�� �ö󰡼� �����

		System.out.println("�ݺ��� ����!!");

	}

}
