import java.util.*;

public class IfDemo1 {
	public static void main(String[] args) {
		System.out.println("���α׷��� �����մϴ�");

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		
		int score = sc.nextInt();
		if (score >= 60) {
		
			System.out.println("�հ��Դϴ�.");
		
		} else {
			
			System.out.println("���հ��Դϴ�.");
		}
		System.out.println("���α׷��� ���� �մϴ�.");
	}
}