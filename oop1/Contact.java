public class Contact {
	// �Ӽ� �����ϱ�
	
	// ����
	// �̸�
	// ����ó
	// �̸���
	int no;
	String name;
	String phoneNum;
	String email;
	
	// ��� �����ϱ�

	// ��ȭ�ϱ�
	public void call() {
		System.out.println(phoneNum+ "�� ������ �մϴ�.");
	
	}
	
	// ���ں�����
	public void sendMessage() {
		System.out.println(phoneNum + "�� ���ڸ� �����ϴ�.");

	}	
	// ���Ϻ�����
	public void sendMail() {
		System.out.println(email + "�� ������ �����ϴ�.");

	}
}