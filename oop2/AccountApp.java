public class AccountApp {
	public static void main(String[] args) {
		
		Account a1 = new Account();

		a1.owner = "ȫ�浿";
		a1.accountNumber = "11-222-3333";
		a1.password = 1234;
		a1.balance = 1000000;

		a1.withdraw2(500000, 1234);
		a1.info();
	}	
}