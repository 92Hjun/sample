public class Account {
	/*은행 계좌를 표현하는 클래스
		-속성
			예금주
			계좌번호
			비밀번호
			잔액*/

	String owner;
	String accountNumber;
	int password;
	int balance;
	
	public int withdraw2(int amount, int pwd) {
		if (password != pwd) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return 0;
		}

		if (balance < amount) {
			System.out.println("잔액이 부족합니다");
			return 0;
		}
		balance -= amount;
		System.out.println("출금 후 잔액 : " + balance);
		return amount;
	}
		//-기능

			/* 출금기능 - 금액과 비밀번호를 전달받아서
			 개설시 입력한 비밀번화와 일치하면
			 입력한 금액만큼의 돈을 반환하고
			 잔액에서 감소하고 화면에 표시한다.*/
	public int withdraw1(int amount, int pwd) {
		int money = 0;

		if(password == pwd) {
			if (balance >= amount) {
				balance -= amount;
				money = amount;
				System.out.println("출금 후 잔액은 " + balance + "원 입니다.");
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		} else {
			System.out.println("일치하지 않는 번호입니다.");
		}
		return money;
	}
			
			/* 입금기능 - 금액을 전달받아서 
			 그 금액만큼 잔액을 증가시키고
			 화면에 현재 잔액을 표시한다.*/

	public void deposit(int amount) {
		
		balance += amount;
		System.out.println("현재 귀하의 잔액은 " + balance + "원 입니다.");
	}


			/* 조회기능 - 화면에 예금주, 계좌번호, 잔액을 표시한다.
			*/
	public void info() {
		System.out.println("###### 계좌 정보 ######");
		System.out.println("예  금  주: " + owner);
		System.out.println("계좌  번호: " + accountNumber);
		System.out.println("잔      액: " + balance);		
	}
}