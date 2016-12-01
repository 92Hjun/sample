import java.util.Scanner;

public class IfDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1:커피(1500원)  2:과일주스(2000원)  3:이온음료(1000원)");

		// 금액입력받고 -> 메뉴 선택 -> "~음료를 받아가세요" -> 거스름돈은 ~입니다
		System.out.print("메뉴를 선택하세요(1~3번) :");
		int no = sc.nextInt();
		System.out.print("금액을 입력하세요 :");
		int money = sc.nextInt();

		int returnCoin = 0;

		if (no == 1) {
			returnCoin = money-1500;
			if (money < 1500) {
				System.out.println( (1500-money) + "원이 부족합니다.");
			} else {
				System.out.println("커피 받아가세요 잔돈은 " + returnCoin + "원 입니다. 감사합니다.");
			}
		} else if (no == 2) {
				returnCoin = money-2000;
			if (money < 2000) {
				System.out.println( (2000-money) + "원이 부족합니다.");
			} else {
				System.out.println("과일주스 받아가세요 잔돈은 " + returnCoin + "원 입니다. 감사합니다.");
			}
		} else if (no == 3) {
			returnCoin = money-1000;
			if (money < 1000) {
				System.out.println( (1000-money) + "원이 부족합니다.");
			} else {
				System.out.println("이온음료 받아가세요 잔돈은 " + returnCoin + "원 입니다. 감사합니다.");
			}
		} else {
		System.out.println("잘못된 번호를 선택하셨습니다.");
		}
				
		int five = returnCoin/5000;
		int ten = returnCoin/1000;
		int fCoin =(returnCoin - ten*1000)/500;
		int hCoin =(returnCoin - ten*1000)/100;
		int fCent =((returnCoin - ten*1000 - hCoin*100)/50);
		int hCent =((returnCoin - ten*1000 - hCoin*100)/10);

		if (returnCoin >= 5000) {
					System.out.println(" 5천원짜리 : " + five + "장");
					System.out.println(" 1천원짜리 : " + (ten - 5*five)  + "장");
					System.out.println(" 500원짜리 : " + fCoin + "개");
					System.out.println(" 100원짜리 : " + (hCoin - 5*fCoin) + "개");
					System.out.println(" 50원짜리 : " + fCent + "개");
					System.out.println(" 10원짜리 : " + (hCent - 5*fCent)+ "개");
		} else if (no<=3){
			System.out.println(" 1천원짜리 : " + ten + "장");
			System.out.println(" 500원짜리 : " + fCoin + "개");
			System.out.println(" 100원짜리 : " + (hCoin -5*fCoin) + "개");	
			System.out.println(" 50원짜리 : " + fCent + "개");
			System.out.println(" 10원짜리 : " + (hCent - 5*fCent)+ "개");
		}
	}
}