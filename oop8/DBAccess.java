public abstract class DBAccess {
		
	// �߻�ȭ �޼ҵ�
	public abstract void createdRepository(); // Ŭ������ �߻�ȭ�� �Ǿ���.

	
	// ���� �޼ҵ�
	public void connect() {
		System.out.println("DB�� �����մϴ�");
	}

	// ���� �޼ҵ�
	public void disconnect() {
		System.out.println("DB�� ������ �����մϴ�");
	}
}