public class RuntimeExceptionDemo {
	public static void main (String[] args) {
		// NullPointerException
		//		���������� ��ü�� �ּҰ� ��� null�� ����Ǿ� �ִ� ���¿��� �Ӽ��̳� ����� ����� ��� �߻��Ѵ�.
		String str = "abc";
		System.out.println(str.length());

		String[] names = new String[3];
		names[0] = "ȫ�浿";
		names[1] = "������";

		for (String name : names) {
			/*
			if (name != null) {
				System.out.println(name + ", " + name.length());	
			}
			*/
			System.out.println(name == null ? "����" : name);
		}
	}
}