public class MethodDemo1 {
	
	// �޼ҵ� ����(����)
	public static void a() {
		System.out.println("����ڰ� ������ a�޼ҵ��Դϴ�.");	
	}

	public static void b(int x) {
		System.out.println("b �޼ҵ尡 ����Ǿ����ϴ�.");
		System.out.println("b �޼ҵ� ����� ���޹��� ��: " + x);
		System.out.println("--------------------------------------");
	}

	public static void c(String str) {
		System.out.println("c �޼ҵ尡 ����Ǿ����ϴ�.");
		System.out.println("c �޼ҵ� ����� ���޹��� ��: " + str);
		System.out.println("--------------------------------------");
	}
	
	public static void d(int x, int y) {
		System.out.println("d �޼ҵ尡 ����Ǿ����ϴ�.");
		System.out.println("d �޼ҵ尡 ����� ���޹��� ��: " + x + "," + y);
	}

	public static void e(String name, String email, int age) {
		System.out.println("e �޼ҵ尡 ����Ǿ����ϴ�.");
		System.out.println("e �޼ҵ尡 ����� ���޹��� ��: " + name);
		System.out.println("e �޼ҵ尡 ����� ���޹��� ��: " + email);
		System.out.println("e �޼ҵ尡 ����� ���޹��� ��: " + age);
		System.out.println("---------------------------------------");
	}

	public static void main(String[] args) {
		// �޼ҵ� ȣ��(����)
		// a();
		// �Ű������� �ִ� �޼ҵ� ȣ��
		b(100);
		int k = 20;
		b(k);
		//b(); ������ ����, b �޼ҵ带 �����ϱ� ���ؼ��� �ݵ�� ������ �ϳ��� ���޵Ǿ�� �Ѵ�.

		c("�� �� ����.");
		c("�ȳ�, "+"���� ȫ�浿�̶�� �մϴ�.");

		d(1000, 2000);
		int i = 10;
		int j = 20;
		d(i, j);

		e("ȫ�浿", "hong@gmail.com", 23);
		e("������", "kim@gmail.conm", j);
	}
}