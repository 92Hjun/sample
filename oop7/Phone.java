public class Phone {
	
	String telNumber;

	public void call(String to) {
		System.out.println("[" + telNumber + "]���� [" + to + "]�� ��ȭ�� �̴ϴ�.");
	}

	public void msg(String to, String text) {
		System.out.println("[" + telNumber + "]���� [" + to + "]�� [" + text + "]�� �����ϴ�.");
	}
}