import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {

		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println("-------------------------------------");
			System.out.println("[1]입금 | [2]출금 | [3]잔고 | [4]종료");
			System.out.println("-------------------------------------");
			System.out.print("번호를 선택하세요 >");
			int num = sc.nextInt();

			if( num == 1) { 
				System.out.print("입금할 금액을 입력하세요 > ");
				int in = sc.nextInt();
				balance += in;
				System.out.println("현재 잔고는 " + balance + "원 입니다.");
				
			} else if( num == 2) {
				System.out.print("출금할 금액을 입력하세요 > ");
				int out = sc.nextInt();
				
				if( balance<out ) {
					System.out.println("잔고가 부족합니다. 현재 잔고는 " + balance + "원 입니다.");
				} else if (balance>=out) {
					balance -= out;
					System.out.println("현재 잔고는 " + balance + "원 입니다.");
				}

			} else if( num == 3) {
				System.out.println("현재 잔고는 " + balance + "원 입니다.");

			} else if( num == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;

			} else {
				System.out.println("번호를 다시 입력하세요.");
			}
		}
	}	
}