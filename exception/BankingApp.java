public class BankingApp {
	public static void main (String[] args) {
		// Banking 클래스에서 정의한 필드에 값을 먼저 대입을 해준다.
		Banking banking = new Banking("홍길동", "11-1111", "1234", 1000000, false);
		
		try{
			// Banking 클래스에있는 changePassword 메소드를 호출하여 실행을 하는데 원래 적었던 비밀번호랑 다르게 적는다.
			banking.changePassword("1231", "2222");
			
			int money = banking.withdraw("2222", 200000000);
		}	// 비밀번호가 달랐을때 실행하는 BankingException 이 e객체에 담겨지게 된다.
			catch (BankingException e) {
			// e객체에 있는 getMessage를  errerMessage에 담아서 화면에 표시된다.
			String errerMessage = e.getMessage();
			String errorCode = e.getErrorCode();
			System.out.println("오류 메세지: " + errerMessage + " ["+errorCode+"]");
		}
	}
}