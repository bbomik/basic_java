package grammers_basic_java;

public class EnumExam {

	// ������ : JDK5���� �߰��� ����
	// ������ ���� ������ public�� static, final�� ����Ͽ� ����� ����Ͽ���
	public static final String MALE="MALE"; //����� �����Ҷ� ��ü ���ڿ��� �빮�ڷ� ����ϴ� ���� ���ʿ���
	public static final String FEMALE="FEMALE"; 
	
	public static void main(String[] args) {
		String genter1;
		genter1 = EnumExam.MALE;
		genter1 = EnumExam.FEMALE;
		
		//genter1�� String���� ����Ǿ��� ������ MALE�̳� FEMALE�� �ƴ� �ٸ� ���ڿ��� �Է°����� ������ �߻���
		genter1 = "boy"; // <-"boy"�� ���� ��ġ �ʴ� ���� ������ ���ϵ��� ����ϴ� ����� "������" ��
		
		
		//�ڵ�󿡼� ������ ��� �� Gender��ü�� Ÿ���� ��
		//���� String��� ���� Ÿ���� �ƴ� GenderŸ������ ������.
		Gender gender2 ;
		gender2 = Gender.MAEL;
		gender2 = Gender.FEMALE;
		
		//gender2 = "boy"; //Ư�� �� �� �ٸ� ���� �Է� �� ���� �߻�
		

		
		
	}

}

//������ �����  >>  enum �̸�{��1, ��2;}
enum Gender{
	MAEL, FEMALE;
}