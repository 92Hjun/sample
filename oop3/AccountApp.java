public class AccountApp {
	public static void main(String[] args) {
		Account a = new Account("ȫ�浿", "11-222-3333", 1234, 1000000);

		// System.out.println(" ������ : " + a.owner);
		// System.out.println("���¹�ȣ: " + a.accountNumber);
		// System.out.println("��й�ȣ: " + a.password);
		// System.out.println("�ܾ���ȸ: " + a.balance); ��ü �ʵ� ������ private ������ �̹Ƿ� ���� ������ ����

		System.out.println("������ : " + a.getOwner());
		a.info();
	}
}