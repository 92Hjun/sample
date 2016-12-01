public class Banking {
	private String owner;
	private String accountNumber;
	private String password;
	private int balance;
	private boolean lock;
	

	public Banking (String owner, String accountNumber, String password, int balance, boolean lock) {
		this.owner = owner;
		this.accountNumber = accountNumber;
		this.password = password;
		this.balance = balance;
		this.lock = lock;
	
	}
	// �������� �߻��Ǵ� ������ ������ ���ܸ� �߻� �����ش�.
	public void changePassword (String oldPassword, String newPassword) throws BankingException {
		if (password.equals(oldPassword)) {
			password = newPassword;
		} else{
			throw new BankingException("��й�ȣ ���� ���� [��й�ȣ ����ġ]");
		}
	}
		
	public void fireAccount (String password) throws BankingException {
		if (this.password.equals(password)) {
			// ���� �����ϰ� �ϱ�.
			lock = true;
		} else {
			throw new BankingException("���� ���� ���� [ ��й�ȣ ����ġ ]");
		}
	}
		
	public int withdraw (String password, int amount) throws BankingException {
		int withdrawAmount = 0;
		
		// �������� �߻��Ǵ� ��츦 �̸� �����Ͽ� if���� ���ؼ� ���� �������ش�.
		if (lock) {
			throw new BankingException("��� �� ���� [������ �����Դϴ�.]");
		}
		if (!this.password.equals(password)) {
			throw new BankingException("��� �� ���� [��й�ȣ ����ġ]");
		}
		if ( balance < amount) {
			throw new BankingException("��� �� ���� [�ܾ� ����]");
		}
		
		balance -= amount;
		withdrawAmount = amount;

		return amount;
	}
}