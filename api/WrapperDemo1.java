public class WrapperDemo1 {

	public static void main(String[] args) {

		// ���� 23�� ������ �ִ� Integer ��ü�� �����ϴ� a
		Integer a = new Integer(23);		// <--- �ڽ�(Boxing)
		// Integer ��ü�� ������ �������� ��ȯ�ϴ� �޼ҵ� : int intVlaue()
		int	x = a.intValue();				// <--- ��ڽ�(unBoxing)
		double y = a;

		System.out.println("x:" + x);
		System.out.println("y:" + y);


		// ���� 23�� �����ϰ� �ִ� b
		int b = 23;

		Integer c = 20;						// <--- ����ڽ�
		int d = c;							// <--- �����ڽ�
		System.out.println(c);
	}
}
