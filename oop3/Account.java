public class Account {
	private String owner;
	private String accountNumber;
	private int password;
	private int balance;

	public Account(String owner, String accountNumber, int password, int balance) {
		this.owner = owner;
		this.accountNumber = accountNumber;
		this.password = password;
		this.balance = balance;
	}
	// 기능의 단위는 최대한으로 작게해라.
	public String getOwner() {
		return owner;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	// 기능 공개하기
	public void info() {
		System.out.println("이름 계좌번호 비밀번호 잔액");
		System.out.printf("%s %3s %4d %d\n", owner, accountNumber, password, balance);
	}
}