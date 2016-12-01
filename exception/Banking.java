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
			throw new BankingException("��й�ȣ ���� ���� [��й�ȣ ����ġ]", "ERR01");
		}
	}
		
	public void fireAccount (String password) throws BankingException {
		if (this.password.equals(password)) {
			// ���� �����ϰ� �ϱ�.
			lock = true;
		} else {
			throw new BankingException("���� ���� ���� [ ��й�ȣ ����ġ ]","ERR01");
		}
	}
																// throws �� ��ӹ����͸� �����ϴ�,
	public int withdraw (String password, int amount) throws BankingException {
		int withdrawAmount = 0;
		
		// �������� �߻��Ǵ� ��츦 �̸� �����Ͽ� if���� ���ؼ� ���� �������ش�.
		if (lock) {
			throw new BankingException("��� �� ���� [������ �����Դϴ�.]","ERR02");
		}
		if (!this.password.equals(password)) {
			throw new BankingException("��� �� ���� [��й�ȣ ����ġ]","ERR01");
		}
		if ( balance < amount) {
			throw new BankingException("��� �� ���� [�ܾ� ����]","ERR03");
		}
		
		balance -= amount;
		withdrawAmount = amount;

		return amount;
	}
}