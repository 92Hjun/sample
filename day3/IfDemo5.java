import java.util.Scanner;

public class IfDemo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1:커피(1500원)  2:과일주스(2000원)  3:이온음료(1000원)");
		System.out.print("금액을 입력하세요 :");
		int money = sc.nextInt();
		System.out.print("메뉴를 선택하세요(1~3번) :");
		int no = sc.nextInt();

		int returnCoin = 0;
		if (no == 1) {
			System.out.println("커피를 받아가세요");
			returnCoin = money - 1500;
		} else if (no == 2) {
			System.out.println("과일주스를 받아가세요");
			returnCoin = money - 2000;
		} else if (no == 3) {
			System.out.println("이온음료를 받아가세요");
			returnCoin = money - 1000;
		} else {
			System.out.println("번호를 잘못 선택하셨습니다.");
		} 
		System.out.println("거스름돈 : " + returnCoin + "원");
	}
}