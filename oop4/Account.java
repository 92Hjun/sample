/*
banking program
1. 계좌등록 기능 // 이름, 비밀번호, 최초 입금액을 입력받아 계좌를 생성한다.
2. 조회 기능 // 이름, 계좌번호, 잔액을 표시한다.
3. 비밀번호 변경 기능 // 예전 비밀번호와 새 비밀번호를 입력받아 비밀번호를 변경한다.
4. 입금 기능 // 입금액을 입력 받아 잔액을 증가시킨다.
5. 출금 기능 // 출금액과 비밀번호를 입력 받아 잔액을 감소시킨다.


*/
public class Account {

	private int no;
	private String name;
	private int password;
	private int balance;
	private String number;
	
	public Account() {}

	public int getNo(){
		return no;
	}
	public void setNo(int no){
		this.no = no;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;

	}
	public int getPassword(){
		return password;
	}
	public void setPassword(int password){
		this.password = password;
	}

	public int getBalance(){
		return balance;
	}
	public void setBalance(int balance){
		this.balance = balance;
	}

	public String getNumber(){
		return number;
	}
	public void setNumber(String number){
		this.number = number;
	}
	// 1. 계좌등록 기능 // 이름, 비밀번호, 최초 입금액을 입력받아 계좌를 생성한다.

	// 2. 조회 기능 // 이름, 계좌번호, 잔액을 표시한다.

	// 3. 비밀번호 변경 기능 // 예전 비밀번호와 새 비밀번호를 입력받아 비밀번호를 변경한다.

	// 4. 입금 기능 // 입금액을 입력 받아 잔액을 증가시킨다.

	// 5. 출금 기능 // 출금액과 비밀번호를 입력 받아 잔액을 감소시킨다.

	



}