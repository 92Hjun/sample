import java.util.Scanner;

public class Quiz1 {
	
	public static void main(String[] args) {
		// �̸����� �Է¹޾Ƽ� �̸��Ͽ� ���Ե� ���̵�κи� ����ϱ�
		// ��) korea33@hanmail.net ---> korea

		Scanner sc = new Scanner(System.in);

		System.out.print("�̸����� �Է��ϼ��� >");
		String email = sc.next();

		/* ���1
		// indexOf(), substring();
		int index = email.indexOf("@");
		String id = email.substring(0, index);
		System.out.println("���̵�:" + id);
		*/

		// ���2
		String[] arr = email.split("@");
		System.out.println("���̵�:" + arr[0]);
	}
}
