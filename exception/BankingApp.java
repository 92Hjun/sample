public class BankingApp {
	public static void main (String[] args) {
		// Banking Ŭ�������� ������ �ʵ忡 ���� ���� ������ ���ش�.
		Banking banking = new Banking("ȫ�浿", "11-1111", "1234", 1000000, false);
		
		try{
			// Banking Ŭ�������ִ� changePassword �޼ҵ带 ȣ���Ͽ� ������ �ϴµ� ���� ������ ��й�ȣ�� �ٸ��� ���´�.
			banking.changePassword("1231", "2222");
			
			int money = banking.withdraw("2222", 200000000);
		}	// ��й�ȣ�� �޶����� �����ϴ� BankingException �� e��ü�� ������� �ȴ�.
			catch (BankingException e) {
			// e��ü�� �ִ� getMessage��  errerMessage�� ��Ƽ� ȭ�鿡 ǥ�õȴ�.
			String errerMessage = e.getMessage();
			String errorCode = e.getErrorCode();
			System.out.println("���� �޼���: " + errerMessage + " ["+errorCode+"]");
		}
	}
}