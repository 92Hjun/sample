import java.util.*;

public class IfDemo2 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� �ϼ��� : ");
		int score = sc.nextInt();

		if (score >= 95) {
			System.out.println("A+ �Դϴ�.");
			if (score >= 98) {
				System.out.println("���б��� �����մϴ�.");
			}
		} else if (score >=90) {
			System.out.println("A �Դϴ�.");
		} else if (score >=85) {
			System.out.println("B+ �Դϴ�.");
		} else if (score >=80) {
			System.out.println("B �Դϴ�.");
		} else if (score >=75) {
			System.out.println("C+ �Դϴ�.");
		} else if (score >=70) {
			System.out.println("C �Դϴ�.");
		} else {
			System.out.println("F �Դϴ�.");
		}

	}
}