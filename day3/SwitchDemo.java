import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("����� �Է��Ͻʽÿ� : ");
		String grade = sc.next();

		switch (grade) {
			case "Gold" :
				System.out.println("����� ���� ȯ���մϴ�.");
				break;	
			case "Silver" :
				System.out.println("�ǹ���� ���� ȯ���մϴ�.");
				break;
			case "Bronze" :
				System.out.println("������� ���� ȯ���մϴ�.");
				break;
			default:
				System.out.println("�մ� ȯ���մϴ�.");
				break;
		}
	}	
}