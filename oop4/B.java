public class B {
	int x;
	static int y;

	public void m1() {
		System.out.println(x);
		System.out.println(y);
	}

	// static �޼ҵ忡���� non-static ������ ����� �� ����.
	// this�� ����� ������.
	public static void m2() {
		// System.out.println(x); // ������ ����(x�� ��ü�� ������ �Ŀ��� ��� �����ϱ� �����̴�.
		// ���� �ڱ⵵ ���� �� �ð� ��İ� ����� �Ͱ� ����.
		System.out.println(y);
	}

	public void m3() {
		m1();
		m2();
	} // m3�� �Ϲ� �޼ҵ� �̹Ƿ� ��ü ������ �� �� ��� �����ϱ� ������ ������ �ƴϴ�.

	// static �޼ҵ忡���� non-static �޼ҵ带 ����� �� ����.
	public static void m4() {
		// m1();
		m2();
	} // m1�� ��ü ������ �� �� ����� �����ϱ� ������ static �޼ҵ�δ� ����� �� ����. 
}