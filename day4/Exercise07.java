import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {

		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println("-------------------------------------");
			System.out.println("[1]�Ա� | [2]��� | [3]�ܰ� | [4]����");
			System.out.println("-------------------------------------");
			System.out.print("��ȣ�� �����ϼ��� >");
			int num = sc.nextInt();

			if( num == 1) { 
				System.out.print("�Ա��� �ݾ��� �Է��ϼ��� > ");
				int in = sc.nextInt();
				balance += in;
				System.out.println("���� �ܰ�� " + balance + "�� �Դϴ�.");
				
			} else if( num == 2) {
				System.out.print("����� �ݾ��� �Է��ϼ��� > ");
				int out = sc.nextInt();
				
				if( balance<out ) {
					System.out.println("�ܰ� �����մϴ�. ���� �ܰ�� " + balance + "�� �Դϴ�.");
				} else if (balance>=out) {
					balance -= out;
					System.out.println("���� �ܰ�� " + balance + "�� �Դϴ�.");
				}

			} else if( num == 3) {
				System.out.println("���� �ܰ�� " + balance + "�� �Դϴ�.");

			} else if( num == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;

			} else {
				System.out.println("��ȣ�� �ٽ� �Է��ϼ���.");
			}
		}
	}	
}