import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account acc = new Account();
		Account[] account = new Account[100];

		int	currentPosition = 0;

		for(;;) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("1.등록  2.조회  3.비번변경  4.입금  5.출금  6.종료\n");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("번호를 선택하세요 >");
			int menuNo = sc.nextInt();

			if(menuNo ==1) {

				account[currentPosition] = new Account();
				System.out.print("고객번호를 입력하세요 >");
				account[currentPosition].setNo(sc.nextInt());
				System.out.print("이름을 입력하세요 >");
				account[currentPosition].setName(sc.next());
				System.out.print("계좌번호를 입력하세요 >");
				account[currentPosition].setNumber(sc.next());
				System.out.print("비밀번호를 입력하세요 >");
				account[currentPosition].setPassword(sc.nextInt());
				System.out.print("입금할 금액을 입력하세요 >");
				account[currentPosition].setBalance(sc.nextInt());
				currentPosition++;				

			} else if (menuNo ==2){
				System.out.print("고객 번호를 입력하세요 >");
				currentPosition = (sc.nextInt()-1);
				System.out.println("##########정보 조회##########");
				System.out.println("이    름: " + account[currentPosition].getName());
				System.out.println("계좌번호: " + account[currentPosition].getNumber());
				System.out.println("잔    액: " + account[currentPosition].getBalance());
			
			} else if (menuNo ==3){
				System.out.print("고객 번호를 입력하세요 >");
				currentPosition = (sc.nextInt()-1);
				System.out.print("현재 비밀번호를 입력하세요 >");
				if(account[currentPosition].getPassword() == sc.nextInt()) {
					System.out.print("변경할 비밀번호를 입력하세요 >");
					account[currentPosition].setPassword(sc.nextInt());
				} else {
					System.out.println("비밀번호가 틀립니다");
				}			
			} else if (menuNo ==4){
				System.out.print("고객 번호를 입력하세요 >");
				currentPosition = (sc.nextInt()-1);
				System.out.print("비밀번호를 입력하세요 >");
				if(account[currentPosition].getPassword() == sc.nextInt()) {
					System.out.print("입금할 금액을 입력하세요 >");
					int total = sc.nextInt();
					total += account[currentPosition].getBalance();
					account[currentPosition].setBalance(total);
					System.out.println("현재 잔액은 " + account[currentPosition].getBalance() + "원 입니다.");
				} else {
					System.out.println("비밀번호가 틀립니다");
				}
			} else if (menuNo ==5){
				System.out.print("고객 번호를 입력하세요 >");
				currentPosition = (sc.nextInt()-1);
				System.out.print("비밀번호를 입력하세요 >");
				if(account[currentPosition].getPassword() == sc.nextInt()) {
					System.out.print("출금할 금액을 입력하세요 >");
					int minus = sc.nextInt();
					if(minus > account[currentPosition].getBalance()){
						System.out.println("잔액이 부족합니다.");
					} else {
						minus -= account[currentPosition].getBalance();
						account[currentPosition].setBalance(minus);
						System.out.println("현재 잔액은 " + account[currentPosition].getBalance() + "원 입니다.");
					}
				} else {
					System.out.println("비밀번호가 틀립니다");
				}
			
			} else if (menuNo ==6){
				System.out.println("프로그램을 종료합니다.");
				break;			
			} else {
				System.out.println("올바른 번호를 입력하세요.");
			}
		}
	}
}