public class ColorPrinter extends Printer {

	int dpi; // �ػ�
	
	// �θ�Ŭ����(Printer)�� print() �޼ҵ� ������
	public void print(String text) {
		System.out.println("["+ text + "]�� �÷��� �μ��մϴ�.");

	}

	public void chargeInk() {
		System.out.println("��ũ�� �����մϴ�.");
	}

}