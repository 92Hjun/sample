import java.util.Scanner;
import java.util.regex.Pattern;

public class Quiz4 {
	public static void main(String[] args) {

		// ���̵� �Է¹޾� �ùٸ� ���̵����� �˻��ϱ�
		// ���̵� �ۼ� ��Ģ(���̰� 6���� �̻�, ���� �ҹ��ڸ� ����)
		Scanner sc = new Scanner(System.in);

			System.out.print("���̵� �Է��ϼ��� >");
			String userId = sc.next();

			// �˻��ϱ�			
			// ���̵� 6���� �̻����� �˻��ϱ�
			int len = userId.length();
			if ( len<6 ) {
				System.out.println("���̵� 6���� �̻� �Է����ּ���.");
				return;
			}
			
			// ���̵� ���� �ҹ��ڷθ� �����Ǿ����� �˻��ϱ� <---- boolean����
			// Flag ���� : ���� ������ Ư�� ���¸� �����ϴ� ����
			boolean invalid = false;
			for(int i=0; i<userId.length(); i++) {
				int c = userId.charAt(i);
				if( c<97 || c>122 ) { 
					invalid = true;
					break;
				}
			}
			if(invalid) {
				System.out.println("ID�� �ҹ��ڷθ� �����Ǿ����� �ʽ��ϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");				
			} else {
				System.out.println("ID�� �ҹ��ڷθ� �����Ǿ����ϴ�.");
			}
		

		//���� ǥ���� (���ͳݿ� ����)					// import java.util.regex.Pattern; �� ���
			boolean valid = false;
			String regExp = "^[a-z]{6,}$";				// ^�� ǥ���� ����, &�� ����
			valid = Pattern.matches(regExp, userId);	// a���� z���� 6�ڸ� �̻� �����°�.

			if( !valid ) {
				System.out.println("��ȿ���� ����");
			}/*
			// id, pw, ��¥, email �� Ư���� ������ ������ �� ����Ѵ�.
			\\d = ���� (�������� 2��)
			\\D = ���ڰ� �ƴ� ��
			010 - 1234 -5678�� "\\d{3}-\\d{4}-\\d{4}"
		*/
	}
}