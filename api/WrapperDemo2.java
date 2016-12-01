public class WrapperDemo2 {
	public static void main(String[] args) {
		
		// Integer�� ���� �޼ҵ�

		// ���ڿ��� int������ ��ȯ�ϴ� �޼ҵ� : int parseInt(String text)
		int num1 = Integer.parseInt("123");		// ���� "123"�� ���� 123���� ��ȯ�Ѵ�.
		System.out.println("num1:" + num1);

		int num2 = Integer.parseInt("1100", 2);	// 2�����ε� 11�� 10������ ��ȯ�Ѵ�.
		System.out.println("num2:" + num2);

		int num3 = Integer.parseInt("a", 16);	// 16�����ε� char a�� int�� ��ȯ�Ѵ�.
		System.out.println("num3:" + num3);

		String str1 = Integer.toBinaryString(12);	// ���� 12�� 2������ ��ȯ�Ѵ�.
		System.out.println("str1:" + str1);

		String str2 = Integer.toHexString(12345);	// ���� 12345�� 16������ ��ȯ�Ѵ�.
		System.out.println("str2:" + str2);

		double dou1 = Double.parseDouble("3.14");	// ���� "3.14"�� ������ 3.14�� ��ȯ�Ѵ�.
		System.out.println(dou1 * 2);
	}
}
