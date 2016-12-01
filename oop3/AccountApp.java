public class AccountApp {
	public static void main(String[] args) {
		Account a = new Account("홍길동", "11-222-3333", 1234, 1000000);

		// System.out.println(" 예금주 : " + a.owner);
		// System.out.println("계좌번호: " + a.accountNumber);
		// System.out.println("비밀번호: " + a.password);
		// System.out.println("잔액조회: " + a.balance); 객체 필드 변수가 private 제한자 이므로 접근 권한이 없음

		System.out.println("예금주 : " + a.getOwner());
		a.info();
	}
}