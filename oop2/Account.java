public class Account {
	/*���� ���¸� ǥ���ϴ� Ŭ����
		-�Ӽ�
			������
			���¹�ȣ
			��й�ȣ
			�ܾ�*/

	String owner;
	String accountNumber;
	int password;
	int balance;
	
	public int withdraw2(int amount, int pwd) {
		if (password != pwd) {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			return 0;
		}

		if (balance < amount) {
			System.out.println("�ܾ��� �����մϴ�");
			return 0;
		}
		balance -= amount;
		System.out.println("��� �� �ܾ� : " + balance);
		return amount;
	}
		//-���

			/* ��ݱ�� - �ݾװ� ��й�ȣ�� ���޹޾Ƽ�
			 ������ �Է��� ��й�ȭ�� ��ġ�ϸ�
			 �Է��� �ݾ׸�ŭ�� ���� ��ȯ�ϰ�
			 �ܾ׿��� �����ϰ� ȭ�鿡 ǥ���Ѵ�.*/
	public int withdraw1(int amount, int pwd) {
		int money = 0;

		if(password == pwd) {
			if (balance >= amount) {
				balance -= amount;
				money = amount;
				System.out.println("��� �� �ܾ��� " + balance + "�� �Դϴ�.");
			} else {
				System.out.println("�ܾ��� �����մϴ�.");
			}
		} else {
			System.out.println("��ġ���� �ʴ� ��ȣ�Դϴ�.");
		}
		return money;
	}
			
			/* �Աݱ�� - �ݾ��� ���޹޾Ƽ� 
			 �� �ݾ׸�ŭ �ܾ��� ������Ű��
			 ȭ�鿡 ���� �ܾ��� ǥ���Ѵ�.*/

	public void deposit(int amount) {
		
		balance += amount;
		System.out.println("���� ������ �ܾ��� " + balance + "�� �Դϴ�.");
	}


			/* ��ȸ��� - ȭ�鿡 ������, ���¹�ȣ, �ܾ��� ǥ���Ѵ�.
			*/
	public void info() {
		System.out.println("###### ���� ���� ######");
		System.out.println("��  ��  ��: " + owner);
		System.out.println("����  ��ȣ: " + accountNumber);
		System.out.println("��      ��: " + balance);		
	}
}